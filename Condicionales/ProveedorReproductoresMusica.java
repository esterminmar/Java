import java.util.Scanner;

public class ProveedorReproductoresMusica {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        
        
        System.out.print("Ingrese el precio sin IVA del aparato: ");
        var precioSinIVA = consola.nextDouble();
        consola.nextLine();
        
        System.out.print("Ingrese la marca del aparato: ");
        var marca = consola.nextLine();
        
        
        var IVA = 0.19; 
        
        
        var descuentoPrecio = 0.0;
        if (precioSinIVA >= 500) {
            descuentoPrecio = precioSinIVA * 0.10; 
        }
        
        
        var descuentoMarca = 0.0;
        if (marca.equalsIgnoreCase("NOSY")) {
            descuentoMarca = precioSinIVA * 0.05; 
        }
        
        
        var precioConDescuentos = precioSinIVA - descuentoPrecio - descuentoMarca;
        
        
        var iva = precioConDescuentos * IVA;
        
        
        var totalPagar = precioConDescuentos + iva;
        
        // Mostrar los resultados
        System.out.println("\n***TOTAL A PAGAR***");
        System.out.println("\tPrecio sin IVA: U$" + precioSinIVA);
        System.out.println("\tDescuento por precio (10%): U$" + descuentoPrecio);
        System.out.println("\tDescuento por marca (5%): U$" + descuentoMarca);
        System.out.println("\tPrecio con descuentos: U$" + precioConDescuentos);
        System.out.println("\tIVA (19%): U$" + iva);
        System.out.println("\tTotal a pagar: U$" + totalPagar);
        
        
    }
}