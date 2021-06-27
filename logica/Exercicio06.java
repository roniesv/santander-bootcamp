import java.io.*;
import java.util.Scanner;

public class Exercicio06 {
   public static void main(String[] args){
      // tabuadas personalizadas. laço do while
      int contador, limite, resultado, tabuada;

      contador = 0;
      
      // Pedir tabuada
      System.out.println("Qual tabuada pretendida?");
      Scanner s1 = new Scanner(System.in);
      tabuada = s1.nextInt();

    
      // Pedir limite
      System.out.println("Até quanto?");
      Scanner s2 = new Scanner(System.in);
      limite = s2.nextInt();

     do{
     resultado = tabuada * contador;
     System.out.println(tabuada+" x " +contador+" = " +resultado);
	     
     contador++;
     }while(contador <= limite); 

   
   }


}
