package avancado.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Charles Gordon","Sr Rose Gordon","Norma Gordon","Norma Gordon","Sr Matthew Gordon"};
        Integer[] numeros = {32, 56, 24, 59};
        //imprimirNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes);
        //imprimirDobroDeCadaItemDaLista(numeros);
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);

    }
    public static void imprimirNomesFiltrados(String...nomes){
        String nomesParaImprimir="";
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals("Norma Gordon")){
                nomesParaImprimir+=""+nomes[i];
            }
        }


        System.out.println("Nomes do for: "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Norma"))
                .collect(Collectors.joining());
        System.out.println("Nomes do Stream: "+nomesParaImprimir);
    }
    public static void imprimirTodosNomes(String... nomes){
        for(String nome : nomes){
            System.out.println("Imprimido pelo for :"+nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach :"+nome));
    }
    public static void imprimirDobroDeCadaItemDaLista(Integer... numeros){
        for(Integer numero : numeros){
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero -> numero*2)
                .forEach(System.out::println);
    }
}
