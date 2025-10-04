import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Conversor de Temperatura ===");
            System.out.println("1 - Converter Celsius para Fahrenheit");
            System.out.println("2 - Converter Fahrenheit para Celsius");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = sc.nextDouble();
                    double convertidoF = Converter.celsiusParaFahrenheit(celsius);
                    System.out.println(celsius + " °C = " + convertidoF + " °F");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    double convertidoC = Converter.fahrenheitParaCelsius(fahrenheit);
                    System.out.println(fahrenheit + " °F = " + convertidoC + " °C");
                    break;

                case 0:
                    System.out.println("Saindo do programa... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
