import java.util.Scanner;

public class TiendaComputadoras {
    public static void main(String[] args) {
        
         var precioPorComputadora = 500.0;
        
        
        var consola = new Scanner(System.in);
        
        
        System.out.print("Ingrese el número de computadoras que desea adquirir: ");
        var numeroComputadoras = consola.nextInt();
        
        
        var totalSinDescuento = numeroComputadoras * precioPorComputadora;
        
        
        var descuento = 0.0;
        
        if (numeroComputadoras < 5) {
            descuento = totalSinDescuento * 0.10; 
        } else if (numeroComputadoras >= 5 && numeroComputadoras < 10) {
            descuento = totalSinDescuento * 0.20; 
        } else if (numeroComputadoras >= 10) {
            descuento = totalSinDescuento * 0.40; 
        }
        
        
        var totalConDescuento = totalSinDescuento - descuento;
        
        System.out.println("\n---Total de compra de los computadores---");
        System.out.println("\tComputadores seleccionados: " + numeroComputadoras);

        System.out.println("\tTotal sin descuento: U$ " + totalSinDescuento);
        System.out.println("\tDescuento aplicado: U$ " + descuento);
        System.out.println("\tTotal con descuento: U$ " + totalConDescuento);
        
        
        
    }
}
