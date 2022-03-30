INSERT INTO EMPLOYEE (id, name, email, created_at) VALUES (100, 'flo ls', 'flo.ls@gmail.com', now());
INSERT INTO EMPLOYEE (id, name, email, created_at) VALUES (101, 'croustimencien lpg', 'croustimencien.lpg@gmail.com', now());
INSERT INTO PROD (id, prod_bool, employee_id) VALUES (201, 'false', 101);
INSERT INTO PROD (id, prod_bool, employee_id) VALUES (202, 'true', 100);
INSERT INTO JOB (id, name, employee_id) VALUES (301, 'RH', 100);
INSERT INTO JOB (id, name, employee_id) VALUES (302, 'PDG', 100);