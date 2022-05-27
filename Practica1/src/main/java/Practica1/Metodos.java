
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
    
    
    
    
    
    

