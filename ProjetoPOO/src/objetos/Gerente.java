/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Ronaldo Daniel
 */
public class Gerente extends Pessoa {
    
 private int idUser;
 private String numero;
 private String numeroUser;
 private String cargo;
 private String login;
 private String senha;
	
	public int getIdUser() {
            return idUser;
	}
	public void setIdUser(int idUser) {
            this.idUser = idUser;
	}
	public String getNumero() {
            return numero;
	}
	public void setNumero(String numero) {
            this.numero = numero;
	}
	public String getNumeroUser() {
            return numeroUser;
	}
	public void setNumeroUser(String numroUser) {
            this.numeroUser = numroUser;
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
        
        //Métodos da Classe Gerente
        public void addUser(){
            //Implementar esta função
        }
        public void editUser(){
            //Implementar esta função
        }
        //Esta função está disponível para todos os Usuarios
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
