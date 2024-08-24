package tarea_semana2;
//PAQEUETE DE DATOS
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class EJERCICIO_2 { 
    // MODELO PIRNCIPAL DE LA CLASE
    public static void main (String[]args){
        //DECLARACION DE VARIABLES
        double vf,vp,i,n,tasa,tc;
        // LECTURA
         Scanner lectura=new Scanner(System.in);
         DecimalFormat formato=new DecimalFormat("##.##");
        //ENTRADA DE DATOS
        System.out.print("ingrese el valor presente: ");
        vp=lectura.nextDouble();
        System.out.print("Ingrese la tasa de interes: ");
        i=lectura.nextDouble();
        System.out.print ("Ingrese el periodo de tiempo: ");
        n=lectura.nextDouble();
        //PROCESO DE DATOS
        tasa=i/100;
        tc=(1+tasa);
        vf=vp*Math.pow(tc, n);
        //SALIDA DE DATOS
        System.out.println("el valor final es : "+formato.format(vf));
     // FIN DE METODO
     //FIN DE PROYECTO
        
    }
    
    
}
