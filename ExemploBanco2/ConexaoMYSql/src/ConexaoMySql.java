import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoMySql {
// URL do Banco de Dados, usuario e senha

    //nome do Banco e Porta de Acesso
    private static final String URL = "jdbc:mysql://localhost:3306/teste";
   
    //Usuario Padrão de acesso ao Banco
    private static final String USER = "root";
   
    //Senha padrão do usuario BD
    private static final String PASSWORD = "";
           
    public static void main(String[] args) {
       
        Connection conexao = null;
       
        try {
            //Estabelecer a Conexão
           
            conexao = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conexão ao Banco de Dados"+" Realizada com sucesso!");
        } catch (SQLException e) {
            // Exibindo mensagem de erro
            System.out.println("Erro ao conectar ao"+" Banco de Dados: "+e.getMessage());
        } finally {
            //Fechando conexão ao BD
            if (conexao != null) {
                try {
                    conexao.close();
                    System.out.println("CONEXÃO FECHADA!");
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexão"+" "+e.getMessage());
                }
            }
        }
    }

}
