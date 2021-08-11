import java.util.*;

public class FilaDoPodio {
    //Estrutura Fila
    Queue<String> atletas;
    String descricao;

    public FilaDoPodio(String descricao)
    {
        this.atletas= new LinkedList<>();
        this.descricao = descricao;
    }

    public static void main(String[] args) {
        FilaDoPodio ClassificacaoJudo2021 = new FilaDoPodio("Olimpiadas de tokio 2021 - judo");

        //adicionando ok
        ClassificacaoJudo2021.adicionarAtleta("Miguel");
        ClassificacaoJudo2021.adicionarAtleta("Isac");
        ClassificacaoJudo2021.adicionarAtleta("Charle Gordon");
        ClassificacaoJudo2021.adicionarAtleta("Norma Gordon");
        ClassificacaoJudo2021.adicionarAtleta("Ray");
        ClassificacaoJudo2021.adicionarAtleta("Emma");
        ClassificacaoJudo2021.adicionarAtleta("Norma");
        ClassificacaoJudo2021.adicionarAtleta("Rose Gordon");
        ClassificacaoJudo2021.adicionarAtleta("Mattew Gordon");
        ClassificacaoJudo2021.adicionarAtleta("Snoopy");
        //Relatorio da lista (lista todos, qtd)
        System.out.println("Relatorio da 1 fila");
        ClassificacaoJudo2021.relatorioDoJudo2021();
        //imprimir index pelo nome
        //System.out.println("Buscar Index do Mattew Gordon");
        //System.out.println(ClassificacaoJudo2021.buscarIndexAtleta("Mattew Gordon"));
        //corrigir nome
        //System.out.println("Corrigindo nome Mattew Gordon --> Matt");
        //ClassificacaoJudo2021.AlterarNomeAtleta("Mattew Gordon", "Matt");
        //Relatorio apos corrigir nome
        //ClassificacaoJudo2021.relatorioDoJudo2021();
        //remover nomes da lista qualquer posicao e remove mesmo
        System.out.println("Removendo Matt e Rose Gordon da 1 lista");
        ClassificacaoJudo2021.removerAtleta("Mattew Gordon");
        ClassificacaoJudo2021.removerAtleta("Rose Gordon");
        //Relatorio apos remocoes
        ClassificacaoJudo2021.relatorioDoJudo2021();
        //Procurar pelo index
        System.out.println("Pesquisando proximo Atleta da fila");
        System.out.println(ClassificacaoJudo2021.pesquisarProximoAtletaDaFila());
        System.out.println("Retirar primeiro da fila");
        ClassificacaoJudo2021.retirarPrimeiroAtleta();
        ClassificacaoJudo2021.listarTodos();

        //Existe aluno na lista?
        System.out.println("Pesquisando se existe na lista o nome --> Charle Gordon");
        System.out.println(ClassificacaoJudo2021.existeAtleta("Charle Gordon"));
        //Segunda lista
        FilaDoPodio classificacaoSkate2021 = new FilaDoPodio("Olimpiadas de tokio 2021 - Skate");
        classificacaoSkate2021.adicionarAtleta("Gon");
        classificacaoSkate2021.adicionarAtleta("Killua");
        classificacaoSkate2021.adicionarAtleta("Macunaima");


        //Relatorio Segunda lista
        System.out.println("Relatorio 2 lista");
        classificacaoSkate2021.relatorioDoJudo2021();
        //Adicionar Segunda lista na Primeira lista
        System.out.println("Adicionando toda a lista 2 na lista 1");
        ClassificacaoJudo2021.adicionarLista(classificacaoSkate2021.atletas);
        //Relatorio da Primeira lista depois de juntar os elementos da segunda
        System.out.println("Relatorio Lista 1 Apos a inclusao da outra lista");
        ClassificacaoJudo2021.relatorioDoJudo2021();
        //adicionar um elemento da segunda lista
        System.out.println("Adicionando Alidio na lista 2");
        classificacaoSkate2021.adicionarAtleta("Alidio");
        //ordena segunda lista
        System.out.println("Ordenando 2 lista em ordem Alfabetica");
        classificacaoSkate2021.ordemAlfabeticaAZ();
        //Relatorio da segunda lista apos mudancas
        classificacaoSkate2021.relatorioDoJudo2021();
        //adiciona elemento na segunda lista
        System.out.println("Removendo Macunaima da 1 primeira Lista");
        ClassificacaoJudo2021.removerAtleta("Macunaima");
        //relatorio da primeira lista removido elemento
        ClassificacaoJudo2021.relatorioDoJudo2021();
        //lista todos
        System.out.println("Listar Todos lista 1");
        ClassificacaoJudo2021.listarTodos();
        System.out.println("Listar Todos lista 2");
        classificacaoSkate2021.listarTodos();
        System.out.println("Lista 2 Decrescente");
        classificacaoSkate2021.ordemAlfabeticaZA();
        classificacaoSkate2021.listarTodos();
        //comparar listas
        ClassificacaoJudo2021.copiarLista(classificacaoSkate2021);
        FilaDoPodio nw = new FilaDoPodio("Copiar");
        nw.copiarLista(classificacaoSkate2021);
        nw.listarTodos();
        nw.eListaVazia();
        //nw.limparLista();









    }

    public void adicionarAtleta(String nome){
        atletas.add(nome);
    }
    public void retirarPrimeiroAtleta(){
        atletas.poll();
    }
    public void removerAtleta(String nome){
        atletas.remove(nome);
    }
    public void AlterarNomeAtleta(String nome, String novo) {
//        int index =-1;
//        index = buscarIndexAtleta(nome);
//        atletas.set(index, novo);
    }
    public String pesquisarProximoAtletaDaFila(){
        //return atletas.get(index);//use element,pick(retorna null)
        return atletas.element();
    }
    public int buscarIndexAtleta(String nome){
        /*int index =-1;
        index = atletas.indexOf(nome);
        return index;*/
        return 0;
    }
    public void ordemAlfabeticaAZ()
    {
//        Collections.sort(atletas);
    }
    public void ordemAlfabeticaZA(){
/*
        Collections.sort(atletas,Collections.reverseOrder());
*/
    }
    public void listarTodos(){
        for (String nome:atletas) {
            System.out.println(nome);
        }
//        Iterator<String> iteratorAtletas = atletas.iterator();
//        while(iteratorAtletas.hasNext()){
//            System.out.println("---->"+iteratorAtletas.next());
//        }

    }
    public void imprimirQuantidade(){
        System.out.println("Total de atletas ="+atletas.size());
    }
    public boolean existeAtleta(String nome){
        boolean contem;
        contem =  atletas.contains(nome);
        return contem;
    }
    public void adicionarLista(Queue fila){
        atletas.addAll(fila);

    }
    public void relatorioDoJudo2021(){
        System.out.println("==========================================");
        System.out.println(descricao);
        System.out.println("==========================================");
        listarTodos();
        System.out.println("==========================================");
        imprimirQuantidade();
        System.out.println("==========================================");

    }
    public void compararLista(FilaDoPodio lista){
        System.out.println(atletas.containsAll(lista.atletas));
    }
    public FilaDoPodio copiarLista(FilaDoPodio lista){
        FilaDoPodio aux = new FilaDoPodio("Copy Auxiliar");
        aux.atletas.addAll(lista.atletas);
        System.out.println(aux.atletas);
        System.out.println(lista.atletas);
        lista.adicionarAtleta("teste");
        aux.adicionarAtleta("teste");
        System.out.println(aux.atletas);
        System.out.println(lista.atletas);
        aux.compararLista(lista);


        return aux;
    }
    public void limparLista(FilaDoPodio lista){
        lista.atletas.clear();
    }
    public void eListaVazia(){
        System.out.println(atletas.isEmpty());
    }


}
