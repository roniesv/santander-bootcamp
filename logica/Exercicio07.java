public class Exercicio07 {
   public static void main(String[] args){
   //Crie uma tabela nome cidade tel e imprima a tabela.
   

   String[][] clientes;
   clientes = new String[3][3];

   clientes[0][0] = "Tanjiro drag";
   clientes[0][1] = "Japão";
   clientes[0][2] = "+30 (88) 555-8888"; 
   
   clientes[1][0] = "Akira Ono";
   clientes[1][1] = "Japão";
   clientes[1][2] = "+30 (88) 225-8888";
   
   clientes[2][0] = "Gon Fricks";
   clientes[2][1] = "Japão";
   clientes[2][2] = "+30 (88) 555-9090";

   int l = 0;
   int limite = 3;
   do{
	System.out.println("\t"+clientes[l][0]+"\t"+ clientes[l][1]+"\t"+clientes[l][2]);
        

      
   l++;
   }while(l<limite);
   
   }

}
