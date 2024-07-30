package com.example.controller;

import com.example.model.PatientDao;
import com.example.model.PatientDaoImpl;

import java.sql.SQLException;

public class DeleteController {

    private PatientDao dao;

    public DeleteController() {

        this.dao = new PatientDaoImpl();

    }

    public boolean delete(int number) {

        boolean isSucess = false;

        try {
            isSucess = this.dao.deletePatient(number);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return isSucess;
    }
}
