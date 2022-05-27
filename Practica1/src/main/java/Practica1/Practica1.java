
package Practica1;

import java.util.Scanner;

/**
 *
 * @author joxex
 */
public class Practica1 {

    
    public static void main(String[] args) {
        Juegos_de_video();
    }
    public static void Juegos_de_video(){
        Scanner in = new Scanner(System.in);
        String nombre,publico,clasificacion;
        double precio,total;
        System.out.println("Clasificador de Juegos de Video");
        System.out.println("Ingrese el numero del juego");
        nombre = in.next();
        System.out.println("Ingrese quienes pueden jugarlo: niños,jovenes,mayores de edad, adultos o en blanco si no sabe");
        publico = in.next();
        System.out.println("Ingrese el precio del juego");
        precio = in.nextDouble();
        Metodos met = new Metodos();
        clasificacion = met.clasificacion(publico);
        total = met.precioenvio(precio);  
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Los datos de su juego son:");
        
        System.out.println("Titulo: "+nombre);
        System.out.println("Clasificacion: "+clasificacion);
        System.out.println("Precio total: "+total);
        System.out.println("------------------------------------");
        
    }
}
