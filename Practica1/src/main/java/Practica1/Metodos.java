
package Practica1;

/**
 *
 * @author SI
 */
public class Metodos {
    public String clasificacion(String tipo){
        String clasificacion = "";
        
        if(tipo.equals("niños")){
            clasificacion = "E Todo el publico";
        }else if(tipo.equals("Jovenes")){
            clasificacion = "T adolescentes";
        }else if(tipo.equals("Mayores de edad")){
            clasificacion = "M mayores";
        }else if(tipo.equals("Adultos")){
            clasificacion = "A adultos";
        }else{
            clasificacion = "RP Pendientes";
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
    
    
    
    

