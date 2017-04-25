package br.com.infox.DAO;

import java.sql.*;

public class ModuloConexao {
    // Metodo responsalvel por estabelecer a conexao com o banco
    public static Connection conector(){
    java.sql.Connection conexao = null;
    // a linha abaixo "chama" o driver
    String driver = "com.mysql.jdbc.Driver";
    // Armazenando informações referentes ao banco
    String url = "jdbc:mysql://localhost:3306/dbinfox";
    String user="root";
    String password= "";
    // estabelecendo conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve para apoio a conexao
            //System.out.println(e);
            return null;
        }
    }
    
}
