package com.reverside.workflow.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reverside.workflow.models.Company;
import com.reverside.workflow.models.CompanyReq;


@RestController
public class Register {
    
    @PostMapping("/register")
    public Company postMethodName(@RequestBody CompanyReq companyReq) {
        //TODO: process POST request
        System.out.println(companyReq.toString());
        
        // Company companyRes = (Company) companyReq;
        Company companyRes = new Company();
        companyRes.setCompanyName(companyReq.getCompanyName());
        companyRes.setAddress(companyReq.getAddress());
        companyRes.setDescription(companyReq.getDescription());
        companyRes.setEmail(companyReq.getEmail());
        companyRes.setEmployeeNumber(companyReq.getEmployeeNumber());
        companyRes.setIndustry(companyReq.getIndustry());
        companyRes.setUrl(companyReq.getUrl());
        companyRes.setTelephone(companyReq.getTelephone());

        companyRes.setRegisteredDateTime(LocalDateTime.now());
        System.out.println(companyRes.toString());

        return companyRes;
    }
    
}
