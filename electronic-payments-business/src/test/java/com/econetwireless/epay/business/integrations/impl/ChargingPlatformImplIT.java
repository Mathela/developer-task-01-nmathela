/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.integrations.impl;

import com.econetwireless.utils.pojo.INBalanceResponse;
import com.econetwireless.utils.pojo.INCreditRequest;
import com.econetwireless.utils.pojo.INCreditResponse;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nmathela
 */
public class ChargingPlatformImplIT {
    
    public ChargingPlatformImplIT() {
    }

    /**
     * Test of enquireBalance method, of class ChargingPlatformImpl.
     */
    @Test
    public void testEnquireBalance() {
        System.out.println("enquireBalance");
        String partnerCode = "";
        String msisdn = "";
        ChargingPlatformImpl instance = null;
        INBalanceResponse expResult = null;
        INBalanceResponse result = instance.enquireBalance(partnerCode, msisdn);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

      /**
     * Test of credit method, of class CreditsService.
     * This Test Is Dependent on Enquire Balance and Assumes that Enquire Balance is working correctly
     * Steps 
     * 1.Get Balance store as BalanceBeforeCredit
     * 2.Perform Top Up /Credit with $1.00
     * 3.Get BalanceAfterCredit
     * 4. Check that Balance Credit + Credit Amount = BalanceBeforeCredit / or that BalanceAfterCredit is Greater than Balance BeforeCredit.
     */
    @Test
    public void testCreditSubscriberAccount() {
        System.out.println("creditSubscriberAccount");
        INCreditRequest inCreditRequest = null;
        ChargingPlatformImpl instance = null;
        INCreditResponse expResult = null;
        INCreditResponse result = instance.creditSubscriberAccount(inCreditRequest);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
