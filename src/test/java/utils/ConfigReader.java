package utils;

public class ConfigReader {

    public static String getUsername() {
        String envVal = System.getenv("SAUCEDEMO_USERNAME");
        if (envVal != null && !envVal.isEmpty()) {
            return envVal;
        }
        return "standard_user";
    }

    public static String getPassword() {
        String envVal = System.getenv("SAUCEDEMO_PASSWORD");
        if (envVal != null && !envVal.isEmpty()) {
            return envVal;
        }
        return "secret_sauce";
    }
}