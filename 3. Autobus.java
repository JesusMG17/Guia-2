package rellenobus;

import java.util.Scanner; //importar teclado
import java.lang.Math; //importar para redondear

public class autobus
{
   public static void main (String[] args)
   {
       //Declarar variables
       double num_tour, n, via_col, din_col, din_prop;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Ingrese numero de turistas: ");
       num_tour = teclado.nextInt();
       
       System.out.println("Ingrese numero de personas maximo que caben");
       System.out.println("en el colectivo: ");
       n = teclado.nextInt();
       
       //Calculo e impresion de resultados
       via_col = Math.ceil (num_tour / n);
       System.out.println("El colectivo debe realizar " + via_col + " viajes.");
       
       din_col = 10000 * num_tour;
       System.out.println("Los turistas deben pagar en total " + din_col + " pesos.");
       
       din_prop = 2000 * via_col;
       System.out.println("El conductor debe pagar en total al propietario " + din_prop + " pesos.");
   }
}