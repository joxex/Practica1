
package Practica1;

/**
 *
 * @author SI
 */
public class Metodos {
    public String clasificacion(String tipo){
        String clasificacion = "";
        
        switch (tipo) {
            case "niños":
                clasificacion = "E Todo el publico";
                break;
            case "Jovenes":
                clasificacion = "T adolescentes";
                break;
            case "Mayores de edad":
                clasificacion = "M mayores";
                break;
            case "Adultos":
                clasificacion = "A adultos";
                break;
            default:
                clasificacion = "RP Pendientes";
                break;
        }
        
        return clasificacion;
    
    }
    public double precioenvio(double precio){
        double costo,impuesto,ganancia;
        impuesto = precio * 0.12;
        ganancia = precio * 0.21;
        
        costo = precio+impuesto+ganancia;
        return costo;
    }
    
    }
    
    
    
    

