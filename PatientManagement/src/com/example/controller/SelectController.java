package com.example.controller;

import com.example.model.PatientDao;
import com.example.model.PatientDaoImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;
import java.util.List;

public class SelectController {

    private PatientDao pDao;

    public SelectController() {

        this.pDao = new PatientDaoImpl();
    }

    public List<PatientVO> selectAllPatient() {

        List<PatientVO> list = null;

        try {
            list = this.pDao.readAllPatient();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
