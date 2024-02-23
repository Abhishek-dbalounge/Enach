package com.enach.Models;

import lombok.Data;

import java.util.Date;

@Data
public class OtpVerifyResponse extends CommonResponse {

    private String custName;
    private String loanNo;
    private String mobileNo;
    private String email;
    private Date startDate;
    private Date expiryDate;
    private Double custDebitAmount;



    public OtpVerifyResponse() {
        this.custName = "";
        this.loanNo = "";
        this.mobileNo = "";
        this.email = "";
        this.startDate = null;
        this.expiryDate = null;
        this.custDebitAmount = null;
    }
}
