import java.util.Scanner;

public class ReporteHeladeria {
    public static void main(String[] args) {
        System.out.println("***REPORTE SEMANAL DE VENTAS HELADERIA***");
        
        var consola = new Scanner(System.in);
        
        
        var  precioLimon = 2500;
        var  precioNuez = 2800;
        var  precioLulo= 2600;
        var  precioFresa = 2000;
        var  precioCrema = 3000;
        
        
        var cantidadLimon = 0;
        var cantidadNuez = 0;
        var cantidadLulo = 0;
        var cantidadFresa = 0;
        var cantidadCrema = 0;
        
        
        var valorLimon = 0;
        var valorNuez = 0;
        var valorLulo = 0;
        var valorFresa = 0;
        var valorCrema = 0;
        
       
        var continuar = true;
        
        
        while (continuar) {
            
            System.out.print("Ingrese el sabor de la paleta (limon, nuez, lulo, fresa, crema): ");
            var sabor = consola.next();
            
            
            System.out.print("Ingrese la cantidad de paletas vendidas: ");
            var cantidad = consola.nextInt();
            
            
            switch (sabor.toLowerCase()) {
                case "limon":
                    cantidadLimon += cantidad;
                    valorLimon += cantidad * precioLimon;
                    break;
                case "nuez":
                    cantidadNuez += cantidad;
                    valorNuez += cantidad * precioNuez;
                    break;
                case "lulo":
                    cantidadLulo += cantidad;
                    valorLulo += cantidad * precioLulo;
                    break;
                case "fresa":
                    cantidadFresa += cantidad;
                    valorFresa += cantidad * precioFresa;
                    break;
                case "crema":
                    cantidadCrema += cantidad;
                    valorCrema += cantidad * precioCrema;
                    break;
                default:
                    System.out.println("Sabor no válido. Intente nuevamente.");
                    continue; 
            }
            
            
            System.out.print("¿Desea ingresar otra factura? (S/N): ");
            String respuesta = consola.next();
            
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false; 
            }
        }
        
        
        int ventaTotal = valorLimon + valorNuez + valorLulo + valorFresa + valorCrema;
        
        
        System.out.println("\n--- FACTURA DE REPORTE SEMANAL DE VENTAS ---");
        System.out.println("Sabor  |    Cantidad    |  Valor Vendido");
        System.out.println("Limón    \t" + cantidadLimon + "        \t$" + valorLimon);
    System.out.println("Nuez         \t" + cantidadNuez +  "            \t$" + valorNuez);
        System.out.println("Lulo     \t" + cantidadLulo +  "        \t$" + valorLulo);
        System.out.println("Fresa    \t" + cantidadFresa + "        \t$" + valorFresa);
        System.out.println("Crema    \t" + cantidadCrema + "        \t$" + valorCrema);
        System.out.println("----------------------------------");
        System.out.println("Venta Total: $" + ventaTotal);
        
        
    }
}