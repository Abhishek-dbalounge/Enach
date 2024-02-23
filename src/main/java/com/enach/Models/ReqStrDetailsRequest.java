package com.enach.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReqStrDetailsRequest {

    private String checkSum;
    private String customerName;
    private String customerMobileNo;
    private String customerEmailId;
    private String customerAccountNo;
    private String customerStartDate;
    private String customerExpiryDate;
    private String customerDebitAmount;
    private String customerMaxAmount;
    private String customerDebitFrequency;
    private String customerInstructedMemberId;
    private String shortCode;
    private String customerSequenceType;
    private String merchantCategoryCode;
    private String customerReference1;
    private String customerReference2;
    private String channel;
    private String utilCode;
    private String filler1;
    private String filler2;
    private String filler3;
    private String filler4;
    private String filler5;
    private String filler6;
    private String filler7;
    private String filler8;
    private String filler9;
    private String filler10;


}
