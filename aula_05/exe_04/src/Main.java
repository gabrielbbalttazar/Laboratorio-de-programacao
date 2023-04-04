import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria sacarDinheiro = new ContaBancaria();
        ContaBancaria depositarDinheiro = new ContaBancaria();
        ContaBancaria transferirDinheiro = new ContaBancaria();

        int opcao = 0;

        while ( opcao != 1 || opcao != 2 || opcao != 3) {

            Scanner input2 = new Scanner(System.in);

            System.out.println(" Qual operação deseja realizar? [1] Depositar, [2] Sacar, [3] Transferir");
            opcao = input2.nextInt();

            if (opcao != 1 || opcao != 2 || opcao != 3) {

                if (opcao == 1) {

                    Scanner input1 = new Scanner(System.in);
                    int saldo;
                    System.out.println(" Digite seu saldo Atual : R$ ");
                    saldo = input1.nextInt();
                    depositarDinheiro.saldo = saldo;

                    Scanner input3 = new Scanner(System.in);
                    int dinheiro;
                    System.out.println(" Qual o valor a ser depositado ? : ");
                    dinheiro = input3.nextInt();
                    depositarDinheiro.dinheiro = dinheiro;


                    System.out.println(" Seu saldo atual após o depósito  é de R$  " + depositarDinheiro.depositar());

                }
                if (opcao == 2) {

                    Scanner input4 = new Scanner(System.in);
                    int saldo;
                    System.out.println(" Digite seu saldo Atual : R$ ");
                    saldo = input4.nextInt();
                    sacarDinheiro.saldo = saldo;

                    Scanner input5 = new Scanner(System.in);
                    int dinheiro;
                    System.out.println(" Qual o valor a ser sacado ? : ");
                    dinheiro = input5.nextInt();
                    sacarDinheiro.dinheiro = dinheiro;

                    if (saldo < dinheiro) {
                        System.out.println(" Saldo Insuficiente !!! ");
                        break;
                    } else
                        System.out.println(" Seu saldo atual após o saque  é de R$  " + sacarDinheiro.sacar());

                }
                if (opcao == 3) {

                    Scanner input6 = new Scanner(System.in);
                    int saldo;
                    System.out.println(" Digite seu saldo Atual : R$ ");
                    saldo = input6.nextInt();
                    transferirDinheiro.saldo = saldo;

                    Scanner input7 = new Scanner(System.in);
                    int dinheiro;
                    System.out.println(" Qual o valor a ser transferido ? : ");
                    dinheiro = input7.nextInt();
                    transferirDinheiro.dinheiro = dinheiro;

                    if (saldo < dinheiro) {
                        System.out.println(" Saldo Insuficiente !!! ");
                        break;
                    } else
                        System.out.println(" Seu saldo atual após a transferência   é de R$  " + transferirDinheiro.transferir());

                }

                System.out.println(" CONTINUAR : [1] Sim  ; [2] Não ");
                Scanner input8 = new Scanner(System.in);
                int continuar = input8.nextInt();
                if (continuar == 2) {
                    System.out.println(" Tenha um bom dia !!");
                    break;
                }
            }
        }



    }
}