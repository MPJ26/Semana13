package ejercicio3;
public class inventario {
    // Atributos de la clase
    private String[] nombresProductos;
    private double[] preciosProductos;
    private int[] cantidadesProductos;

    public inventario(int numProductos) {
        nombresProductos = new String[numProductos];
        preciosProductos = new double[numProductos];
        cantidadesProductos = new int[numProductos];
    }
    //ingresar los datos de los productos
    public void ingresarProductos(String[] nombres, double[] precios, int[] cantidades) {
        this.nombresProductos = nombres;
        this.preciosProductos = precios;
        this.cantidadesProductos = cantidades;
    }
    // Calcular el valor total del inventario
    public double calcularValorTotalInventario() {
        double total = 0;
        for (int i = 0; i < nombresProductos.length; i++) {
            total += preciosProductos[i] * cantidadesProductos[i];
        }
        return total;
    }
    // Encontrar el producto con el mayor valor 
    public String productoConMayorValor() {
        int indiceMayorValor = 0;
        double mayorValor = preciosProductos[0] * cantidadesProductos[0];

        for (int i = 1; i < nombresProductos.length; i++) {
            double valorProducto = preciosProductos[i] * cantidadesProductos[i];
            if (valorProducto > mayorValor) {
                mayorValor = valorProducto;
                indiceMayorValor = i;
            }
        }
        return "El producto con el mayor valor es: " + nombresProductos[indiceMayorValor] + " con un valor de: " + mayorValor;
    }
}