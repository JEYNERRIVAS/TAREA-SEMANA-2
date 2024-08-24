package tarea_semana2;
//PAQUETE DE DATOS
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class EJERCICIO_1 {
    //METODO PRINCIPAL DE LA CLASE
    public static void main(String[] args) {
    //DECLARACION DE VARIABLES
    int num1;
    double s,c,t,va;
    //LECTURA
    Scanner lectura=new Scanner(System.in);
    DecimalFormat formato=new DecimalFormat("##.##");
    //ENTRADA DE DATOS
    System.out.print("Ingrese un numero : ");
    num1=lectura.nextInt();
    //PROCESO DE DATOS
    va=Math.abs(num1);
    s=Math.sin(num1);
    c=Math.cos(num1);
    t=Math.tan(num1);
    //SALIDA DE DATOS
        System.out.println("El valor absoluto del numero es : "+formato.format(va));
        System.out.println ("El seno del numero es : "+formato.format(s));
        System.out.println ("El coseno del numero es : "+formato.format(c));
        System.out.println ("La tangente del numero es : "+formato.format(t));
        //FIN DE METODO
        //FIN DE PROYECTO
    
    
    
    
    }
    
}
