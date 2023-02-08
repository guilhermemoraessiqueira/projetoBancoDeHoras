/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.classesPrincipais;

import java.time.LocalDateTime;

/**
 *
 * @author Guilherme
 */
public class RegistroDePonto {
    private LocalDateTime horario_entrada;
    private LocalDateTime horario_saida;
    private Projetos projeto;
    private Usuario usuario;
    private int id;

    public RegistroDePonto(LocalDateTime horario_entrada, LocalDateTime horario_saida, Projetos projeto, Usuario usuario, int id) {
        this.horario_entrada = horario_entrada;
        this.horario_saida = horario_saida;
        this.projeto = projeto;
        this.usuario = usuario;
        this.id = id;
    }

    public LocalDateTime getHorario_entrada() {
        return horario_entrada;
    }

    public void setHorario_entrada(LocalDateTime horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    public LocalDateTime getHorario_saida() {
        return horario_saida;
    }

    public void setHorario_saida(LocalDateTime horario_saida) {
        this.horario_saida = horario_saida;
    }

    public Projetos getProjeto() {
        return projeto;
    }

    public void setProjeto(Projetos projeto) {
        this.projeto = projeto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
    
    
}
