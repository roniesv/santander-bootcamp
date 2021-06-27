import java.io.*;
import java.util.Scanner;

public class Exercicio05 {
  public static void main(String []args){
     //desvios condicionais e comentários if e switch;
     
     /*System.out.println("Escolhar uma das opções 1- Abrir Netflix 2 - Abrir Amazon Prime 3 - Abrir HBO Go");
     int menu = 0;
     Scanner s = new Scanner(System.in);
     menu = s.nextInt();
     System.out.println("Sua opção "+menu);

     if(menu == 1){
        System.out.println("OK! Abrir Netflix!");
     }
     if(menu == 2){
	System.out.println("OK! Abrir Amazon Prime!");
     
     }
     if (menu ==3 ) {
	System.out.println("OK! Abrir HBO GO!");
     
     }
     if (menu == 4) {
	System.out.println("Saindo do menu...");
     
     }
     if(!(menu == 1 ||  menu == 2 || menu ==3 || menu == 4)) {
        System.out.println("Digite uma opção válida do menu");
     }

  }
  */
  System.out.println("Escolhar uma das opções 1- Abrir Netflix 2 - Abrir Amazon Prime 3 - Abrir HBO Go 4 - Sair do menu");
     int menu = 0;
     Scanner s = new Scanner(System.in);
     menu = s.nextInt();
     System.out.println("Sua opção "+menu);


     switch(menu){
      
     case 1:
        System.out.println("OK! Abrir Netflix!");
     break;

     case 2: 
	System.out.println("OK! Abrir Amazon Prime!");
     break;
     case 3:
	System.out.println("OK! Abrir HBO GO!");
     break;
     case 4:
	System.out.println("Saindo do menu...");
     break;
     default:
        System.out.println("Digite uma opção válida do menu");
     }

  }
 
}
