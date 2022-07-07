/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Ronaldo Daniel
 */
public class Gerente extends Usuario {
    
    private String nome;
    private String numero;
    private String cargo;
    private String login;
    private String senha;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getNumero() {
        return numero;
    }
    @Override
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String getCargo() {
        return cargo;
    }
    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String getLogin() {
        return login;
    }
    @Override
    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public String getSenha() {
        return senha;
    }
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Métodos da Classe Gerente
    public void addUser(){
        //Implementar esta função
    }
    public void editUser(){
        //Implementar esta função
    }
    //Esta função está disponível para todos os Usuarios
    @Override
    public void consultarOs(){
        //Implementar esta função
    }
    public void delOS(){
        //Implementar esta função
    }
    public void editOs(){
        //Implementar esta função
    }
}
