package jdbc_daniel;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curso.class)
public abstract class Curso_ {

	public static volatile SingularAttribute<Curso, String> nome;
	public static volatile SingularAttribute<Curso, Integer> id;
	public static volatile SingularAttribute<Curso, Integer> duracaoHoras;

	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String DURACAO_HORAS = "duracaoHoras";

}

