import java.util.Scanner;


public class ContaTerminal {

    public static void main (String[]  args){

        var scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var name = scanner.nextLine();

        System.out.println("\nDigite sua agência: ");
        var ag = scanner.next();

        System.out.println("\nDigite seu Nº da conta: ");
        int conta = scanner.nextInt();

        System.out.println("\nDigite seu saldo atual: ");
        //esta função serve para substituir a vírgula por ponto e converte para float
        var saldoTexto = scanner.next().replace(",", ".");
        float saldo = Float.parseFloat(saldoTexto);



        System.out.printf("Olá %s!, obrigado por criar uma conta em nosso banco,\n sua agência é %s, conta  Nº%d e seu saldo R$ %.2f já está disponível para saque.", name, ag, conta,saldo );

    }

}
