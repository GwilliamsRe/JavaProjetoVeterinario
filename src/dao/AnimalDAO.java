/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import jdk.nashorn.internal.ir.TryNode;
import modelo.AnimalVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author william
 */
public class AnimalDAO {
    
    public void cadastrarAnimal(AnimalVO aVO) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into animal(idanimal,nomeanimal,especie,raca,nomedono,sexo,peso,idade)"
            +"values(null, '"+aVO.getNomeAnimal()+"', '"+aVO.getEspecie()+"', '"+aVO.getRaca()+"', '"+aVO.getNomeDono()+"','"+aVO.getSexo()+"' , "+aVO.getPeso()+", "+aVO.getIdade()+")";
            
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar animal! "+e.getMessage());
        }finally{
            con.close();
            stat.close();
            
        }//fecha finally
    }//fecha método
    
    public ArrayList<AnimalVO> buscarAnimal() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from animal";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<AnimalVO> anims = new ArrayList<>();
            while(rs.next()){
                AnimalVO a = new AnimalVO();
                a.setIdAnimal(rs.getLong(1));
                a.setNomeAnimal(rs.getString(2));
                a.setEspecie(rs.getString(3));
                a.setRaca(rs.getString(4));
                a.setNomeDono(rs.getString(5));
                a.setSexo(rs.getString(6));
                a.setPeso(rs.getDouble(7));
                a.setIdade(rs.getInt(8));
                anims.add(a);
            }//fecha while
            return anims;
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar!" +e.getMessage());
        }finally{
            stat.close();
            con.close();
        }
    }//fecha array
    
    public void deletarAnimal(long id)throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql="delete from animal where idanimal="+id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("ERRO ao deletar"+e.getMessage());
        }finally{
            con.close();
            stat.close();
        }
    }
     public ArrayList<AnimalVO> filtrarAnimal(String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from Animal"+" "+query;

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<AnimalVO> ani = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                AnimalVO a = new AnimalVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                a.setIdAnimal(rs.getLong("idAnimal"));
                a.setNomeAnimal(rs.getString("nomeanimal"));
                a.setEspecie(rs.getString("Especie"));
                a.setRaca(rs.getString("raca"));
                a.setNomeDono(rs.getString("nomeDono"));
                a.setSexo("sexo");
                a.setPeso(rs.getDouble("peso"));
                a.setIdade(rs.getInt("Idade"));                /* Inserindo o objeto pVO no ArrayList */
                ani.add(a);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return ani;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar os dados do animal! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    public void alterar(AnimalVO a) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement state = con.createStatement();
        try {
            String sql = "update animal set nome='"+a.getNomeAnimal()+"',especie='"+a.getEspecie()+"',raca='"+a.getRaca()+"',nomedono='"+a.getNomeDono()+"',sexo='"+a.getSexo()+"',peso="+a.getPeso()+",idade="+a.getIdade();
            state.executeUpdate(sql);
        } catch (Exception e) {
            //e.printStackTrace();
            throw new SQLException("Erro ao alterar dados! " +e.getMessage());
        }finally {
            con.close();
            state.close();
        }
    }//metodo
    
}//fecha classe
