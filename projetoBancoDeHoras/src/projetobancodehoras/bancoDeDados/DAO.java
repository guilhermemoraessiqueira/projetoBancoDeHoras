/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.bancoDeDados;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import projetobancodehoras.classesPrincipais.Usuario;

/**
 *
 * @author Guilherme
 */
public class DAO {
    
    public boolean existe (Usuario usuario) throws Exception{
       String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";       
       try (Connection c = conexao.obtemConexao();
               PreparedStatement ps = c.prepareStatement(sql)){
           System.out.println(sql);
           ps.setString(1, usuario.getLogin());
           ps.setString(2, usuario.getSenha());           
           try (ResultSet rs = ps.executeQuery()){
               return rs.next();
               

           }
       }
    }
    
    public void inserir (Usuario usuario) throws Exception{
       String sql = "INSERT INTO tb_usuario (nome,senha) values (?,?)";
       try (Connection conn = conexao.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, usuario.getNome());
           ps.setString(2, usuario.getSenha());
           ps.execute();
       }
    }
    
    public void excluir (Usuario usuario) throws Exception{
       String sql = "DELETE FROM tb_usuario WHERE id=?";
       try (Connection conn = conexao.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setInt(1, usuario.getId());
           ps.execute();
       }
    }
    
    public void atualizar (Usuario usuario) throws Exception{
       String sql = "UPDATE tb_usuario SET nome = ?, senha = ? WHERE id = ?";
       try (Connection conn = conexao.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, usuario.getNome());
           ps.setString(2, usuario.getSenha());
           ps.setInt(3, usuario.getId());
           ps.execute();
       }
    }   
    
}
