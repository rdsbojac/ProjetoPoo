/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author marcos filho
 */
public class Mecanico extends Pessoa {

 private String idUser;
 private String numero;
 private String numeroUser;
 private String cargo;
 private String login;
 private String senha;
	
	public String getIdUser() {
            return idUser;
	}
	public void setIdUser(String idUser) {
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
        
        //Esta função está disponível para todos os Usuarios
        public void consultarOs(){
            //Implementar esta função
        }
}