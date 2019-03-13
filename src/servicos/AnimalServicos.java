/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.AnimalDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.AnimalVO;

/**
 *
 * @author william
 */
public class AnimalServicos {
    
    public void cadastrarAnimal(AnimalVO aVO) throws SQLException{
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        aDAO.cadastrarAnimal(aVO);
    }//fecha metodo
    
    public ArrayList<AnimalVO> buscarAnimais() throws SQLException{
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        return aDAO.buscarAnimal();
    }
    public void deletarAnimal(long id) throws SQLException{
        AnimalDAO ahDAO = DAOFactory.getAnimalDAO();
        ahDAO.deletarAnimal(id);
    }
    public ArrayList<AnimalVO>filtrar(String query) throws SQLException{
        AnimalDAO aDAO=DAOFactory.getAnimalDAO();
        return aDAO.filtrarAnimal(query);
    }
    public void alterar(AnimalVO aVO) throws SQLException{
        AnimalDAO aDAO=DAOFactory.getAnimalDAO();
        aDAO.alterar(aVO);
    }
 }//fecha clase
