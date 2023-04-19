package com.OMEL.controller;


import com.OMEL.model.InvoicePaymentMethod;
import com.OMEL.repository.InvoicePaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "invoicepaymentmethod")
public class InvoicePamentMethodController {

    @Autowired
    private InvoicePaymentMethodRepository dao;

    //(localhost:8080/quatationstatus/list)
    @GetMapping(value = "/list", produces = "application/json")
    public List<InvoicePaymentMethod> paymentMethods(){
        return dao.findAll();
    }
}
