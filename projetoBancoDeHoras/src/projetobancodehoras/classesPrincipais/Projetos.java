/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.classesPrincipais;

import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Projetos {
    private String nome;
    private String descricao;
    private int id;
    private Date dataInicio;
    private double horasTrabalhadas; 

    public Projetos(String nome, String descricao, Date dataInicio, int id) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.dataInicio = dataInicio;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Projetos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
    
    
    
    
    
    
    
}
