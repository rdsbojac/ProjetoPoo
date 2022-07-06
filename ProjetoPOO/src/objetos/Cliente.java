/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author marcos filho
 */
public class Cliente extends Pessoa{

    
    
        private int idCliente;
        private String nomeCliente;
        private String endCliente;
	private String numero;
	private String email;
	
        
        // =========== GETTERS AND SETTERS ===========\\
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

        public int getIdCliente() {
            return idCliente;
        }

        public String getNomeCliente() {
            return nomeCliente;
        }

        public String getEndCliente() {
            return endCliente;
        }

        public void setIdCliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        public void setEndCliente(String endCliente) {
            this.endCliente = endCliente;
        }
	
}
