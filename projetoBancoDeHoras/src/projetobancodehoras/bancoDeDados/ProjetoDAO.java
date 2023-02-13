/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import projetobancodehoras.classesPrincipais.Projetos;
import projetobancodehoras.classesPrincipais.Usuario;
/**
 *
 * @author Guilherme
 */
public class ProjetoDAO {

    public static void inserir(Projetos projeto) {
     }
    
    public void inserir(Projetos projeto, int idUsuario) throws SQLException {
      String sql = "INSERT INTO projeto (Nome, Descrição, Usuario_idUsuario) VALUES (?, ?, ?)";
      PreparedStatement stmt = conexao.prepareStatement(sql);
      stmt.setString(1, projeto.getNome());
      stmt.setString(2, projeto.getDescricao());
      stmt.setInt(3, idUsuario);
      stmt.execute();
   }
 
    
}



    
    
    
  

    
    
    
    

