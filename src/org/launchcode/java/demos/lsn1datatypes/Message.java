package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        return switch (lang) {
            case "sp" -> "¡Hola, Mundo!";
            case "fr" -> "Bonjour, le Monde!";
            case "en" -> "Hello, World!";
            default -> "!";
        };
    }
}
