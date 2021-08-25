package jdbc_daniel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CursoDao {
    Connection conn;
    Statement stmt;


    public CursoDao() throws SQLException {
        conn = ConnectionFactory.getConnection();
        stmt = conn.createStatement();
    }
    void criarCurso () throws SQLException {
        boolean var = stmt.execute("CREATE TABLE curso (" +
                "id INTEGER PRIMARY KEY AUTO_INCREMENT," +
                "nome VARCHAR(80) NOT NULL," +
                "duracao_horas INTEGER NOT NULL" +
                ");" );
        stmt.close();
        System.out.println(var);
    }
    void selecionarTodosCursos() throws SQLException {
        ResultSet rs;
        String sql = "Select * from curso";
        List<Curso> cursos = new ArrayList<>();
        rs = stmt.executeQuery(sql);
        while(rs.next()){
            Curso curso = new Curso();
            curso.setId(rs.getInt("id"));
            curso.setNome(rs.getString("nome"));
            curso.setDuracaoHoras(rs.getInt("duracao_horas"));
            cursos.add(curso);
        }
        cursos.stream().forEach(System.out::println);
        stmt.close();

    }
    void inserirCurso(String desc, int valor) throws SQLException {
        String nome = desc;
        int duracao = valor;
        String sql = "insert into curso " +
                "(nome, duracao_horas) " +
                "values ('"+nome+"'"+", "+duracao+")";
        stmt.execute(sql);
        stmt.close();
    }
    void removerCurso(String desc, int valor) throws SQLException {
        String nome = desc;
        int id = valor;
        String sql = "delete from curso where id="+id;
        stmt.execute(sql);
        stmt.close();
    }
    void pesquisarCurso(String desc, int valor) throws SQLException {

        ResultSet rs;
        String nome = desc;
        int id = valor;

        String sql = "select id, nome, duracao_horas from curso where id="+id;

        rs = stmt.executeQuery(sql);
        while(rs.next()){
            Curso curso = new Curso();
            curso.setId(rs.getInt("id"));
            curso.setNome(rs.getString("nome"));
            curso.setDuracaoHoras(rs.getInt("duracao_horas"));
            System.out.print(curso.getId()+", "+curso.getNome()+", "+ curso.duracaoHoras);

        }
        stmt.close();
    }
}





