package frontend.auth;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import backend.controllers.UserController;

/**
 * Simple unit test for the Register class focusing only on functionality
 * that can be tested without UI initialization concerns.
 */
public class RegisterTest {
    
    @Test
    public void testValidations_ValidInput() {
        // Changed the name to a simpler one without special characters
        assertTrue("Valid name should pass validation", 
                UserController.validateName("Ahmed Maher"));
        
        assertTrue("Valid age should pass validation", 
                UserController.validateAge("25"));
        
        assertTrue("Valid email should pass validation", 
                UserController.validateEmail("Ahmed@gmail.com"));
        
        assertTrue("Valid password should pass validation", 
                UserController.validatePassword("Mohamed12345"));
    }
    
    @Test
    public void testValidations_InvalidInput() {
        assertFalse("Name with less than 4 characters should fail", 
                UserController.validateName("Mo"));
        
        assertFalse("Age under 18 should fail", 
                UserController.validateAge("12"));
        
        assertFalse("Non-numeric age should fail", 
                UserController.validateAge("abc"));
        
        assertFalse("Invalid email format should fail", 
                UserController.validateEmail("invalid-email"));
        
        assertFalse("Password with less than 4 characters should fail", 
                UserController.validatePassword("123"));
    }
}