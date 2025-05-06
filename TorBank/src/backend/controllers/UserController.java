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
    
    public static boolean validateName(String name) {
    if (name == null || name.trim().isEmpty() || name.trim().length() < 4) {
        return false;
    }
    
    return name.matches("[a-zA-Z ]+");
}

public static boolean validateAge(String age) {
    try {
        int ageValue = Integer.parseInt(age);
        
        return ageValue >= 18 && ageValue <= 120;
    } catch (NumberFormatException e) {
        return false;
    }
}
 
    public static boolean validateEmail(String email) {
    if (email == null || email.trim().isEmpty()) {
        return false;
    }
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    
    return email.matches(emailRegex);
}

    public static boolean validatePassword(String password) {
    return password != null && password.length() > 4;
}

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

    public static boolean updateEmail(int userId, String newEmail) {
        String sql = "UPDATE users SET email = ? WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, userId);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                email = newEmail;
            }
            
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating user email: " + e.getMessage());
            return false;
        }
    }

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
    
    public static boolean updatePassword(int userId, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, newPassword);
            pstmt.setInt(2, userId);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Error updating user password: " + e.getMessage());
            return false;
        }
    }
    
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

        
    public static boolean emailExists(String email) {
    String sql = "SELECT COUNT(*) FROM users WHERE email = ?";
    
    try (Connection conn = DatabaseConnections.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, email);
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
        return false;
        
    } catch (SQLException e) {
        System.err.println("Error checking email existence: " + e.getMessage());
        return false;
    }
}
    
    public static boolean verifyPassword(int userId, String password) {
        String sql = "SELECT password FROM users WHERE user_id = ?";
        
        try (Connection conn = DatabaseConnections.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                return password.equals(storedPassword);
            }
            return false;
            
        } catch (SQLException e) {
            System.err.println("Error verifying password: " + e.getMessage());
            return false;
        }
    }
    
}