import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        System.out.println("***PLANIFICACION FINANCIERA***");
        
        var consola = new Scanner(System.in);
        
        System.out.print("Ingrese el saldo actual del capital : ");
        var saldoActual = consola.nextDouble();
        
         var presupuestoComputo = 5000.0;
         var presupuestoMobilario = 2000.0;
        
        var prestamo = 0.0;
        var nuevoSaldo = saldoActual;
        
        if (saldoActual < 0) {
            prestamo = 10000.0 - saldoActual;
            nuevoSaldo = 10000.0;
        } else if (saldoActual <= 20000.0) {
            prestamo = 20000.0 - saldoActual;
            nuevoSaldo = 20000.0;
        } else {
            prestamo = 0.0;
        }
        
        
        var presupuestoRestante = nuevoSaldo - presupuestoComputo - presupuestoMobilario;
        
        
        var insumosAlPersonal = presupuestoRestante / 2;
        var incentivosAlPersonal = presupuestoRestante / 2;
        
        System.out.println("\n---CANTIDAD TOTAL---");
        if (prestamo > 0) {
            System.out.println("Se pedira un prestamo de: U$" + prestamo);
        } else {
            System.out.println("No se necesita pedir un prestamo.");
        }
        
        System.out.println("Cantidad destinada para insumos: U$" + insumosAlPersonal);
        System.out.println("Cantidad destinada para incentivos al personal: U$" + incentivosAlPersonal);
}
}