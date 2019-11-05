import java.util.Scanner;

public class Cadastro {
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {

       System.out.printf("Seu cpf: ");
       String cpf = input.nextLine();

       System.out.printf("Seu nome: ");
       String name = input.nextLine();

       System.out.printf("Seu email: ");
       String email = input.nextLine();

       System.out.printf("Seu endereço: ");
       String adress = input.nextLine();

       System.out.printf("Seu número de celular: ");
       String mPhone = input.nextLine();

       Person primeiraPessoa = new Person(cpf, name, email, adress, mPhone);
       Event firstEvent = new Event("titulo", "endereço", primeiraPessoa, true);

       System.out.println("Nome do evento: "+firstEvent.getTitle());
       System.out.println("Endereço do evento: "+firstEvent.getAdress());
       System.out.println("Gerente do evento: "+firstEvent.getManager().getName());
       System.out.println("Este evento "+ (firstEvent.getTicket() ? "é" : "não é") +" pago!");
       firstEvent.handleTicket();
       System.out.println("Este evento "+ (firstEvent.getTicket() ? "é" : "não é") +" pago!");
   }

}