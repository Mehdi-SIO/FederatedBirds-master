package fr.sio.ecp.federatedbirds.utils;


public class ValidationUtils {

    private static final String LOGIN_PATTERN = "^[A-Za-z0-9_-]{4,12}$";
    private static final String PASSWORD_PATTERN = "^\\w{4,12}$";

    public static boolean validateLogin(String login) {
        return login != null && login.matches(LOGIN_PATTERN);
    }

    public static boolean validatePassword(String password) {
        return password != null && password.matches(PASSWORD_PATTERN);
    }

}
