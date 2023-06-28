package Checks;

public class ValidationUtilities {
    public  static String validateString (String value, String substitution){
        return (value == null || value.isBlank() ) ? substitution : value;
    }
    public static Boolean  validateBoolean (Boolean value){
        return value != null && value;
    }
}