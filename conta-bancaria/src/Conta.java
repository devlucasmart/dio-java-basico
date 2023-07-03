import java.math.BigDecimal;
import java.util.Scanner;

public class Conta {
    private int numero;
    private String agencia;
    private String nomeDoCliente;
    private BigDecimal saldo;
    private int opcao;

    public Conta(){}

    public void cadastrarConta(){
        Scanner sc = new Scanner(System.in);

       System.out.println("-------------------------");
        System.out.println("1-Adicionar Conta");
        System.out.println("0-Encerrar");
        System.out.println("-------------------------");
        opcao = sc.nextInt();
        System.out.println("--------------------------");

            while (opcao == 1) {
                System.out.println("Por favor, digite o Número da Conta! ");
                numero = sc.nextInt();
                System.out.println("Por favor, digite o número da Agência!");
                agencia = sc.next();
                System.out.println("Por favor, digite o nome do Cliente!");
                sc.nextLine();
                nomeDoCliente = sc.nextLine();
                System.out.println("Saldo");
                saldo = sc.nextBigDecimal();
                System.out.println("---------------------------");

                salvoComSucesso();

                System.out.println("-------------------------");
                System.out.println("1-Adicionar Conta");
                System.out.println("0-Encerrar");
                System.out.println("-------------------------");
                opcao = sc.nextInt();
                System.out.println("--------------------------");
            }
    }
    public void salvoComSucesso(){
        System.out.println(
                "Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco," +
                        " sua agência é " + agencia + ", conta " + numero + " e seu saldo "
                        + saldo + " já está disponível para saque.");
    }
}
