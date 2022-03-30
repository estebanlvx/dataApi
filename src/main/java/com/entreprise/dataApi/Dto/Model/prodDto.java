package com.entreprise.dataApi.Dto.Model;

public class prodDto {
    boolean prodBool;
    long prodOwnerId;

    public prodDto(boolean prodBool, long prodOwnerId) {
        this.prodBool = prodBool;
        this.prodOwnerId = prodOwnerId;
    }

    public boolean isProdBool() {
        return prodBool;
    }

    public void setProdBool(boolean prodBool) {
        this.prodBool = prodBool;
    }

    public long getprodOwnerId() {
        return prodOwnerId;
    }

    public void setprodOwnerId(long addressOwnerId) {
        this.prodOwnerId = addressOwnerId;
    }
}
