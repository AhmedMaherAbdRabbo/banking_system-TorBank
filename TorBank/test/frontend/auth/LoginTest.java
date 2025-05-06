package frontend.auth;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import backend.controllers.UserController;
import backend.connections.DatabaseConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Unit tests for the Login functionality
 */
public class LoginTest {

    @Before
    public void setUp() {
        // Initialize any necessary test setup
    }

    @Test
    public void testEmptyCredentials() {
        assertFalse("Empty email should be invalid", 
                UserController.validateEmail(""));
        
        assertFalse("Empty password should be invalid", 
                UserController.validatePassword(""));
    }

}