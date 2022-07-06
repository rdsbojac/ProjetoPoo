/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Ronaldo Daniel
 */
public class OrdemServico {
    
    private int os;
    String dataOs;
    String veiculo;
    String defeito;
    String servico;
    Mecanico mecanico;
    double valorServico;
    Cliente cliente;

    
    // ========= GETTERS AND SETTERS ======= \\
    public int getOs() {
        return os;
    }

    public String getDataOs() {
        return dataOs;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getDefeito() {
        return defeito;
    }

    public String getServico() {
        return servico;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setOs(int os) {
        this.os = os;
    }

    public void setDataOs(String dataOs) {
        this.dataOs = dataOs;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
