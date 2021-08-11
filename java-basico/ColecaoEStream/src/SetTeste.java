import java.util.HashSet;
import java.util.Set;

public class SetTeste {
    //Estrutura Lista nao ordenada
    HashSet<String> golpesPersonagensDeAnimesFamosos;
    String descricao;

    public SetTeste(String descricao)
    {
        golpesPersonagensDeAnimesFamosos = new HashSet<>();
        this.descricao = descricao;
    }

    public static void main(String[] args) {
        SetTeste SetTeste = new SetTeste("E ki e chakra e golpes lendarios dos animes");

        //adicionando ok
        SetTeste.adicionarGolpe("Rasegan");
        SetTeste.adicionarGolpe("Kamehameha");
        SetTeste.adicionarGolpe("soco fraco");
        SetTeste.adicionarGolpe("socos multiplos");
        SetTeste.adicionarGolpe("chidori");
        SetTeste.adicionarGolpe("raikiri");
        SetTeste.adicionarGolpe("galec ho");
        SetTeste.adicionarGolpe("mazenko");
        SetTeste.adicionarGolpe("kage bushin no jutsu");
        SetTeste.adicionarGolpe("kiensan");
        SetTeste.adicionarGolpe("chidori");

        //Relatorio da lista (lista todos, qtd)
        System.out.println("Relatorio da 1 Lista nao ordenada");
        SetTeste.relatorioGolpesFamososAnimes();
        //imprimir index pelo nome
        //System.out.println("Buscar Index do Mattew Gordon");
        //System.out.println(ClassificacaoJudo2021.buscarIndexAtleta("Mattew Gordon"));
        //corrigir nome
        //System.out.println("Corrigindo nome Mattew Gordon --> Matt");
        //ClassificacaoJudo2021.AlterarNomeAtleta("Mattew Gordon", "Matt");
        //Relatorio apos corrigir nome
        //ClassificacaoJudo2021.relatorioDoJudo2021();
        //remover nomes da lista qualquer posicao e remove mesmo
        //System.out.println("Removendo Matt e Rose Gordon da 1 lista");
        //adicionarGolpe.removerAtleta("Mattew Gordon");
        //adicionarGolpe.removerAtleta("Rose Gordon");
        //Relatorio apos remocoes
        //golpesPersonagensDeAnimesFamosos.relatorioDoJudo2021();
        //Procurar pelo index
        //System.out.println("Pesquisando proximo Atleta da fila");
        //System.out.println(golpesPersonagensDeAnimesFamosos.pesquisarProximoAtletaDaFila());
        //System.out.println("Retirar primeiro da fila");
        //golpesPersonagensDeAnimesFamosos.retirarPrimeiroAtleta();
        //golpesPersonagensDeAnimesFamosos.listarTodos();

        //Existe aluno na lista?
        //System.out.println("Pesquisando se existe na lista o nome --> Charle Gordon");
        //System.out.println(golpesPersonagensDeAnimesFamosos.existeAtleta("Charle Gordon"));
        //Segunda lista
//        SetTeste classificacaoSkate2021 = new SetTeste("Olimpiadas de tokio 2021 - Skate");
//        classificacaoSkate2021.adicionarGolpe("Gon");
//        classificacaoSkate2021.adicionarGolpe("Killua");
//        classificacaoSkate2021.adicionarGolpe("Macunaima");


        //Relatorio Segunda lista
//        System.out.println("Relatorio 2 lista");
//        classificacaoSkate2021.relatorioGolpesFamososAnimes();
//        //Adicionar Segunda lista na Primeira lista
//        System.out.println("Adicionando toda a lista 2 na lista 1");
//        //golpesPersonagensDeAnimesFamosos.adicionarLista(classificacaoSkate2021.golpesPersonagensDeAnimesFamosos);
//        //Relatorio da Primeira lista depois de juntar os elementos da segunda
//        System.out.println("Relatorio Lista 1 Apos a inclusao da outra lista");
//        //golpesPersonagensDeAnimesFamosos.relatorioDoJudo2021();
//        //adicionar um elemento da segunda lista
//        System.out.println("Adicionando Alidio na lista 2");
//        classificacaoSkate2021.adicionarGolpe("Alidio");
//        //ordena segunda lista
//        System.out.println("Ordenando 2 lista em ordem Alfabetica");
//        //classificacaoSkate2021.ordemAlfabeticaAZ();
//        //Relatorio da segunda lista apos mudancas
//        classificacaoSkate2021.relatorioGolpesFamososAnimes();
//        //adiciona elemento na segunda lista
//        System.out.println("Removendo Macunaima da 1 primeira Lista");
//        //golpesPersonagensDeAnimesFamosos.removerAtleta("Macunaima");
//        //relatorio da primeira lista removido elemento
//        //golpesPersonagensDeAnimesFamosos.relatorioDoJudo2021();
//        //lista todos
//        System.out.println("Listar Todos lista 1");
        SetTeste.listarTodos();
//        System.out.println("Listar Todos lista 2");
//        classificacaoSkate2021.listarTodos();
//        System.out.println("Lista 2 Decrescente");
//        //classificacaoSkate2021.ordemAlfabeticaZA();
//        classificacaoSkate2021.listarTodos();
//        //comparar listas
//        //golpesPersonagensDeAnimesFamosos.copiarLista(classificacaoSkate2021);
//        SetTeste nw = new SetTeste("Copiar");
//        nw.copiarLista(classificacaoSkate2021);
//        nw.listarTodos();
//        nw.eListaVazia();
        //nw.limparLista();









    }

    public void adicionarGolpe(String nome){
        golpesPersonagensDeAnimesFamosos.add(nome);
    }
//    public void retirarPrimeiroAtleta(){
//        golpesPersonagensDeAnimesFamosos.poll();
//   }
    public void removerAtleta(String nome){
        golpesPersonagensDeAnimesFamosos.remove(nome);
    }
//    public void AlterarNomeAtleta(String nome, String novo) {
////        int index =-1;
////        index = buscarIndexAtleta(nome);
////        atletas.set(index, novo);
//    }
//    public String pesquisarProximoAtletaDaFila(){
//        //return atletas.get(index);//use element,pick(retorna null)
//        return golpesPersonagensDeAnimesFamosos.element();
//    }
//    public int buscarIndexAtleta(String nome){
//        int index;
//        index = atletas.indexOf(nome);
//        return index;
//        return 0;
//    }
//    public void ordemAlfabeticaAZ()
//    {
//        Collections.sort(golpesPersonagensDeAnimesFamosos);
//    }
//    public void ordemAlfabeticaZA(){
//
//        Collections.sort(golpesPersonagensDeAnimesFamosos,Collections.reverseOrder());
//
//    }
    public void listarTodos(){
        for (String nome: golpesPersonagensDeAnimesFamosos) {
            System.out.println(nome);
        }
//        Iterator<String> iteratorAtletas = atletas.iterator();
//        while(iteratorAtletas.hasNext()){
//            System.out.println("---->"+iteratorAtletas.next());
//        }

    }
    public void imprimirQuantidade(){
        System.out.println("Total de atletas ="+ golpesPersonagensDeAnimesFamosos.size());
    }
    public boolean existeAtleta(String nome){
        boolean contem;
        contem =  golpesPersonagensDeAnimesFamosos.contains(nome);
        return contem;
    }
    public void adicionarLista(HashSet lista){
        golpesPersonagensDeAnimesFamosos.addAll(lista);

    }
    public void relatorioGolpesFamososAnimes(){
        System.out.println("==========================================");
        System.out.println(descricao);
        System.out.println("==========================================");
        listarTodos();
        System.out.println("==========================================");
        imprimirQuantidade();
        System.out.println("==========================================");

    }
    public void compararLista(SetTeste lista){
        System.out.println(golpesPersonagensDeAnimesFamosos.containsAll(lista.golpesPersonagensDeAnimesFamosos));
    }
    public SetTeste copiarLista(SetTeste lista){
        SetTeste aux = new SetTeste("Copy Auxiliar");
        aux.golpesPersonagensDeAnimesFamosos.addAll(lista.golpesPersonagensDeAnimesFamosos);
        System.out.println(aux.golpesPersonagensDeAnimesFamosos);
        System.out.println(lista.golpesPersonagensDeAnimesFamosos);
        lista.adicionarGolpe("teste");
        aux.adicionarGolpe("teste");
        System.out.println(aux.golpesPersonagensDeAnimesFamosos);
        System.out.println(lista.golpesPersonagensDeAnimesFamosos);
        aux.compararLista(lista);


        return aux;
    }
    public void limparLista(SetTeste lista){
        lista.golpesPersonagensDeAnimesFamosos.clear();
    }
    public void eListaVazia(){
        System.out.println(golpesPersonagensDeAnimesFamosos.isEmpty());
    }


}
