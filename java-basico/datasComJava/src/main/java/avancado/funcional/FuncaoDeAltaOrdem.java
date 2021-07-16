package avancado.funcional;

public class FuncaoDeAltaOrdem {

    public static void main(String[] args) {
        //declara o comportamento a funcao.
        Calculo soma = (a, b) -> a+b;
        Calculo subtracao = (a, b) -> a-b;
        Calculo multiplicacao = (a, b) -> a*b;
        Calculo divisao = (a, b) -> a/b;

        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(subtracao,4,3));
        System.out.println(executarOperacao(multiplicacao,4,2));
        System.out.println(executarOperacao(divisao,7,3));


    }
    //funcao de alta ordem abaixo recebe uma funcao como parametro.
    public static int  executarOperacao(Calculo calculo, int a , int b){
        return calculo.calcular(a, b);
    }

}
@FunctionalInterface
interface Calculo {
    //defini os parametros de entrada
    public int calcular(int a, int b);
}
