package br.fatec;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String host = "localhost";
    private String port = "5432";
    private String db = "20251_fatce_ipi_poo_pessoas_erickdiego";
    private String user = "postgres";
    private String password = "postgres";

    // https://google.com:80/search
    public Connection obterConexao() throws Exception {
        // string de conexão
        var s = String.format("jdbc:postgresql://%s:%s/%s", host, port, db);
        // cat or declare
        // exeção verificada pelo compilador
        Connection c = DriverManager.getConnection(s, user, password);
        return c;
    }
}