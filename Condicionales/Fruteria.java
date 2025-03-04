import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de kilos de manzanas comprados: ");
        var kilos = consola.nextDouble();
        
        
        System.out.print("Definir precio por kilo de las manzanas: ");
        var precioPorKilo = consola.nextDouble();
        
        
        var descuento = 0.0;
        
        if (kilos > 10) {
            descuento = 0.20; // 20% de descuento
        } else if (kilos > 5) {
            descuento = 0.15; // 15% de descuento
        } else if (kilos > 2) {
            descuento = 0.10; // 10% de descuento
        } else {
            descuento = 0.0; // 0% de descuento
        }
        
        
        var totalSinDescuento = kilos * precioPorKilo;
        
        
        var conDescuentoAplicado = totalSinDescuento * descuento;
        
        
        var totalPagar = totalSinDescuento - conDescuentoAplicado;
        
        System.out.println("\n\t***TICKET***");
        System.out.println("\tTotal sin descuento: $" + totalSinDescuento);
        System.out.println("\tDescuento aplicado: $" + conDescuentoAplicado);
        System.out.println("\tTotal a pagar: $" + totalPagar);
        
        
        
    }
}