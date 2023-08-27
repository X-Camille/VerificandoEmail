import java.util.*;

public class Email {
    public static void comprobarEmail(String email){
        int contadorPuntos = 0;
        int contadorArroba = 0;
        for(int i = 0; i < email.length(); i ++) {
            if (email.charAt(i) == '.') {
                contadorPuntos += 1;
            }
            if (email.charAt(i) == '@') {
                contadorArroba += 1;
            }
        }
        if(contadorPuntos > 1 && contadorArroba == 1) {
            System.out.println("El email es válido.");
        } else {
            System.out.println("El email es inválido.");
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