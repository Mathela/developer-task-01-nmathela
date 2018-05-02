/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.utils;

import com.econetwireless.in.soap.messages.BalanceResponse;
import com.econetwireless.in.soap.messages.CreditRequest;
import com.econetwireless.in.soap.messages.CreditResponse;
import com.econetwireless.utils.pojo.INBalanceResponse;
import com.econetwireless.utils.pojo.INCreditRequest;
import com.econetwireless.utils.pojo.INCreditResponse;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nmathela
 */
public class MessageConvertersIT {
    
    public MessageConvertersIT() {
    }


    /**
     * Test of convert method, of class MessageConverters.
     * Checks if converted request does not lose/truncate data.
     */
    @Test
    public void testConvert_CreditRequest() {
       
        CreditRequest creditRequest = new CreditRequest();
        creditRequest.setAmount(1);
        creditRequest.setMsisdn("0772120256");
        creditRequest.setPartnerCode("hit-recharge");
        creditRequest.setReferenceNumber("123-TEST-REF");
     
        INCreditRequest result = MessageConverters.convert(creditRequest);
        
        assertEquals(creditRequest.getAmount(), result.getAmount());
        assertEquals(creditRequest.getMsisdn(), result.getMsisdn());
        assertEquals(creditRequest.getPartnerCode(), result.getPartnerCode());
    }

    /**
     * Test of convert method, of class MessageConverters.
     */
    @Test
    public void testConvert_CreditResponse() {
       
        CreditResponse creditResponse = new CreditResponse();
        creditResponse.setBalance(1);
        creditResponse.setMsisdn("0772120256");
        INCreditResponse result = MessageConverters.convert(creditResponse);
        assertEquals(creditResponse.getBalance(), result.getBalance());
        assertEquals(creditResponse.getMsisdn(), result.getMsisdn());

    }

    /**
     * Test of convert method, of class MessageConverters.
     */
    @Test
    public void testConvert_BalanceResponse() {
        System.out.println("convert");
        BalanceResponse balanceResponse = new BalanceResponse();
    
        balanceResponse.setAmount(1);
        balanceResponse.setMsisdn("0772120256");
        INBalanceResponse result = MessageConverters.convert(balanceResponse);
        assertEquals(balanceResponse.getAmount(), result.getAmount());
        assertEquals(balanceResponse.getMsisdn(), result.getMsisdn());
       
    }
    
}
