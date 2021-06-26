import java.io.*;
import java.util.Scanner;


public class  Exercicio03 {
   public static void main(String []args){
      //Situação Problema comissão sobre a  média de vendas jan,fev, mar, abr
     double valor1,valor2,valor3,valor4,media,abono;
     abono = 0; 
     Scanner s1 = new Scanner(System.in);
     System.out.println("Informe o valor das vendas em jan");
     valor1 = s1.nextDouble();
     Scanner s2 = new Scanner(System.in);
     System.out.println("Informe o valor das vendas em fev");
     valor2 = s2.nextDouble();
     Scanner s3 = new Scanner(System.in);
     System.out.println("Informe o valor das vendas em mar");
     valor3 = s3.nextDouble();
     System.out.println("Informe o valor das vendas em abr");
     Scanner s4 = new Scanner(System.in);
     valor4 = s4.nextDouble();
     
     media=(valor1+valor2+valor3+valor4)/4;
     System.out.println("A média de vendas é: "+media);
     
     if(media>5000){
         abono = 5*media/100;
	 System.out.println("O valor do abono será de 5%");
	 System.out.println("Abono de : "+abono);

     }else{
	abono = media*5/100;     
     	System.out.println("O valor do abono será de 3%");
        System.out.println("Abono de : "+abono);	
     }


   }

}
