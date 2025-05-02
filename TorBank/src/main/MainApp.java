package main;

import frontend.auth.Login;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApp extends JFrame {

    public MainApp() {
        // إعدادات نافذة التطبيق
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // إنهاء التطبيق عند غلق النافذة
        setResizable(true); // منع تغيير حجم النافذة
        setLocation(480, 150); // تحديد موقع النافذة
        setSize(671, 539); // تحديد حجم النافذة
        setTitle("Main App"); // تحديد عنوان النافذة

        // إضافة نافذة تسجيل الدخول
        add(new Login()); // إضافة الـ LoginPanel كجزء من الـ JFrame
    }

    public static void main(String[] args) {
        // تشغيل التطبيق في واجهة المستخدم (واجهة الرسوميات)
        java.awt.EventQueue.invokeLater(() -> {
            new MainApp().setVisible(true); // عرض نافذة MainApp
        });
    }
}
