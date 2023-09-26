import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                
        double saldo = 100.0;


        System.out.println("Por favor, digite o número de sua agência sem o dígito: ");
        int agencia = scanner.nextInt();

        System.out.println("Agora digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Tudo certo! Deseja realizar um saque? Digite 1 para sim ou 2 para não");
        int saque = scanner.nextInt();

        if(saque == 2 ) 
           System.out.println("Fim da operação!");

        if (saque == 1 ) 
            System.out.println("Seu saldo é de R$ 100.00. Digite a quantia que deseja sacar: ");  
            double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado <  saldo) 
            saldo = saldo - valorSolicitado;
            double novoSaldo = saldo;
        System.out.printf("Seu saque foi de R$ %.2f%n" , valorSolicitado);
        System.out.printf("Seu novo saldo é de R$ %.2f%n" , novoSaldo);

        } 
        
            
    }