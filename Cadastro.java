import java.util.Scanner;
import java.util.Date;

public class Cadastro {
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {

       String cpf = input.nextLine();
       String name = input.nextLine();
       String email = input.nextLine();
       String adress = input.nextLine();
       String mPhone = input.nextLine();

       Person pessoa = new Person(cpf, name, email, adress, mPhone);
       String result = pessoa.getName();
       System.out.println("Your name is "+result);
       pessoa.handleName("Pinheiro");
       String oResult = pessoa.getName();
       System.out.println("Your name is "+oResult);
       
   }

}