package com.enach.Models;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerDetails {

    private String custName;
    private String loanNo;
    private String mobileNo;
    private String email;
    private Date startDate;
    private Date expiryDate;
    private Double custDebitAmount;


}
