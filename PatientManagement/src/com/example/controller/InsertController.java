package com.example.controller;

import com.example.main.Main;
import com.example.model.PatientDao;
import com.example.model.PatientDaoImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class InsertController {

    private Main main;
    private PatientDao pDao;

    public InsertController() {
        pDao = new PatientDaoImpl();
    }
    public boolean insert(PatientVO p) {

        boolean result = false;

        try {
            CalcController cc = new CalcController(p);
            result = pDao.createPatient(p);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
