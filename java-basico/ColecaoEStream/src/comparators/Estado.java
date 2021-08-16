package comparators;

import java.util.Objects;

public class Estado implements  Comparable<Estado> {
    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return regiao == estado.regiao && descricao.equals(estado.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, regiao);
    }

    String descricao;
    int regiao;

    public Estado(String descricao, int regiao) {
        this.descricao = descricao;
        this.regiao = regiao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getRegiao() {
        return regiao;
    }

    public void setRegiao(int regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return
                "descricao='" + descricao + '\'' +
                ", regiao=" + regiao;
    }
@Override
public int compareTo(Estado o) {
        return this.getDescricao().length() - o.getDescricao().length();
        }
}
