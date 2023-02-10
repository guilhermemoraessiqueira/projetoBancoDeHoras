/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobancodehoras.bancoDeDados;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import projetobancodehoras.classesPrincipais.Usuario;

/**
 *
 * @author Guilherme
 */
public class DAO {
    private Map<String, String> projetosDescricao = new HashMap<>();
    
    public void carregaProjetosNoComboBox(JComboBox<String> comboProjetos, JTextField ptxtDescricao) {
    try {
      String query = "SELECT nome, descricao FROM projeto";
      Connection c = conexao.obtemConexao();
      PreparedStatement ps = c.prepareStatement(query);
      ResultSet resultSet = (ResultSet) conexao.obtemConexao().prepareStatement(query);

      while (resultSet.next()) {
        String nome = resultSet.getString("nome");
        String descricao = resultSet.getString("descricao");
        comboProjetos.addItem(nome);
        projetosDescricao.put(nome, descricao);
      }

      comboProjetos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String nomeProjetoSelecionado = (String) comboProjetos.getSelectedItem();
          ptxtDescricao.setText(projetosDescricao.get(nomeProjetoSelecionado));
        }
      });
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
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
    
    public ResultSet listaProjeto(){
        Connection conn = conexao.obtemConexao();
        String sql= "SELECT * FROM projeto"; 
        try{
            PreparedStatement ps = conn.prepareStatement(sql);  
            System.out.println(sql);    
            return ps.executeQuery();
        }catch(SQLException e){
            System.out.println("erro");
            return null;
        }
    }

    public String getDescricaoPeloNome(String nome) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection conn = conexao.obtemConexao();
            ps = connection.prepareStatement("SELECT descricao FROM projeto WHERE nome = ?");
            ps.setString(1, nome);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("descricao");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //conexao.close(rs, ps, connection);
        }
        return null;
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
