import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int Conta = 1021;
        String nomeCliente = "Mario Andrade";
        float Saldo = 237.48f;

        System.out.println("Qual a Agencia? ");
        String Agencia = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " , conta " + Conta  + " e seu saldo " + Saldo + " já está disponível para saque");
    }
}
