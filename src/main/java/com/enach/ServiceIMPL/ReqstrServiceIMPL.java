package com.enach.ServiceIMPL;

import com.enach.Entity.ReqStrDetails;
import com.enach.Repository.ReqStrDetailsRepository;
import com.enach.Service.ReqstrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReqstrServiceIMPL implements ReqstrService {

    @Autowired
    private ReqStrDetailsRepository reqStrDetailsRepository;


    @Override
    public ReqStrDetails reqStrDetailsData(String checkSum, String customerName, String customerMobileNo, String customerEmailId, String customerAccountNo, String customerStartDate, String customerDebitAmount, String customerMaxAmount) {


        ReqStrDetails reqStrDetails = new ReqStrDetails();
        reqStrDetails.setCheckSum(checkSum);
        reqStrDetails.setMsgId("Abhi12345");
        reqStrDetails.setCustomerName(customerName);
        reqStrDetails.setCustomerMobileNo(customerMobileNo);
        reqStrDetails.setCustomerEmailId(customerEmailId);
        reqStrDetails.setCustomerAccountNo(customerAccountNo);



       // reqStrDetailsRepository.save(reqStrDetails);

        return null;
    }


}
