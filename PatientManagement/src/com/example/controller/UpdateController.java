package com.example.controller;

import com.example.model.PatientDao;
import com.example.model.PatientDaoImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class UpdateController {

    private PatientDao pDao;

    public UpdateController() {
        this.pDao = new PatientDaoImpl();
    }

    public boolean update(PatientVO p) {

        boolean flag = false;

        try {
            CalcController cc = new CalcController(p);
            this.pDao.updatePatient(p);
            flag = true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            flag = false;
        }

        return flag;
    }
}
