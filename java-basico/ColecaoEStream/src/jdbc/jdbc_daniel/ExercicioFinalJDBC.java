package jdbc.jdbc_daniel;

import java.sql.SQLException;

public class ExercicioFinalJDBC {
    public static void main(String[] args) throws SQLException {

//        CursoDao dao1 = new CursoDao();
//        dao1.inserirCurso("java fullstack",120);
//       CursoDao dao2 = new CursoDao();
//        dao2.selecionarTodosCursos();
//        CursoDao dao3 = new CursoDao();
//        dao3.criarCurso();
        CursoDao dao3 = new CursoDao();
        dao3.pesquisarCurso("nao me lembro", 4);
       // dao2.selecionarTodosCursos();

    }

}
