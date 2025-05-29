package br.fatec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.ResultSet;
// DAO - DataAcessObject
public class PessosaDAO {
    //cltr, - wrap
    //pull de conexão em java
    //ferramentas orm - mapeamento de objeto relacional
    //jdbc: java database connectivity
    public void cadastrar(Pessoa pessoa) throws Exception{
        //1. definir comando SQL
        var sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES(?, ?, ?)";
        //2. estabelecer uma conexão com o SGB
        var connectionFactory = new ConnectionFactory();
        Connection conexao = connectionFactory.obterConexao();
        //3. preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeHolders
        ps.setString(1, pessoa.getNome());
        ps.setString(2, pessoa.getFone());
        ps.setString(3, pessoa.getEmail());
        //5. Executar o comando
        ps.execute();
        //6. Fechar os recursos
        ps.close();
        conexao.close();
    }
    public void atualizar(Pessoa pessoa) throws Exception{
        //1. definir comando sql
        var sql = "UPDATE tb_pessoa SET nome=?, fone=?, email=? WHERE cod_pessoa=?";
        //Java 7+
        //try-with-resources
        //2. prepara o comando, substitui placeholders e executa
        // os closes ocorrem automaticamente 
        try(var conexao = ConnectionFactory.obterConexao(); 
        var ps = conexao.prepareStatement(sql)){
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getFone());
            ps.setString(3, pessoa.getEmail());
            ps.setInt(4, pessoa.getCodigo());
            ps.execute();
        }
    }
    public void remover(Pessoa pessoa) throws Exception{
        //fazer o methodo e fazer o case correspondente na classe principal
        //removendo pelo codigo apenas
        //a pessoa que vai chegar via parametro somente o codigo
    }
    public List<Pessoa> listar() throws Exception{
        var pessoas = new ArrayList<Pessoa>();
        var sql = "Select * FROM tb_pessoa ORDER BY nome";
        try{
            var conexao = ConnectionFactory.obterConexao();
            var ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        }{    // lidar com o resultado
            while(rs.next()){
                var codigo = rs.getInt("codigo: ");
                var nome = rs.getString("nome: ");
                var fone = rs.getString("fone: ");
                var email = rs.getString("email: ");
                var pessoa = new Pessoa(codigo, nome, fone, email);
                pessoas.add(pessoa);
            }
            return pessoas;
        }
    }
}
