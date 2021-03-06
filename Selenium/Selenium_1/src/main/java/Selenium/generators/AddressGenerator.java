package Selenium.generators;

public class AddressGenerator extends RandomGenerator {

    private static String[] countries = { "Belgium", "Brazil", "China",
            "Czech Republic", "France", "India",
            "Italy" };

    public static String generateCity(){
        return capitalize(generateRandomString(7));
    }

    public static String generateState(){
        return capitalize(generateRandomString(9));
    }

    public static String generateStreetAddress(){
        int number = generateRandomNumber(4, 250);
        String street = capitalize(generateRandomString(12));
        return number + " " + street;
    }

    public static String pickCountry(){
        int index = generateRandomNumber(0, countries.length - 1);
        return countries[index];
    }

    public static String generatePostalCode(){
        int firstHalf = generateRandomNumber(10, 99);
        int secondHalf = generateRandomNumber(100, 999);
        return firstHalf + "-" + secondHalf;
    }
}
