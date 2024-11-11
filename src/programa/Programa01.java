package programa;
import java.util.Scanner;
public class Programa01 {
    public static void main(String []args){
        //declaras variables
        double vt1,vt2,vt3;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos 
        System.out.print("ingresar venta 1:");
        vt1=lectura.nextDouble();
        System.out.print("ingresar venta 2:");
        vt2=lectura.nextDouble();
        System.out.print("ingresar venta 2:");
        vt3=lectura.nextDouble();
        //crear un objeto en base a la instancia de la clase
        RegistroVenta objregventa=new RegistroVenta();
        objregventa.setVenta1(vt1);
        objregventa.setVenta2(vt2);
        objregventa.setVenta3(vt3);        
        //salida de datos
        System.out.println("El total de venta es: "+objregventa.total());
    }
}
