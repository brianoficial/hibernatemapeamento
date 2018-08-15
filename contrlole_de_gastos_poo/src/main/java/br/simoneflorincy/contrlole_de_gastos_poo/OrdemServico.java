/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name="ordem_servico")
public class OrdemServico implements Serializable {

    /**
     * @return the codOrdem_servico
     */
    public Integer getCodOrdem_servico() {
        return codOrdem_servico;
    }

    /**
     * @param codOrdem_servico the codOrdem_servico to set
     */
    public void setCodOrdem_servico(Integer codOrdem_servico) {
        this.codOrdem_servico = codOrdem_servico;
    }

    /**
     * @return the fechado
     */
    public boolean isFechado() {
        return fechado;
    }

    /**
     * @param fechado the fechado to set
     */
    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
    
    @Id
    @Column(name="cd_ordem_servico")
    private Integer codOrdem_servico;
    @Column (name="dt_ordem_servico")        
    private Date data;
    @Column (name="vl_total")
    private double valorTotal;
    @Column (name="funcionario_cd_funcionario")
    @OneToOne(targetEntity = Funcionario.class, 
            cascade = CascadeType.REMOVE, 
            fetch = FetchType.EAGER)
    private Funcionario funcionario;
    @Column (name="cliente_cd_clinte")
    @OneToOne(targetEntity = Cliente.class, 
            cascade = CascadeType.REMOVE, 
            fetch = FetchType.EAGER)
    private Cliente cliente;
    @Column(name="bool_fechado")
    private boolean fechado;
   
    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
