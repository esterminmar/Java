import java.util.Scanner;

public class Serviteca {
    public static void main(String[] args) {
        System.out.println("*** SERVITECA DE LLANTAS ***");
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el número de llantas que desea adquirir: ");
        var numeroLlantas = scanner.nextInt();
        
        
        var precioPorLlanta = 0.0;
        
        if (numeroLlantas < 5) {
            precioPorLlanta = 100.0; 
        } else if (numeroLlantas >= 5 && numeroLlantas <= 10) {
            precioPorLlanta = 75.0; 
        } else if (numeroLlantas > 10) {
            precioPorLlanta = 50.0; 
        }
        
        
        var totalPagar = numeroLlantas * precioPorLlanta;
        
        System.out.println("\n---TICKET---");
        System.out.println("\tPrecio por llanta: U$" + precioPorLlanta);
        System.out.println("\tTotal a pagar: U$" + totalPagar);
        
        
        
    }
}
