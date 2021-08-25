package jdbc_daniel;

import javax.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String nome;

    @Column(nullable = false)
    int duracaoHoras;

    public Curso(){}
    public Curso(String nome, int duracaoHoras) {
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nome=" + nome +
                ", duracaoHoras=" + duracaoHoras;
    }
}
