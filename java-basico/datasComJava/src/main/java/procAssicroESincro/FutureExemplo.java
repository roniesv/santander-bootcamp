package procAssicroESincro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        /*exemplo 1
        casa.obterAfazeresDaCasa().forEach(atividade -> pessoasParaExecutarAtividade.execute(()->atividade.realizar()));
        pessoasParaExecutarAtividade.shutdown();*/
        List<? extends Future<String>> futuros =
                new CopyOnWriteArrayList<>(casa.obterAfazeresDaCasa().stream()
                        .map(atividade -> pessoasParaExecutarAtividade.submit(() -> {
                            try {
                                return atividade.realizar();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return null;
                        }))
                        .collect(Collectors.toList()));

        /*while(!futuros.stream().allMatch(Future::isDone)){
            int numeroDeAtividadesNaoFinalizadas =0;
            for (Future<?> futuro : futuros) {
                if (futuro.isDone()){

                    try {
                        System.out.println("Parabens voce terminou de "+futuro.get());
                        futuros.remove(futuro);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numeroDeAtividadesNaoFinalizadas++;
                }

            }
            System.out.println("Numero de atividades nao finalizadas :"+numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }*/
        //consegue imprimir o 3 parabens
        while(true){
            int numeroDeAtividadesNaoFinalizadas =0;
            for (Future<?> futuro : futuros) {
                if (futuro.isDone()){

                    try {
                        System.out.println("Parabens voce terminou de "+futuro.get());
                        futuros.remove(futuro);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numeroDeAtividadesNaoFinalizadas++;
                }
            }
            if (futuros.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Numero de atividades nao finalizadas :"+numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
        pessoasParaExecutarAtividade.shutdown();
    }
}
class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos){this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAfazeresDaCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(),(pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}
interface Atividade {
    String realizar() throws InterruptedException;
}
abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> obterAfazeresDoComodo(){
        return Arrays.asList(
                this::getArrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }
    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);

        String arrumar_o_guarda_roupa = "Arrumar o Guarda roupa";
        System.out.println(arrumar_o_guarda_roupa);

        return arrumar_o_guarda_roupa;
    }
    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(7000);

        String varrer_o_quarto = "Varrer o Quarto";
        System.out.println(varrer_o_quarto);
        return varrer_o_quarto;

    }
    private String getArrumarACama() throws InterruptedException {
            Thread.sleep(10000);
        String arrumar_a_cama = "Arrumar a Cama";
        System.out.println(arrumar_a_cama);
        return arrumar_a_cama;

    }


}
