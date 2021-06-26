import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02
{
	public static void main(String []args)
	{
   		Double nota1,nota2,nota3,nota4,media,total;
		
	        System.out.println("Digite a nota1");
		Scanner s1 = new Scanner(System.in);
		nota1 = s1.nextDouble();

		System.out.println("Digite a nota2");
		Scanner s2 = new Scanner(System.in);
		nota2 = s2.nextDouble();

		System.out.println("Digite a nota3");
		Scanner s3 = new Scanner(System.in);
		nota3 = s3.nextDouble();

		System.out.println("Digite a nota4");
		Scanner s4 = new Scanner(System.in);
		nota4 = s4.nextDouble();

		total = (nota1+nota2+nota3+nota4);
		media = (total)/4;
		System.out.println("Média das notas ="+media);
		System.out.println("Total das notas ="+total);	

   
	}

}
