package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        //add 10 personagens
        ninjas.add("Lee");
        ninjas.add("Neji");
        ninjas.add("Tente");
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Kakashi");
        ninjas.add("Might Guy");
        ninjas.add("Jiraiya");
        ninjas.add("Orochimaru");
        ninjas.add("Tsunade");
        ninjas.add("Konohamaru");
        System.out.println(ninjas);

        //Retornar o numero de elementos no stream
        System.out.println("Contagem :"+ninjas.stream().count());
        //Retornar o elemento com maior numero de letras
        System.out.println("Maior numero de letras :"+ninjas.stream().max(Comparator.comparingInt(String::length)));
        //Retornar o elemento com menor numero de letras
        System.out.println("Menor numero de letras :"+ninjas.stream().min(Comparator.comparingInt(String::length)));
        //Retornar os elementos que contem a letra r no nome.
        System.out.println("Nomes que contem a letra r :"+ninjas.stream().filter((ninja) ->
                ninja.toLowerCase().contains("r")).collect(Collectors.toList()));
        //Retorna uma nova colecao, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma colecao com a quantidade de letras: "+ninjas.stream().map(
        ninja -> ninja.concat(" -- ").concat(String.valueOf(ninja.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos  da colecao
        System.out.println("Retorna os 3 primeiros elementos :"+ninjas.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console, e depois retorna a mesma colecao
        System.out.println("Faz acao void(imprimi nessa)  e retorna os mesmo elementos:"+ninjas.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra colecao
        System.out.println("Retornar os elementos -acao efetuada void");
        ninjas.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem W no nome
        System.out.println("Todos os elemento tem W no nome?"+ninjas.stream().allMatch((elemento) -> elemento.contains("W")));

        //Retorna true se algum dos elementos possuem a letra surgerida
        System.out.println("Tem algum elemento com K no nome?"+ninjas.stream().anyMatch((elemento) -> elemento.contains("K")));

        //Retorna true se nenhum dos elementos possuem surgerida
        System.out.println("Nenhum elemento tem P no nome?"+ninjas.stream().noneMatch((elemento) -> elemento.contains("p")));

        //Retorna o primeiro elemento da colecao, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da lista?");
        ninjas.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operacao encadeada
        System.out.print("Operecao encadeada - acoes assycronos - concorrentes paralelas");
        System.out.println(ninjas.stream()
        .peek(System.out::println)
        .map(ninja -> ninja.concat("--").concat(String.valueOf(ninja.length())))
        .peek(System.out::println)
        .filter(ninja -> ninja.toLowerCase().contains("r"))
        //.collect(Collectors.toList()));
        .collect(Collectors.joining(", ")));
        //collect(Collectors.toSet(", ")));
        //collect(Collectors.groupingBy(ninja -> ninja.substring(estudante.indexOf("-")+1))));


    }
}
