package ejercicio1;
import java.util.Scanner;
public class programa01 {
    public static void main(String[] args) {
        // Declarar variables
        double[] gastosDiarios = new double[7];
        double presupuestoDiario, limiteSemanal;
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingrese el presupuesto diario: ");
        presupuestoDiario = lectura.nextDouble();
        System.out.print("Ingrese el límite de gastos semanal: ");
        limiteSemanal = lectura.nextDouble();
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese el gasto del día " + (i + 1) + ": ");
            gastosDiarios[i] = lectura.nextDouble();
        }
        // Crear un objeto de la clase Gastos
        Gastos registroGastos = new Gastos(gastosDiarios, presupuestoDiario, limiteSemanal);
        // Salida de datos
        System.out.println("Total de gastos de la semana: " + registroGastos.calcularTotalGastos());
        System.out.println("Cantidad de días con gastos superiores al presupuesto diario: " + registroGastos.diasSuperioresPresupuesto());
        System.out.println("Exceso de gastos sobre el límite semanal: " + registroGastos.excesoSobreLimiteSemanal());
    }
}