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
import java.util.Date;
import javax.swing.JOptionPane;
import projetobancodehoras.classesPrincipais.Projetos;
import projetobancodehoras.classesPrincipais.Usuario;
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
  
    public void insert(Projetos projeto) throws SQLException {
    String sql = "INSERT INTO administradores (nome, descricao, data_inicio, horas_trabalhadas) VALUES (" + "\""
                + projeto.getNome() + "\",\""
                + projeto.getDescricao() + "\",\""
                + projeto.getDataInicio() + "\",\""
                + projeto.getHorasTrabalhadas() + "\");";

        System.out.println(sql);
        
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            ps.close();
            c.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
  }
    
    public void consulta(Projetos projeto) {    
             String sql =   "SELECT * from paciente where id=" + projeto.getId();
             System.out.println(sql);
             try {

                    PreparedStatement ps = c.prepareStatement(sql);

                    ResultSet rs = ps.executeQuery();

                    while (rs.next()){
                        projeto.setNome(rs.getString("nome"));                     
                    }

                }   
                catch (Exception e){
                    e.printStackTrace();
                }
        
    }
    
    
    
    
    
    
    
}



    
    
    
  

    
    
    
    

