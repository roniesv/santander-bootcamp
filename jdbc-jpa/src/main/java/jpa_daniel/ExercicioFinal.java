package jpa_daniel;

import jdbc_daniel.Curso;
import jdbc_daniel.Curso_;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ExercicioFinal {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dio-curso");
        EntityManager em = emf.createEntityManager();
        String nome = "dio";


        Curso cursoParaAdicionar = new Curso("FutebolCursos.com", 200);
        Curso cursoParaAdicionar2 = new Curso("Politica Gabriela Priori", 120);
        Curso cursoParaAdicionar3 = new Curso("dio", 120);


        em.getTransaction().begin();
        em.persist(cursoParaAdicionar);
        em.persist(cursoParaAdicionar2);
        em.persist(cursoParaAdicionar3);
        em.getTransaction().commit();


        // 2.3 - SQL nativo

//        // Trazendo somente 1 resultado
//        String sql = "select * from CURSO where nome = "+"'"+nome+"'";
//        Curso cursoSQL = (Curso) em
//                .createNativeQuery(sql, Curso.class)
//                //.setParameter("nome", nome)
//                .getSingleResult();
//
//        // Trazendo uma lista como resultado
//        String sqlList = "SELECT * FROM CURSO";
//        List<Curso> cursoSQLList = em
//                .createNativeQuery(sqlList, Curso.class)
//                .getResultList();
//
//        // Resultados das consultas acima
//        System.out.println("Consulta cursoSQL: " + cursoSQL);
//        cursoSQLList.forEach(Curso -> System.out.println("Consulta cursoSQLList: " + Curso));


        // 2.4 - JPQL

        // Trazendo somente 1 resultado


        // =============================================================================================================

        // 2.5 - JPA Criteria API + JPA Metamodel

        // Trazendo somente 1 resultado
        CriteriaQuery<Curso> criteriaQuery = em.getCriteriaBuilder().createQuery(Curso.class);
        Root<Curso> cursoRoot = criteriaQuery.from(Curso.class);
        CriteriaBuilder.In<String> inClause = em.getCriteriaBuilder().in(cursoRoot.get(Curso_.nome));
        inClause.value(nome);
        criteriaQuery.select(cursoRoot).where(inClause);
        Curso cursoAPICriteria = em.createQuery(criteriaQuery).getSingleResult();

        // Trazendo uma lista como resultado
        CriteriaQuery<Curso> criteriaQueryList = em.getCriteriaBuilder().createQuery(Curso.class);
        Root<Curso> alunoRootList = criteriaQueryList.from(Curso.class);
        List<Curso> cursoAPICriteriaList = em.createQuery(criteriaQueryList).getResultList();

        // Resultados das consultas acima
        System.out.println("Consulta alunoAPICriteria: " + cursoAPICriteria);
        cursoAPICriteriaList.forEach(Curso -> System.out.println("Consulta cursoAPICriteriaList: " + Curso));


        em.close();
        emf.close();

    }
}
