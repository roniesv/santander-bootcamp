package conjuntos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HashMap {

    Map<String, List<String>> CaracteristicasPersonagens;
    String nome;

    public HashMap(String nome)
    {
        CaracteristicasPersonagens = new java.util.HashMap<>();
        this.nome = nome;
    }

    public static void main(String[] args) {
        HashMap map = new HashMap("Kof97");


        ArrayList bioIori = new ArrayList();
        bioIori.add("Possui sangue orochi");
        bioIori.add("Simbolo da lua");
        bioIori.add("Golpe Rusho");
        map.CaracteristicasPersonagens.put("Iori", bioIori);
        //put tambem server para atuaizar os valores

        ArrayList bioAthena = new ArrayList();
        bioAthena.add("Psico Soldier");
        bioAthena.add("Ninino nelo kick");
        bioAthena.add("Usa poderes telecineticos");
        bioAthena.add("Cantora Pop");
        map.CaracteristicasPersonagens.put("Athena", bioAthena);

        ArrayList bioTerry = new ArrayList();

        bioTerry.add("Terry");
        bioTerry.add("Kamehameha");
        bioTerry.add("soco fraco");
        bioTerry.add("socos multiplos");
        bioTerry.add("chidori");
        bioTerry.add("raikiri");
        bioTerry.add("galec ho");
        bioTerry.add("mazenko");
        bioTerry.add("kage bushin no jutsu");
        bioTerry.add("kiensan");
        bioTerry.add("chidori");

        map.CaracteristicasPersonagens.put("Terry", bioTerry);

        ArrayList bioNaruto = new ArrayList();
        bioNaruto.add("Rasengan");
        bioNaruto.add("Kage Bushin No Justu");
        bioNaruto.add("naruto");
        bioNaruto.add("Modo sabio");
        map.CaracteristicasPersonagens.put("Naruto", bioNaruto);


        //Relatorio da lista (lista todos, qtd)
        map.relatorioCaracteristicaPersonagens();

        //imprimir index pelo nome
        System.out.println("Buscar bio do Naruto");
        System.out.println(map.CaracteristicasPersonagens.get("Naruto"));


        //corrigir nome
        //System.out.println("Corrigindo nome Mattew Gordon --> Matt");
        //ClassificacaoJudo2021.AlterarNomeAtleta("Mattew Gordon", "Matt");
        //Relatorio apos corrigir nome
        //ClassificacaoJudo2021.relatorioDoJudo2021();

        //remover nomes da lista qualquer posicao e remove mesmo
        System.out.println("Removendo Naruto da lista");
        map.removerPersonagem("Naruto");
        //Relatorio apos remocoes
        map.relatorioCaracteristicaPersonagens();

//        //Procurar pelo index
//        System.out.println("Pesquisando proximo Atleta da fila");
//        System.out.println(golpesPersonagensDeAnimesFamosos.pesquisarProximoAtletaDaFila());
//        System.out.println("Retirar primeiro da fila");
//        golpesPersonagensDeAnimesFamosos.retirarPrimeiroAtleta();
//        golpesPersonagensDeAnimesFamosos.listarTodos();

        //Existe aluno na lista?
        System.out.println("Pesquisando se existe na lista o nome --> Iori");
        System.out.println(map.CaracteristicasPersonagens.containsKey("Iori"));
        //Segunda lista
        HashMap map2 = new HashMap("Naruto Ninjas");
        List<String> bioSasuke = new ArrayList<>();
        bioSasuke.add("Chidori");
        bioSasuke.add("Rajada do Leao");
        List<String> bioSakura = new ArrayList<>();
        bioSakura.add("Chanaroo");
        bioSakura.add("Selo de Regenerar");
        List<String> bioNarutoReal = new ArrayList<>();
        bioNarutoReal.add("Rasegan");
        bioNarutoReal.add("MultiClone das sombras");
        map2.CaracteristicasPersonagens.put("Naruto",bioNarutoReal);
        map2.CaracteristicasPersonagens.put("Sasuke",bioSasuke);
        map2.CaracteristicasPersonagens.put("Sakura",bioSakura);
        map2.relatorioCaracteristicaPersonagens();



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
          //map.listarTodos();
//        System.out.println("Listar Todos lista 2");
//        classificacaoSkate2021.listarTodos();
//        System.out.println("Lista 2 Decrescente");
//        //classificacaoSkate2021.ordemAlfabeticaZA();
//        classificacaoSkate2021.listarTodos();
//        //comparar listas
//        //golpesPersonagensDeAnimesFamosos.copiarLista(classificacaoSkate2021);
//        conjuntos.SetTeste nw = new conjuntos.SetTeste("Copiar");
//        nw.copiarLista(classificacaoSkate2021);
//        nw.listarTodos();
//        nw.eListaVazia();
        //nw.limparLista();









    }

    public void adicionarCaracteristicaElementar(String k, List<String>v){

        CaracteristicasPersonagens.put(k,v );
    }
    public void retirarPrimeiroAtleta(){
      //  golpesPersonagensDeAnimesFamosos.poll();
   }
    public void removerPersonagem(String k){
        CaracteristicasPersonagens.remove(k);
    }
    public void AlterarValores(String k, List<String> novo) {
//        int index =-1;
//        index = buscarIndexAtleta(nome);
//        atletas.set(index, novo);
    }
    public String pesquisarProximoAtletaDaFila(){
        //return atletas.get(index);//use element,pick(retorna null)
       // return golpesPersonagensDeAnimesFamosos.element();
        return "null";
    }
    public List<String> buscarIndexAtleta(String nome){
        List<String> valores;
        valores = CaracteristicasPersonagens.get(nome);
        return valores;

    }
    public void ordemAlfabeticaAZ()
    {
       // Collections.sort(golpesPersonagensDeAnimesFamosos);
    }
    public void ordemAlfabeticaZA(){

        //Collections.sort(golpesPersonagensDeAnimesFamosos,Collections.reverseOrder());

    }
    public void listarTodos(){
//        for (String key: CaracteristicasPersonagens.keySet()) {
//            System.out.println(key+"--"+ CaracteristicasPersonagens.get(key));
//        }

        for (Map.Entry<String, List<String>> personagem: CaracteristicasPersonagens.entrySet()){
            System.out.println(personagem.getKey()+"--"+personagem.getValue());
        }
//        Iterator<String> iteratorAtletas = atletas.iterator();
//        while(iteratorAtletas.hasNext()){
//            System.out.println("---->"+iteratorAtletas.next());
//        }

    }
    public int imprimirQuantidade(){
        return CaracteristicasPersonagens.size();
    }
    public boolean existeAtleta(String nome){
        boolean contem;
        contem =  CaracteristicasPersonagens.containsKey(nome);
        return contem;
    }
    public void adicionarLista(java.util.HashMap lista){
        CaracteristicasPersonagens.putAll(lista);

    }
    public void relatorioCaracteristicaPersonagens(){
        System.out.println("Relatorio do mapa dos personagens");
        System.out.println("==========================================");
        System.out.println(nome);
        System.out.println("==========================================");
        listarTodos();
        System.out.println("==========================================");
        System.out.println("Total de personagens ="+imprimirQuantidade());
        System.out.println("==========================================");

    }
    public void compararLista(SetTeste lista){
        System.out.println(CaracteristicasPersonagens.containsKey(lista.golpesPersonagensDeAnimesFamosos));
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
        System.out.println(CaracteristicasPersonagens.isEmpty());
    }





}
