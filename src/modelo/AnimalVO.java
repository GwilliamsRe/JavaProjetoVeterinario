/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author william
 */
public class AnimalVO {
    private long idAnimal;
    private String nomeAnimal;
    private String especie;
    private String raca;
    private String nomeDono;
    private String sexo;
    private double peso;
    private int idade;

    public AnimalVO() {
    }

    public AnimalVO(long idAnimal, String nomeAnimal, String especie, String raca, String nomeDono, String sexo, double peso, int idade) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.raca = raca;
        this.nomeDono = nomeDono;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
    }

    

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "AnimalVO{" + "idAnimal=" + idAnimal + ", nomeAnimal=" + nomeAnimal + ", especie=" + especie + ", raca=" + raca + ", nomeDono=" + nomeDono + ", sexo=" + sexo + ", peso=" + peso + ", idade=" + idade + '}';
    }

    
}//fecha classe
