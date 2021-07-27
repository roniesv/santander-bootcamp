import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDePasseioEscolar {
    List<String> alunos;
    String descricao;

    public static void main(String[] args) {
        ListaDePasseioEscolar listaPasseiJequitibar = new ListaDePasseioEscolar("Passeio no Parque jequitiba sobradinho");
        listaPasseiJequitibar.adicionarAluno("Miguel");
        listaPasseiJequitibar.adicionarAluno("Isac");
        listaPasseiJequitibar.adicionarAluno("Charle Gordon");
        listaPasseiJequitibar.adicionarAluno("Norma Gordon");
        listaPasseiJequitibar.adicionarAluno("Ray");
        listaPasseiJequitibar.adicionarAluno("Emma");
        listaPasseiJequitibar.adicionarAluno("Norma");
        listaPasseiJequitibar.adicionarAluno("Rose Gordon");
        listaPasseiJequitibar.adicionarAluno("Mattew Gordon");
        listaPasseiJequitibar.adicionarAluno("Snoopy");
        //Relatorio da lista
        System.out.println("Relatorio da 1 lista");
        listaPasseiJequitibar.relatorioDoPasseio(listaPasseiJequitibar);
        //imprimir index pelo nome
        System.out.println("Buscar Index do Mattew Gordon");
        System.out.println(listaPasseiJequitibar.buscarAluno("Mattew Gordon"));
        //corrigir nome
        System.out.println("Corrigindo nome Mattew Gordon --> Matt");
        listaPasseiJequitibar.atualizarPorNomeAluno("Mattew Gordon", "Matt");
        //Relatorio apos corrigir nome
        listaPasseiJequitibar.relatorioDoPasseio(listaPasseiJequitibar);
        //remover nomes da lista
        System.out.println("Removendo Matt e Rose Gordon da 1 lista");
        listaPasseiJequitibar.removerAluno("Matt");
        listaPasseiJequitibar.removerAluno("Rose Gordon");
        //Relatorio apos remocoes
        listaPasseiJequitibar.relatorioDoPasseio(listaPasseiJequitibar);
        //Procurar pelo index
        System.out.println("Pesquisando pelo Index --> 1");
        System.out.println(listaPasseiJequitibar.pesquisarPosicao(1));
        //Existe aluno na lista?
        System.out.println("Pesquisando se existe na lista o nome --> Charle Gordon");
        System.out.println(listaPasseiJequitibar.existeAluno("Charle Gordon"));
        //Segunda lista
        ListaDePasseioEscolar trilha = new ListaDePasseioEscolar("Trilha no parque jequitiba");
        trilha.adicionarAluno("Gon");
        trilha.adicionarAluno("Killua");
        trilha.adicionarAluno("Macunaima");


        //Relatorio Segunda lista
        System.out.println("Relatorio 2 lista");
        trilha.relatorioDoPasseio(trilha);
        //Adicionar Segunda lista na Primeira lista
        System.out.println("Adicionando toda a lista 2 na lista 1");
        listaPasseiJequitibar.adicionarLista(trilha.alunos, listaPasseiJequitibar.alunos);
        //Relatorio da Primeira lista depois de juntar os elementos da segunda
        System.out.println("Relatorio Lista 1 Apos a inclusao da outra lista");
        listaPasseiJequitibar.relatorioDoPasseio(listaPasseiJequitibar);
        //adicionar um elemento da segunda lista
        System.out.println("Adicionando Alidio na lista 2");
        trilha.adicionarAluno("Alidio");
        //ordena segunda lista
        System.out.println("Ordenando 2 lista em ordem Alfabetica");
        trilha.ordemAlfabeticaAZ(trilha.alunos);
        //Relatorio da segunda lista apos mudancas
        trilha.relatorioDoPasseio(trilha);
        //adiciona elemento na segunda lista
        System.out.println("Removendo Macunaima da 1 primeira Lista");
        listaPasseiJequitibar.removerAluno("Macunaima");
        //relatorio da primeira lista removido elemento
        listaPasseiJequitibar.relatorioDoPasseio(listaPasseiJequitibar);





    }

    public ListaDePasseioEscolar(String descricao)
    {
        this.alunos = new ArrayList<>();
        this.descricao = descricao;
    }

    public void adicionarAluno(String nome){
        alunos.add(nome);
    }
    public void removerAluno(String nome){
        alunos.remove(nome);
    }
    public void atualizarPorNomeAluno( String nome, String novo) {
        int index =-1;
        index = buscarAluno(nome);
        alunos.set(index, novo);
    }
    public String pesquisarPosicao(int index){
        return alunos.get(index);
    }
    public int buscarAluno(String nome){
        int index =-1;
        index = alunos.indexOf(nome);
        return index;
    }
    public void ordemAlfabeticaAZ(List lista)
    {
        Collections.sort(lista);
    }
    public void listarTodos(){
        for (String nome:alunos) {
            System.out.println(nome);
        }

    }
    public void imprimirQuantidade(){
        System.out.println("Total de Alunos ="+alunos.size());
    }
    public boolean existeAluno(String nome){
        boolean contem;
        contem =  alunos.contains(nome);
        return contem;
    }
    public void adicionarLista(List lista, List ListaDestino){
        ListaDestino.addAll(lista);

    }
    public void relatorioDoPasseio(ListaDePasseioEscolar lista){
        System.out.println("==========================================");
        System.out.println(lista.descricao);
        System.out.println("==========================================");
        lista.listarTodos();
        System.out.println("==========================================");
        lista.imprimirQuantidade();
        System.out.println("==========================================");

    }


}
