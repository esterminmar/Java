import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        System.out.println("***PLANIFICACION FINANCIERA***");
        
        var consola = new Scanner(System.in);
        
        // Solicitar al usuario el saldo actual del capital
        System.out.print("Ingrese el saldo actual del capital : ");
        var saldoActual = consola.nextDouble();
        
        // Definir las cantidades fijas para equipo de cómputo y mobiliario
         var presupuestoComputo = 5000.0;
         var presupuestoMobilario = 2000.0;
        
        // Calcular el préstamo necesario y el nuevo saldo
        var prestamo = 0.0;
        var nuevoSaldo = saldoActual;
        
        if (saldoActual < 0) {
            // Si el saldo es negativo, pedir un préstamo para llegar a U$10,000
            prestamo = 10000.0 - saldoActual;
            nuevoSaldo = 10000.0;
        } else if (saldoActual <= 20000.0) {
            // Si el saldo es positivo pero menor o igual a U$20,000, pedir un préstamo para llegar a U$20,000
            prestamo = 20000.0 - saldoActual;
            nuevoSaldo = 20000.0;
        } else {
            // Si el saldo es mayor a U$20,000, no se necesita préstamo
            prestamo = 0.0;
        }
        
        // Calcular el presupuesto restante después de asignar equipo de cómputo y mobiliario
        var presupuestoRestante = nuevoSaldo - presupuestoComputo - presupuestoMobilario;
        
        // Repartir el presupuesto restante: mitad para insumos y mitad para incentivos
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