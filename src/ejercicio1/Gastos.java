package ejercicio1;
public class Gastos {
    // Atributos de la clase
    private double[] gastosDiarios;
    private double presupuestoDiario;
    private double limiteSemanal;
    //atributos de la clase
    public Gastos(double[] gastosDiarios, double presupuestoDiario, double limiteSemanal) {
        this.gastosDiarios = gastosDiarios;
        this.presupuestoDiario = presupuestoDiario;
        this.limiteSemanal = limiteSemanal;
    }
    // Getters y Setters
    public double[] getGastosDiarios() {
        return gastosDiarios;
    }
    public void setGastosDiarios(double[] gastosDiarios) {
        this.gastosDiarios = gastosDiarios;
    }
    public double getPresupuestoDiario() {
        return presupuestoDiario;
    }
    public void setPresupuestoDiario(double presupuestoDiario) {
        this.presupuestoDiario = presupuestoDiario;
    }
    public double getLimiteSemanal() {
        return limiteSemanal;
    }
    public void setLimiteSemanal(double limiteSemanal) {
        this.limiteSemanal = limiteSemanal;
    }
    // Calcular el total de gastos de la semana
    public double calcularTotalGastos() {
        double total = 0;
        for (double gasto : gastosDiarios) {
            total += gasto;
        }
        return total;
    }
    // Contar los días con gastos superiores al presupuesto diario
    public int diasSuperioresPresupuesto() {
        int contador = 0;
        for (double gasto : gastosDiarios) {
            if (gasto > presupuestoDiario) {
                contador++;
            }
        }
        return contador;
    }
    // Calcular el exceso sobre el límite semanal
    public double excesoSobreLimiteSemanal() {
        double totalGastos = calcularTotalGastos();
        return Math.max(0, totalGastos - limiteSemanal);
    }
}