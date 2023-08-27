import java.util.*;

public class Email {
    public static boolean tienePuntosExtremos(String email){  // Comprueba si hay puntos al principio o al final del email
        for(int i = 0; i < email.length(); i ++) {
            if (email.charAt(i) == '.' && (i == 0 || i == email.length()-1)) {
               return true;
            }
        } return false;
    }

    public static boolean recorrerEmail(String email){ // Recorrer el email
        int contadorPuntos = 0;
        int contadorArroba = 0;
        for(int i = 0; i < email.length(); i ++) {
            if (email.charAt(i) == '.') {
                contadorPuntos += 1; // Cuenta la cantidad de puntos
            }
            if (email.charAt(i) == '@') {
                contadorArroba += 1; // Cuenta la cantidad de arrobas
            }
        }
        return contadorPuntos > 1 && contadorArroba == 1;
    }

    public static void comprobarEmail(String email) {
        if (recorrerEmail(email) && !email.isEmpty() && email.length() < 320 && !tienePuntosExtremos(email)) {
            System.out.println("El email es válido"); // El email es válido si cumple con las condiciones anteriores
        } else {
            System.out.println("El email es inválido");
        }
    }

    public static void ingresarEmail(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su email: ");
        String email = teclado.nextLine();
        comprobarEmail(email);
    }

    public static void main(String[] args) {
        ingresarEmail();
    }
}