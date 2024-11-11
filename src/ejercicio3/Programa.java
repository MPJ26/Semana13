package ejercicio3;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);        
        // Crear el objeto Inventario 
        inventario inventario = new inventario(5);
        // Arreglos para almacenar los datos de los productos
        String[] nombres = new String[5];
        double[] precios = new double[5];
        int[] cantidades = new int[5];
        // Ingresar los datos de los productos
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
            
            System.out.print("Nombre del producto: ");
            nombres[i] = lectura.nextLine();
            
            System.out.print("Precio del producto: ");
            precios[i] = lectura.nextDouble();
            
            System.out.print("Cantidad del producto: ");
            cantidades[i] = lectura.nextInt();
            lectura.nextLine();  // Limpiar el buffer del scanner
        }
        // Ingresar los datos al objeto Inventario
        inventario.ingresarProductos(nombres, precios, cantidades);
        // Calcular y mostrar el valor total del inventario
        double totalInventario = inventario.calcularValorTotalInventario();
        System.out.println("Valor total del inventario: " + totalInventario);
        // Mostrar el producto con el mayor valor
        System.out.println(inventario.productoConMayorValor());
    }
}