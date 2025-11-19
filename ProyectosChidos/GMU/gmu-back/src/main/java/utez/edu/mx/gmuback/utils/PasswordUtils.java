package utez.edu.mx.gmuback.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

public class PasswordUtils {
    private static String encodePassword(String raw){
        return new BCryptPasswordEncoder().encode(raw);
    }

    public static boolean matchPassword(String raw, String encoded){
        return new BCryptPasswordEncoder().matches(raw, encoded);
    }

    public static String generateEncodedPassword(String username, String fullname){
        String raw = fullname.charAt(0) + username + LocalDateTime.now().getYear();
        System.out.println(raw);
        return encodePassword(raw);
    }

    public static void main(String[] args) {
        generateEncodedPassword("LeoDoCa", "Leonardo Daniel Dorantes Castañeda");
    }
}
