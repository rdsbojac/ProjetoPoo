/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Jonas Felix
 */
public class Usuario extends Pessoa{
    
    // Atributos
    private String nome;
    private String numero;
    private String cargo;
    private String login;
    private String senha;
    
    // Métodos    
    public String getNome() {    
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {    
        this.senha = senha;
    }
    
    //public abstract void consultarOs();
}
