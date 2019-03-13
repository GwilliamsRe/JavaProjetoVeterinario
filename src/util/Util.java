/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author william
 */
public class Util {
    public static boolean validarNome(String v){
        String exp = "^[a-zA-ZÁ-è ]{2,30}$";
        return v.matches(exp);
    }
    
    public static boolean  validarPeso(String v){
        String exp = "^[0-9.]{1,30}$";
        return v.matches(exp);
    }
    
    public static boolean  validarIdade(String v){
        String exp = "^[0-9]{1,30}$";
        return v.matches(exp);
    }
    
}//fecha classe
