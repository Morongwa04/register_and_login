/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class PoETest {
    
    public PoETest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isValidSouthAfricanNumber method, of class PoE.
     */
    @Test
    public void testIsValidSouthAfricanNumber() {
        System.out.println("isValidSouthAfricanNumber");
        String phoneNumber = "";
        boolean expResult = false;
        boolean result = PoE.isValidSouthAfricanNumber(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PoE.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PoE.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateMessageID method, of class PoE.
     */
    @Test
    public void testGenerateMessageID() {
        System.out.println("generateMessageID");
        String expResult = "";
        String result = PoE.generateMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateHashID method, of class PoE.
     */
    @Test
    public void testGenerateHashID() {
        System.out.println("generateHashID");
        String messageID = "";
        int messageNumber = 0;
        String expResult = "";
        String result = PoE.generateHashID(messageID, messageNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDisregardedMessages method, of class PoE.
     */
    @Test
    public void testShowDisregardedMessages() {
        System.out.println("showDisregardedMessages");
        PoE.showDisregardedMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadStoredMessages method, of class PoE.
     */
    @Test
    public void testLoadStoredMessages() {
        System.out.println("loadStoredMessages");
        PoE.loadStoredMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayFullReport method, of class PoE.
     */
    @Test
    public void testDisplayFullReport() {
        System.out.println("displayFullReport");
        PoE.displayFullReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySendersRecipients method, of class PoE.
     */
    @Test
    public void testDisplaySendersRecipients() {
        System.out.println("displaySendersRecipients");
        PoE.displaySendersRecipients();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestMessage method, of class PoE.
     */
    @Test
    public void testDisplayLongestMessage() {
        System.out.println("displayLongestMessage");
        PoE.displayLongestMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
