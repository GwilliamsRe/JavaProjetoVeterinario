/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author william
 */
public class ServicosFactory {
    
    private static final AnimalServicos animalServicos = new AnimalServicos();
    
    public static final AnimalServicos getAnimalServicos(){
        return animalServicos;
    }
}
