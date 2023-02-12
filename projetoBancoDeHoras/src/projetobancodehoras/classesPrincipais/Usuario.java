/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.classesPrincipais;

/**
 *
 * @author Guilherme
 */
public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private int id;

    public Usuario(String nome, String login, String senha, int id) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.id = id;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
     }

  
    public Usuario() {
     }

    public Usuario(int id) {
        this.id= id;
    }

    public Usuario(int id, String login, String senha) {
        this.id=id;
        this.login=login;
        this.senha=senha;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    
    
    
    
}
