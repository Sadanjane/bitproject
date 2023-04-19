package com.OMEL.controller;


import com.OMEL.model.SupplierStatus;
import com.OMEL.repository.SupplierStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "supplierstatus")
public class SupplierStatusController {

    @Autowired
    private SupplierStatusRepository dao;

    //(localhost:8080/supplierstatus/list)
    @GetMapping(value = "/list", produces = "application/json")
    public List<SupplierStatus> supplierStatusList(){
        return dao.findAll();
    }
}
