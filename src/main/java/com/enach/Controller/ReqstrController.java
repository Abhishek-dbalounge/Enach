package com.enach.Controller;


import com.enach.Entity.ReqStrDetails;
import com.enach.Models.CommonResponse;
import com.enach.Models.ReqStrDetailsRequest;
import com.enach.Models.ReqStrDetailsResponse;
import com.enach.Service.ReqstrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/eNach")
@CrossOrigin
public class ReqstrController {

    @Autowired
    private ReqstrService reqstrService;


    @GetMapping("/msgId")
    public ResponseEntity<String> msgId() {
        CommonResponse commonResponse = new CommonResponse();
        String finalMsgId = "";
        String msg1 = "SUBH";
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
            String dateString=sdf.format(new Date());
            finalMsgId = msg1+dateString;
            commonResponse.setMsg(finalMsgId);
            commonResponse.setCode("0000");
        }
        catch (Exception ex) {
            commonResponse.setMsg("Please try again.");
            commonResponse.setCode("1111");
        }
        return new ResponseEntity(commonResponse, HttpStatus.OK);
    }



    @PostMapping("/reqStrDetailsData")
    public ResponseEntity<ReqStrDetailsResponse> reqStrDetailsData(@RequestBody ReqStrDetailsRequest request) {
        ReqStrDetailsResponse reqStrDetailsResponse = new ReqStrDetailsResponse();


        if (request.getCheckSum() != null || request.getCustomerName() != null || request.getCustomerMobileNo() != null || request.getCustomerEmailId() != null ||
                request.getCustomerAccountNo().isEmpty() || request.getCustomerStartDate().isEmpty() || request.getCustomerDebitAmount() != null || request.getCustomerMaxAmount() != null) {

            reqStrDetailsResponse.setMsg("Required field is empty.");
            reqStrDetailsResponse.setCode("1111");
        } else {
            try {

                ReqStrDetails reqStrDetails = reqstrService.reqStrDetailsData(request.getCheckSum(), request.getCustomerName(), request.getCustomerMobileNo() ,request.getCustomerEmailId(), request.getCustomerAccountNo(),request.getCustomerStartDate(), request.getCustomerDebitAmount(),request.getCustomerMaxAmount());


            } catch (Exception e) {
                reqStrDetailsResponse.setMsg("something went worng.");
                reqStrDetailsResponse.setCode("1111");
            }
        }
        return new ResponseEntity<>(reqStrDetailsResponse, HttpStatus.OK);
    }

}
