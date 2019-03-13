/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author william
 */
public class DAOFactory {
    
    private static final AnimalDAO animalDAO = new AnimalDAO();
    
    public static final AnimalDAO getAnimalDAO(){
        return animalDAO;
    }//fecha método
}//fecha classe
