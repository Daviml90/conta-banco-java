import java.util.Locale;
import java.util.Scanner;


public class ContaBanco {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, providencie as seguintes informações. ");
        System.out.println("Número da conta:");
        int usuario = s.nextInt();
        
        System.out.println("Agencia:");
        String agencia = s.next();

        System.out.println("Nome do Cliente:");
        String nome = s.next();
        
        System.out.println("Saldo:");
        double saldo = s.nextDouble();

        System.out.printf("Olá "+ nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+usuario+" e seu saldo de R$%.2f já está disponível para saque.", saldo);
        System.out.println();

    }
}
