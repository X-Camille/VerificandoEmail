import java.util.*;

public class Email {
    // Atributos de la clase Email
    private String email;

    // Método constructor
    public Email(String correo){
        email = correo;
    }

    public String getEmail(){
        return email;
    }

    public boolean tienePuntosExtremos(){  // Comprueba si hay puntos al principio o al final del email
        for(int i = 0; i < email.length(); i ++) {
            if (email.charAt(i) == '.' && (i == 0 || i == email.length()-1)) {
               return true;
            }
        } return false;
    }

    public boolean recorrerEmail(){ // Recorrer el email
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

    public void comprobarEmail() {
        if (recorrerEmail() && !email.isEmpty() && email.length() < 320 && !tienePuntosExtremos()) {
            System.out.println("El email es válido"); // El email es válido si cumple con las condiciones anteriores
        } else {
            System.out.println("El email es inválido");
        }
    }


    public void main(String[] args) {
        comprobarEmail();
    }

}