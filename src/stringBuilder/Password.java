package stringBuilder;

public class Password {
	
	public static boolean isGoodPassword(String password) {
		
        if (password == null || password.length() < 8) {
        	System.err.println("Das Passwort sollte mindestens 8 Zeichen lang sein.\n");
        	return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            System.err.println("Das Passwort sollte mindestens einen Großbuchstaben enthalten.\n");
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
        	System.err.println("Das Passwort sollte mindestens einen Kleinbuchstaben enthalten.\n");
        	return false;
        }

        if (!password.matches(".*\\d.*")) {
        	System.err.println("Das Passwort sollte mindestens eine Zahl enthalten.\n");
        	return false;
        }

        if (!password.matches(".*[!@#$%^&*()-_=+\\|\\[{\\]};:'\",<.>/?].*")) {
        	System.err.println("Das Passwort sollte mindestens ein Sonderzeichen enthalten.\n");
        	return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String password = "12345671Ga";
        if (isGoodPassword(password) == true) {
            System.out.println("Das Passwort ist sicher.");
        } else {
            System.out.println("Das Passwort ist nicht sicher.");
        }
    }
}
