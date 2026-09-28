package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
  
     public Connection conectaBD() {
         Connection conn = null;
     
         try {
             // 1. Linha necessária para o Java carregar o Driver que você adicionou nas bibliotecas
             Class.forName("com.mysql.cj.jdbc.Driver"); 
             
             // 2. URL corrigida de 'jbdc' para 'jdbc'
             String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
             conn = DriverManager.getConnection(url);
                     
         } catch (ClassNotFoundException e) {
             JOptionPane.showMessageDialog(null, "ConexaoDAO => Driver do MySQL não foi encontrado nas bibliotecas!");
         } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "ConexaoDAO => " + erro.getMessage());
         }
         return conn;
     }     
}
