package com.bayu.jwt.asymmetric.util;

import lombok.experimental.UtilityClass;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

@UtilityClass
public class KeyGeneratorUtility {

    public static KeyPair generateRsaKey() {
        KeyPair keyPair;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            throw new IllegalStateException();
        }
        return keyPair;
    }

}
