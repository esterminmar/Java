import java.util.Scanner;

public class NivelHemoglobinal {
    public static void main(String[] args) {
        System.out.println("\n***INDICADOR DE ANEMIA***");
        
        var consola = new Scanner(System.in);
        
        
        System.out.print("Ingrese la edad en meses: ");
        var edadMeses = consola.nextInt();
        
       
        System.out.print("Ingrese el nivel de hemoglobina (en g%): ");
        var hemoglobina = consola.nextDouble();
        
        
        var sexo = "";
        if (edadMeses > 180) { 
            System.out.print("Ingrese el sexo (M para mujer y H para hombre): ");
             sexo = consola.next();
        }
        
        
        boolean tieneAnemia = false;
        
        if (edadMeses <= 1) {
            
            if (hemoglobina < 13 || hemoglobina > 26) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 6) {
            
            if (hemoglobina < 10 || hemoglobina > 18) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 12) {
            
            if (hemoglobina < 11 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 60) {
            
            if (hemoglobina < 11.5 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 120) {
            
            if (hemoglobina < 12.6 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 180) {
            
            if (hemoglobina < 13 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else {
            
            if (sexo.equalsIgnoreCase("M")) {
                
                if (hemoglobina < 12 || hemoglobina > 16) {
                    tieneAnemia = true;
                }
            } else if (sexo.equalsIgnoreCase("H")) {
                
                if (hemoglobina < 14 || hemoglobina > 18) {
                    tieneAnemia = true;
                }
            } else {
                System.out.println("Sexo no válido.");
                return; 
            }
        }
        
        System.out.println("\n----RESULTADOS----");
        if (tieneAnemia) {
            System.out.println("Resultado: Positivo (Tiene anemia).");
        } else {
            System.out.println("Resultado: Negativo (No tiene anemia).");
        }
    }
}