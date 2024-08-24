package tarea_semana2;
//PAQUETE DE DATOS
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class EJERCICIO_3 {
//MODELO PRINCIPAL DE LA CLASE
    public static void main(String[]args){
      //DECLARACION DE VARIABLES
      double Aalfa,Abeta,RF,SenoAlfa,SenoBeta,suma,potencia;
      //LECTURA
       Scanner lectura=new Scanner(System.in);
       DecimalFormat formato=new DecimalFormat("##.##");
       //ENTRADA DE DATOS
       System.out.print("Ingresa el valor del angulo alfa: ");
       Aalfa=lectura.nextDouble();
       System.out.print("Ingresa el valor del angulo beta : ");
       Abeta=lectura.nextDouble();
       //PROCESO DE DATOS
       SenoAlfa=Math.sin(Aalfa);
       SenoBeta=Math.sin(Abeta);
       suma=SenoAlfa+SenoBeta;
       potencia=Math.pow(suma, 2);
       RF=Math.sqrt(potencia);
       //SALIDA DE DATOS
       System.out.println("El resultado final del ejercicio es : "+formato.format(RF));
       //FIN DE METODO
      //FIN DE PROYECTO
               
     
    }
    }
