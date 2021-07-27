import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDePasseioEscolar {
    List<String> alunos;
    String descricao;

    public ListaDePasseioEscolar(String descricao)
    {
        this.alunos = new ArrayList<>();
        this.descricao = descricao;
    }

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
        listaPasseiJequitibar.relatorioDoPasseio();
        //imprimir index pelo nome
        System.out.println("Buscar Index do Mattew Gordon");
        System.out.println(listaPasseiJequitibar.buscarIndexAluno("Mattew Gordon"));
        //corrigir nome
        System.out.println("Corrigindo nome Mattew Gordon --> Matt");
        listaPasseiJequitibar.AlterarNomeAluno("Mattew Gordon", "Matt");
        //Relatorio apos corrigir nome
        listaPasseiJequitibar.relatorioDoPasseio();
        //remover nomes da lista
        System.out.println("Removendo Matt e Rose Gordon da 1 lista");
        listaPasseiJequitibar.removerAluno("Matt");
        listaPasseiJequitibar.removerAluno("Rose Gordon");
        //Relatorio apos remocoes
        listaPasseiJequitibar.relatorioDoPasseio();
        //Procurar pelo index
        System.out.println("Pesquisando pelo Index --> 1");
        System.out.println(listaPasseiJequitibar.pesquisarAlunoPeloIndex(1));
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
        trilha.relatorioDoPasseio();
        //Adicionar Segunda lista na Primeira lista
        System.out.println("Adicionando toda a lista 2 na lista 1");
        listaPasseiJequitibar.adicionarLista(trilha.alunos);
        //Relatorio da Primeira lista depois de juntar os elementos da segunda
        System.out.println("Relatorio Lista 1 Apos a inclusao da outra lista");
        listaPasseiJequitibar.relatorioDoPasseio();
        //adicionar um elemento da segunda lista
        System.out.println("Adicionando Alidio na lista 2");
        trilha.adicionarAluno("Alidio");
        //ordena segunda lista
        System.out.println("Ordenando 2 lista em ordem Alfabetica");
        trilha.ordemAlfabeticaAZ();
        //Relatorio da segunda lista apos mudancas
        trilha.relatorioDoPasseio();
        //adiciona elemento na segunda lista
        System.out.println("Removendo Macunaima da 1 primeira Lista");
        listaPasseiJequitibar.removerAluno("Macunaima");
        //relatorio da primeira lista removido elemento
        listaPasseiJequitibar.relatorioDoPasseio();
        //lista todos
        System.out.println("Listar Todos lista 1");
        listaPasseiJequitibar.listarTodos();
        System.out.println("Listar Todos lista 2");
        trilha.listarTodos();
        System.out.println("Lista 2 Decrescente");
        trilha.ordemAlfabeticaZA();
        trilha.listarTodos();
        //comparar listas
        listaPasseiJequitibar.copiarLista(trilha);








    }

    public void adicionarAluno(String nome){
        alunos.add(nome);
    }
    public void removerAluno(String nome){
        alunos.remove(nome);
    }
    public void AlterarNomeAluno(String nome, String novo) {
        int index =-1;
        index = buscarIndexAluno(nome);
        alunos.set(index, novo);
    }
    public String pesquisarAlunoPeloIndex(int index){
        return alunos.get(index);
    }
    public int buscarIndexAluno(String nome){
        int index =-1;
        index = alunos.indexOf(nome);
        return index;
    }
    public void ordemAlfabeticaAZ()
    {
        Collections.sort(alunos);
    }
    public void ordemAlfabeticaZA(){
        Collections.sort(alunos,Collections.reverseOrder());
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
    public void adicionarLista(List lista){
        alunos.addAll(lista);

    }
    public void relatorioDoPasseio(){
        System.out.println("==========================================");
        System.out.println(descricao);
        System.out.println("==========================================");
        listarTodos();
        System.out.println("==========================================");
        imprimirQuantidade();
        System.out.println("==========================================");

    }
    public void compararLista(ListaDePasseioEscolar lista){
        System.out.println(alunos.containsAll(lista.alunos));
    }
    public ListaDePasseioEscolar copiarLista(ListaDePasseioEscolar lista){
        ListaDePasseioEscolar aux = new ListaDePasseioEscolar("Copy Auxiliar");
        aux.alunos.addAll(lista.alunos);
        System.out.println(aux.alunos);
        System.out.println(lista.alunos);
        lista.adicionarAluno("teste");
        aux.adicionarAluno("teste");
        System.out.println(aux.alunos);
        System.out.println(lista.alunos);
        aux.compararLista(lista);


        return aux;
    }


}
