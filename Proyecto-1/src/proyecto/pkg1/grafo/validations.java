/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class validations {
    public static float validateFloat(String given){
        try{
            float casted = Float.parseFloat(given);
            return casted;
        }catch(Exception e){
            return 0;
        }
    }
    
    public static int validateInt(String given){
        try{
            int casted=Integer.parseInt(given.replace(";", ""));
            return casted;
        } catch(Exception e){
            return 0;
        }
    }
}
