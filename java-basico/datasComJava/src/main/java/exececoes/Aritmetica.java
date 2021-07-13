package exececoes;

public class Aritmetica {
    double resultado;

    void soma(double a,double b){
        resultado = a+b;
       System.out.println(resultado);
    }
    void subt(double a,double b){
        resultado = a-b;
        System.out.println(resultado);
    }
    void multiplicacao(double a, double b){
        resultado = a*b;
        System.out.println(resultado);
    }
    void div(double a, double b) throws ArithmeticException{
        resultado =a/b;
        try{
            if(resultado==Double.POSITIVE_INFINITY || resultado==Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
           System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Erro divisao por zero.");
        }
    }

}
