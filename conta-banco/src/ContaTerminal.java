import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome =  scanner.nextLine();

        System.out.print("Digite agora o número da sua agencia: ");
        String agencia =  scanner.nextLine();

        System.out.print("Digite agora o número da sua conta: ");
        int numero =  scanner.nextInt();
        
        System.out.print("Por último o saldo: ");
        double saldo =  scanner.nextDouble();


        System.out.println("---------------------------------");

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
