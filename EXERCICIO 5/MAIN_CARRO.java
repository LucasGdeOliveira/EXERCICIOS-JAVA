import java.util.Scanner;

public class maincarro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Carro car = new Carro("Ferrari", "F12", 2023, "BCA2589",0);

        System.out.println("Informações do carro:");
        car.exibirInformacoes();

        System.out.print("\nDigite o incremento de velocidade para acelerar: ");
        int incremento = scanner.nextInt();
        car.acelerar(incremento);

        System.out.print("\nDigite o decremento de velocidade para frear: ");
        int decremento = scanner.nextInt();
        car.frear(decremento);

        System.out.println("\nInformações atualizadas do carro:");
        car.exibirInformacoes();

    }
}
