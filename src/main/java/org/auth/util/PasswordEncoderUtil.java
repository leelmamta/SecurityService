package org.auth.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String encode(String raw) {
        return encoder.encode(raw);
    }

    public static boolean matches(String raw, String encoded) {
        return encoder.matches(raw, encoded);
    }
}