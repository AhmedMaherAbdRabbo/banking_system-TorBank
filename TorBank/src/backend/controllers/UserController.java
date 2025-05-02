/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.controllers;

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
    
}
