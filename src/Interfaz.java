import java.util.*;

public class Interfaz {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su email: ");
        Email email = new Email(teclado.nextLine());
        email.comprobarEmail();
    }
}
