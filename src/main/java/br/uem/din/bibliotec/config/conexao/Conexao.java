package br.uem.din.bibliotec.config.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//classe responsável por fazer a conexão com banco
public class Conexao {
    //Declaração das strings que vão compor a url da conexão
    String servername = "localhost";
    String mydb = "bibliotec";
    String usuario = "root";
    String senha = "sa";
    String url = "jdbc:mysql://localhost:3306/bibliotec";

    public Connection conexao;

    public Conexao() {
        try {

            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
