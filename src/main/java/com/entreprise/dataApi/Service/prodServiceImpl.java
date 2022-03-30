package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.prod;
import com.entreprise.dataApi.repository.prodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("prodService")
public class prodServiceImpl implements prodService{

    @Autowired
    prodRepository prodRepository;

    @Override
    public Optional<prod> get(long prodId) {
        return prodRepository.findById(prodId);
    }

    @Override
    public List<prod> getAll() {
        return prodRepository.findAll();
    }

    @Override
    public Optional<prod> create(boolean prodBool, employee prodOwner) {

        Optional<prod> prodExistWithOwnerId = getByOwnerId(prodOwner.getId());

        if (prodExistWithOwnerId.isPresent()){
            prodExistWithOwnerId.get().setProdBool(prodBool);

            return Optional.of(prodRepository.save(prodExistWithOwnerId.get()));
        }

        prod prod = new prod();
        prod.setProdBool(prodBool);
        prod.setemployee(prodOwner);

        return Optional.of(prodRepository.save(prod));
    }

    @Override
    public Optional<prod> getByOwnerId(long prodOwnerId) {
        return prodRepository.findByemployeeId(prodOwnerId);
    }

}
