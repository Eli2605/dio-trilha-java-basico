package contaBanco;
import java.util.Scanner;
import contaBanco.Conta;

public class ContaTerminal {
    public static void main(String[] args)  {
        
       System.out.println("******Conta Banco *******");

       Conta conta1 = new Conta();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor, digite seu Nome: ");
       conta1.nome = scanner.nextLine();

       System.out.println("Por favor, digite o numero da Agência! ");
       conta1.agencia = scanner.nextLine();

       System.out.println("Por favor, digite o Numero da Conta! ");
       conta1.numero = scanner.nextLine();

       System.out.println("Por favor, digite seu Saldo:");
       conta1.saldo = scanner.nextInt();
        
       System.out.println("Olá " + conta1.nome + ", obrigado por criar uma conta no nosso banco, sua agência é " + conta1.agencia + ", conta " + conta1.numero + " e seu saldo, " + conta1.saldo + ", já está disponível para saque");


       scanner.close();
    }
}
