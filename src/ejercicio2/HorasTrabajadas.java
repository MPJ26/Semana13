package ejercicio2;
public class HorasTrabajadas {
    // Atributos de la clase
    private double[] horasDiarias;
    public HorasTrabajadas(double[] horasDiarias) {
        this.horasDiarias = horasDiarias;
    }
    // Getter y Setter 
    public double[] getHorasDiarias() {
        return horasDiarias;
    }
    public void setHorasDiarias(double[] horasDiarias) {
        this.horasDiarias = horasDiarias;
    }
    //calcular el total de horas trabajadas durante la semana
    public double calcularTotalHoras() {
        double total = 0;
        for (double horas : horasDiarias) {
            total += horas;
        }
        return total;
    }
    //calcular las horas extras
    public double calcularHorasExtras() {
        double totalHoras = calcularTotalHoras();
        if (totalHoras > 30) {
            return totalHoras - 30;
        }
        return 0; 
    }
    // determinar si hay horas extras
    public boolean tieneHorasExtras() {
        return calcularTotalHoras() > 30;
    }
}