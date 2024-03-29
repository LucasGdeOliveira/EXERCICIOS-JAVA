import java.util.Scanner;

public class mainbanco {
    
    public static void main(String[] args) {

        System.out.println("Bem Vindo ao Banco L.G Investimentos\n");
        System.out.println("Se voce já é cliente digite 1");
        System.out.println("Se voce nao é cliente digite 2\n");
        System.out.print("Digite aqui a opcao escolhida -----> ");
        
        Scanner leitor = new Scanner (System.in);
        int num = leitor.nextInt();
        leitor.nextLine();
        
        if( num == 1){
            
            System.out.println("\nBem vindo\n");
            System.out.print("Digite sua agencia: ");
            int agencia = leitor.nextInt();
            System.out.print("Digite o numero da sua conta: ");
            int conta = leitor.nextInt();
            leitor.nextLine();
            System.out.print("Digite o primeiro nome do titular da conta: ");
            String nome = leitor.nextLine();
            System.out.print("\n");

            Dados minhaconta = new Dados(agencia, conta, nome);

            boolean siga = true;

            while (siga) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Depositar dinheiro");
                System.out.println("2. Sacar dinheiro");
                System.out.println("3. Sair do programa");
                System.out.print("Digite o numero desejado: ");
                int escolha = Integer.parseInt(leitor.nextLine()); 

                switch (escolha) {
                    case 1: 
                    System.out.println("Digite o valor a ser depositado: ");
                    float deposito = Float.parseFloat(leitor.nextLine());
                    minhaconta.depositar(deposito);break;

                    case 2:
                    System.out.println("Digite o valor da retirada: ");
                    float saque = Float.parseFloat(leitor.nextLine());
                    minhaconta.saque(saque);break;

                    case 3:
                    System.out.println("Até logo !");
                    siga = false;break;
                    
                    default:System.out.println("Opção inválida. Por favor, digite novamente.");break;
                }
            }
            minhaconta.informacoes();
        }
        else {
            System.out.println("\nProcure seu Banco para atendimento !\n");
        }
    }   
}
