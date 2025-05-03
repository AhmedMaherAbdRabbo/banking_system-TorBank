/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.controllers;

import backend.connections.DatabaseConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import backend.connections.DatabaseConnections;

/**
 *
 * @author DELL
 */
public class UserController {
    
    private static int userId;
    private static String email;
    
    public static void setUserDetails(int id, String mail) {
        userId = id;
        email = mail;
    }
    
    public static int getUserId() {
        return userId;
    }
    
    public static String getEmail() {
        return email;
    }
    
    /**
     * Update the user's name in the database
     * @param userId the ID of the user
     * @param newName the new name to set
     * @return true if successful, false otherwise
     */
    public static boolean updateName(int userId, String newName) {
        String sql = "UPDATE users SET name = ? WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, newName);
            pstmt.setInt(2, userId);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating user name: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Update the user's email in the database
     * @param userId the ID of the user
     * @param newEmail the new email to set
     * @return true if successful, false otherwise
     */
    public static boolean updateEmail(int userId, String newEmail) {
        String sql = "UPDATE users SET email = ? WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, userId);
            
            int rowsAffected = pstmt.executeUpdate();
            
            // Update the static email variable if update was successful
            if (rowsAffected > 0) {
                email = newEmail;
            }
            
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating user email: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Update the user's age in the database
     * @param userId the ID of the user
     * @param newAge the new age to set
     * @return true if successful, false otherwise
     */
    public static boolean updateAge(int userId, int newAge) {
        String sql = "UPDATE users SET age = ? WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, newAge);
            pstmt.setInt(2, userId);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating user age: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Update the user's password in the database
     * @param userId the ID of the user
     * @param newPassword the new password to set (should be encrypted in production)
     * @return true if successful, false otherwise
     */
    public static boolean updatePassword(int userId, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // In a real application, the password should be hashed before storing
            pstmt.setString(1, newPassword);
            pstmt.setInt(2, userId);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating user password: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Update the account type for a specific account
     * @param userId the ID of the user
     * @param accountNumber the account number to update
     * @param accountType the new account type ("Savings" or "Checking")
     * @return true if successful, false otherwise
     */
    public static boolean updateAccountType(int userId, String accountType) {
    String sql = "UPDATE accounts SET account_type = ? WHERE user_id = ?";

    try (Connection conn = DatabaseConnections.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, accountType);
        pstmt.setInt(2, userId);

        int rowsAffected = pstmt.executeUpdate();
        return rowsAffected > 0;

    } catch (SQLException e) {
        System.err.println("Error updating account type: " + e.getMessage());
        return false;
    }
}

    
    /**
     * Verify the user's password
     * @param userId the ID of the user
     * @param password the password to verify
     * @return true if password matches, false otherwise
     */
    public static boolean verifyPassword(int userId, String password) {
        String sql = "SELECT password FROM users WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                // In a real application, this should compare hashed passwords
                return password.equals(storedPassword);
            }
            return false;
            
        } catch (SQLException e) {
            System.err.println("Error verifying password: " + e.getMessage());
            return false;
        }
    }
}