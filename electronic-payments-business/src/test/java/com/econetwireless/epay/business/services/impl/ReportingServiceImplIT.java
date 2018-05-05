/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.domain.SubscriberRequest;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nmathela
 */
public class ReportingServiceImplIT {
    
    public ReportingServiceImplIT() {
    }

    /**
     * Test of findSubscriberRequestsByPartnerCode method, of class ReportingServiceImpl.
     */
    @Test
    public void testFindSubscriberRequestsByPartnerCode() {
        System.out.println("findSubscriberRequestsByPartnerCode");
        String partnerCode = "";
        ReportingServiceImpl instance = null;
        List<SubscriberRequest> expResult = null;
        List<SubscriberRequest> result = instance.findSubscriberRequestsByPartnerCode(partnerCode);
        assertEquals(expResult, result);
   
    }
    
}
