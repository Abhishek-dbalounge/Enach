package com.enach.Service;

import com.enach.Entity.ReqStrDetails;

public interface ReqstrService {


    ReqStrDetails reqStrDetailsData(String checkSum, String customerName, String customerMobileNo, String customerEmailId, String customerAccountNo, String customerStartDate, String customerDebitAmount, String customerMaxAmount);

}

