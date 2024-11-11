package ejercicio2;
import java.util.Scanner;
public class programa {
        public static void main(String[] args) {
        // Declarar variables
        double[] horasTrabajadas = new double[7];
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingrese las horas trabajadas durante la semana:\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese las horas trabajadas el día " + (i + 1) + ": ");
            horasTrabajadas[i] = lectura.nextDouble();
        }
        // Crear un objeto de la clase HorasTrabajadas
        HorasTrabajadas registroHoras = new HorasTrabajadas(horasTrabajadas);
        // Salida de datos
        System.out.println("Total de horas trabajadas durante la semana: " + registroHoras.calcularTotalHoras());
        System.out.println("Horas extras trabajadas: " + registroHoras.calcularHorasExtras());
        System.out.println("¿Se realizaron horas extras?: " + (registroHoras.tieneHorasExtras() ? "Sí" : "No"));

        lectura.close();
    }
}

