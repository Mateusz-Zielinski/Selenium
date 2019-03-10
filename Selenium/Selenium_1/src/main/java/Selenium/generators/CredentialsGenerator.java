package Selenium.generators;


public class CredentialsGenerator extends RandomGenerator {
    private static String emailDomain = "@example.com";

    public static String generateFirstname(){
        return capitalize(generateRandomString(8));
    }

    public static String generateLastname(){
        return capitalize(generateRandomString(14));
    }

    public static String generateEmail(){
        String login = generateRandomString(22);
        return login + emailDomain;
    }

    public static String generatePassword(){
        return generateRandomNumber(0, 9) + generateRandomString(12);
    }
}
