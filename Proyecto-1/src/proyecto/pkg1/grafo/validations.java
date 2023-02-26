/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 * Esta clase define metodos para la validacion y casteo de variables
 * @author Andreina Rivas
 * @version 24/02/2022
 */
public class validations {
    
    /**
     * Metodo para castear un string a un float
     * @param given Cadena a transformar
     * @return el valor en float
     */
    public static float validateFloat(String given){
        try{
            float casted = Float.parseFloat(given);
            return casted;
        }catch(Exception e){
            return 0;
        }
    }
    
    /**
     * Metodo para castear un string a un entero
     * @param given Cadena a transformar
     * @return el valor en entero
     */
    
    public static int validateInt(String given){
        try{
            int casted=Integer.parseInt(given.replace(";", ""));
            return casted;
        } catch(Exception e){
            return 0;
        }
    }
}
