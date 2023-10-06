import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    // Método para conectar ao banco de dados MySQL
    public Connection conectarBD() {
        Connection conn = null;

        try {
            // Carrega a classe do driver MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // Define a URL de conexão com o banco de dados MySQL
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Trata qualquer exceção que possa ocorrer ao conectar ao banco de dados
        }
        return conn;
    }

    // Variáveis de classe para armazenar o nome do usuário e o resultado da verificação
    public String nome = "";
    public boolean result = false;

    // Método para verificar as credenciais do usuário
    public boolean VerificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD(); // Conecta ao banco de dados

        sql += "select nome from usuarios";
        sql += " where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
                // Se uma linha correspondente for encontrada, a autenticação é bem-sucedida
                result = true;
                nome = rs.getString("nome"); // Armazena o nome do usuário
            }
        } catch (Exception e) {
            // Trata qualquer exceção que possa ocorrer ao executar a consulta SQL
        }
        
        return result; // Retorna true se as credenciais estiverem corretas, caso contrário, retorna false
    }
}
