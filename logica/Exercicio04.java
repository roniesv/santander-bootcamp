public class Exercicio04
{
  //tabuada do nove
  public static void main(String []args){ 
    int limite;
    int valor;
    int numero;
	  
     valor = 9;
     limite = 10;
     numero = 1;
     System.out.println("tabuada do nº "+valor);

     for(;numero<=limite; numero=numero+1){
        valor = 9 * numero;
	System.out.println("9 x "+numero+" = "+valor);
     }
  
  }
}
