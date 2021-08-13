package conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        //lista de nomes List<String> nomes = ArrayList<>() Vector<>()
        List<String> nomes = new ArrayList<>();
        nomes.add("Kevin Hoefler prata no skate");
        nomes.add("Daniel Cargnin bronze no judo");
        nomes.add("Rayssa Leal prata no skate - Fadinha do skate");
        nomes.add("Natalhie Monhousen foi desclassificada na esgrima");
        nomes.add("Mateus quer ser profeta");

        System.out.println(nomes);
        System.out.println(nomes.size());
        Collections.sort(nomes);
        nomes.remove("Mateus quer ser profeta");
        System.out.println("Removeu da lista Mateus");
        System.out.println(nomes);
        System.out.println(nomes.size());

        boolean temRayssa = nomes.contains("Rayssa Leal prata no skate - Fadinha do skate");
        System.out.println(temRayssa);
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        System.out.println("Esvaziando a lista");
        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
        System.out.println(nomes);

        nomes.add("Mateus quer ser profeta");
        int index = nomes.indexOf("Mateus quer ser profeta");
        System.out.println((index)+" "+nomes.get(index));

        //iterar
        for (String nome: nomes) {
            System.out.println("---->"+nome);
        }
        //iterar modos imperativos
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("pelo iterator ---->"+iterator.next());
        }
















    }

}
