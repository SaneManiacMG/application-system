package com.reverside.workflow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyReq {
    private String companyName;
    private String description;
    private String address;
    private String telephone;
    private String email;
    private String url;
    private String industry;
    private int employeeNumber;
}
