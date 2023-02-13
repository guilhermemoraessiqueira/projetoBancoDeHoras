/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import projetobancodehoras.classesPrincipais.Usuario;
/**
 *
 * @author Guilherme
 */
public class UsuarioDAO {
    private Connection c;
    
    public UsuarioDAO(conexao conn) throws SQLException, ClassNotFoundException {
        c = conn.obtemConexao();
    }

    public UsuarioDAO() {
    }
    
    public void insert (Usuario usuario) throws Exception{
       String sql = "INSERT INTO usuario (nome, login, senha)\n" +
"VALUES (?, ?, ?);";
       try (PreparedStatement ps = c.prepareStatement(sql)){
           ps.setString(1, usuario.getNome());
           ps.setString(2, usuario.getLogin());
           ps.setString(3, usuario.getSenha());
           ps.execute();
           System.out.println(sql);
       }
    }
    
    public void excluir (Usuario usuario) throws Exception{
            String sql = "DELETE FROM usuario WHERE idUsuario=?";
       try (Connection conn = conexao.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setInt(1, usuario.getId());
           ps.execute();
            }
    }
    
    public void atualizar (Usuario usuario) throws Exception{
       String sql = "UPDATE usuario SET login = ?, senha = ? WHERE idUsuario = ?";
       try (Connection conn = conexao.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, usuario.getLogin());
           ps.setString(2, usuario.getSenha());
           ps.setInt(3, usuario.getId());
           ps.execute();
       }
    }
    
    public boolean existe (Usuario usuario) throws Exception{
       String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
       try (Connection conn = conexao.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, usuario.getLogin());
           ps.setString(2, usuario.getSenha());
           try (ResultSet rs = ps.executeQuery()){
               System.out.println(sql);
               return rs.next();
               
           }
       }
    }
}
