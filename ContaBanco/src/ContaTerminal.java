import java.util.Locale;
import java.util.Scanner;

import edu.tiagovillalobos.model.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Conta conta = new Conta();

        System.out.println("Digite o nome do titular: ");
        conta.setNomeCliente(scanner.nextLine());
        
        System.out.println("Digite o número da conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite o número da agencia: ");
        conta.setAgencia(scanner.next());

        System.out.println("Digite o saldo inicial: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println(conta.exibirMensagemBoasVindas());

        scanner.close();
    }
}
