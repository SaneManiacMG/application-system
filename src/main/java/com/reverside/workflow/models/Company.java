package com.reverside.workflow.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Company extends CompanyReq {
    public Company(String companyName, String description, String address, String telephone, String email, String url,
            String industry, int employeeNumber) {
        super(companyName, description, address, telephone, email, url, industry, employeeNumber);
    }

    private LocalDateTime registeredDateTime;
}
