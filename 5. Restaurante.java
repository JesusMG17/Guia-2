import java.util.Scanner; //Importar para teclado
import java.lang.Math; //Importar para redondeo

public class Restaurante
{
    public static void main (String[] args) 
    {
        //Declarar variables
        String comPref, platPref;
        short sopas, ensaladas, jugos, bandCarne, bandPollo, perroCal, hambur;
        double iva, precSinIva, precIva, desc;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese tipo de comida que desea, las opciones son vegetariana, no vegetariana o rápida:");
        comPref = teclado.nextLine();
        
        //Instrucciones condicionales, calculo e impresion de resultados
        iva = 1.19;
        
        if (comPref.equalsIgnoreCase("Vegetariana")) {
            desc = 0.8;
            System.out.println("Ingrese tipo de plato que desea comer, las opciones son sopa de vegetales, ensalada o jugo:");
            platPref = teclado.nextLine();
            if (platPref.equalsIgnoreCase("Sopa de vegetales")) {
                System.out.println("Ingrese cuantas sopas de vegetales desea ordenar:");
                sopas = teclado.nextShort();
                precSinIva = 10000 * sopas;
                System.out.println("El precio total sin Iva de las sopas es de: " + "$" + precSinIva);
                precIva = Math.round((precSinIva * iva) * desc);
                System.out.println("El precio total con Iva de las sopas y descuento del 20% (por ordenar comida vegetariana) es de: " + "$" + precIva);
            } //Fin de if sopa
            else if (platPref.equalsIgnoreCase("Ensalada")) {
                System.out.println("Ingrese cuantas ensaladas desea ordenar:");
                ensaladas = teclado.nextShort();
                precSinIva = 25000 * ensaladas;
                System.out.println("El precio total sin Iva de las ensaladas es de: " + "$" + precSinIva);
                precIva = Math.round((precSinIva * iva) * desc);
                System.out.println("El precio total con Iva de las ensaladas y descuento del 20% (por ordenar comida vegetariana) es de: " + "$" + precIva);                    
            } //Fin de if ensalada
            else if (platPref.equalsIgnoreCase("Jugo")) {
                System.out.println("Ingrese cuantos jugos desea ordenar:");
                jugos = teclado.nextShort();
                precSinIva = 5000 * jugos;
                System.out.println("El precio total sin Iva de los jugos es de: " + "$" + precSinIva);
                precIva = Math.round((precSinIva * iva) * desc);
                System.out.println("El precio total con Iva de los jugos y descuento del 20% (por ordenar comida vegetariana) es de: " + "$" + precIva);                    
            } //Fin de if jugo
        } //Fin de if vegetariana
        if (comPref.equalsIgnoreCase("No vegetariana")) {
            desc = 0.9;
            System.out.println("Ingrese tipo de plato que desea comer, las opciones son bandeja de carne o bandeja de pollo:");
            platPref = teclado.nextLine();
            if (platPref.equalsIgnoreCase("Bandeja de carne")) {
                System.out.println("Ingrese cuantas bandeja de carne desea ordenar:");
                bandCarne = teclado.nextShort();
                precSinIva = 30000 * bandCarne;
                System.out.println("El precio total sin Iva de las bandejas de carne es de: " + "$" + precSinIva);
                precIva = Math.round((precSinIva * iva) * desc);
                System.out.println("El precio total con Iva de las bandejas de carne y descuento del 10% (por ordenar comida no vegetariana)"); 
                System.out.println("es de: " + "$" + precIva);
            } //Fin de if bandeja de carne
            else if (platPref.equalsIgnoreCase("Bandeja de pollo")) {
                System.out.println("Ingrese cuantas bandejas de pollo desea ordenar:");
                bandPollo = teclado.nextShort();
                precSinIva = 28000 * bandPollo;
                System.out.println("El precio total sin Iva de las bandejas de pollo es de: " + "$" + precSinIva);
                precIva = Math.round((precSinIva * iva) * desc);
                System.out.println("El precio total con Iva de las bandejas de pollo y descuento del 10% (por ordenar comida no vegetariana)"); 
                System.out.println("es de: " + "$" + precIva);                    
            } //Fin de if bandeja de pollo
        } //Fin de if no vegetariana
        if (comPref.equalsIgnoreCase("Rápida") || comPref.equalsIgnoreCase("Rapida")) {
            System.out.println("Ingrese tipo de plato que desea comer, las opciones son perro caliente o hamburguesa:");
            platPref = teclado.nextLine();
            if (platPref.equalsIgnoreCase("Perro caliente")) {
                System.out.println("Ingrese cuantos perros calientes desea ordenar:");
                perroCal = teclado.nextShort();
                precSinIva = 5000 * perroCal;
                System.out.println("El precio total sin Iva de los perros calientes es de: " + "$" + precSinIva);
                precIva = Math.round(precSinIva * iva);
                System.out.println("El precio total con Iva de los perros calientes es de: " + "$" + precIva);
            } //Fin de if perro caliente
            else if (platPref.equalsIgnoreCase("Hamburguesa")) {
                System.out.println("Ingrese cuantas hamburguesas desea ordenar:");
                hambur = teclado.nextShort();
                precSinIva = 7000 * hambur;
                System.out.println("El precio total sin Iva de las hamburguesas es de: " + "$" + precSinIva);
                precIva = Math.round(precSinIva * iva);
                System.out.println("El precio total con Iva de las hamburguesas es de: " + "$" + precIva);      
            } //Fin de if bandeja de pollo
        } //Fin de if no vegetariana
    } //Fin de main
} //Fin 