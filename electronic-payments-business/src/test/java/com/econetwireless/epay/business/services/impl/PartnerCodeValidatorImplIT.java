/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.services.impl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nmathela
 */
public class PartnerCodeValidatorImplIT {
    
    public PartnerCodeValidatorImplIT() {
    }

    /**
     * Test of validatePartnerCode method, of class PartnerCodeValidatorImpl.
     */
    @Test
    public void testValidatePartnerCode() {
        System.out.println("validatePartnerCode");
        String partnerCode = "";
        PartnerCodeValidatorImpl instance = null;
        boolean expResult = false;
        boolean result = instance.validatePartnerCode(partnerCode);
        assertEquals(expResult, result);
        
    }
    
}
