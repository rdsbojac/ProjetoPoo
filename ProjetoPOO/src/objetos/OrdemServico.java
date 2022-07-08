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
    
    private Long os;
    private String dataOs;
    private String veiculo;
    private String defeito;
    private String servico;
    private Usuario mecanico;
    private double valorServico;
    private Cliente cliente;

    
    // ========= GETTERS AND SETTERS ======= \\
    public Long getOs() {
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

    public Usuario getMecanico() {
        return mecanico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setOs(Long os) {
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

    public void setMecanico(Usuario mecanico) {
        this.mecanico = mecanico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
