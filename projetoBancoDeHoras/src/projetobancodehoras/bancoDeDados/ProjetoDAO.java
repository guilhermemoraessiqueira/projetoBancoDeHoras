/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.bancoDeDados;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import projetobancodehoras.classesPrincipais.Projetos;
/**
 *
 * @author Guilherme
 */
public class ProjetoDAO {
    private Connection c;
    
    public ProjetoDAO(conexao conn) throws SQLException, ClassNotFoundException {
        c = conn.obtemConexao();
    }
    public ProjetoDAO(){
        
    }
    
    
    public void inserir(Projetos projeto) throws SQLException {
      int idUsuario=0;  
      String sql = "INSERT INTO projeto (Nome, Descrição, Usuario_idUsuario) VALUES (?, ?, ?);";
      
      try (Connection conn = conexao.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
          
          System.out.println(projeto.getNome()+" IY");
          System.out.println(" Nome "+projeto.getNome()+" Descrição "+projeto.getDescricao()+" id do usuario "+projeto.getUsuarioId());
          
           ps.setString(1, projeto.getNome());
            ps.setString(2, projeto.getDescricao());
            ps.setInt(3, projeto.getUsuarioId());
            ps.execute();
            System.out.println(ps);
            }

   }
 
    
}



    
    
    
  

    
    
    
    

