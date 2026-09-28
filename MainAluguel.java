import java.util.Scanner;

public class MainAluguel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE ALUGUEL DE IMÓVEIS ===");

        // 1. Entrada de dados do Cliente
        System.out.println("\n[1/3] Informe os dados do Cliente:");
        System.out.print("Código do cliente: ");
        int codCliente = scanner.nextInt();
        scanner.nextLine(); // Limpeza de buffer

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Telefone do cliente: ");
        String telCliente = scanner.nextLine();

        Cliente cliente = new Cliente(codCliente, nomeCliente, telCliente);

        // 2. Entrada de dados do Imóvel
        System.out.println("\n[2/3] Informe os dados do Imóvel:");
        System.out.print("Código do imóvel: ");
        int codImovel = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Descrição do imóvel: ");
        String descImovel = scanner.nextLine();

        System.out.print("Preço do aluguel (R$): ");
        double precoAluguel = scanner.nextDouble();

        System.out.print("Quantidade mínima de meses: ");
        int qtMinMeses = scanner.nextInt();
        scanner.nextLine(); 

        Imovel imovel = new Imovel(codImovel, descImovel, precoAluguel, qtMinMeses);

        // 3. Entrada de dados do Contrato de Aluguel
        System.out.println("\n[3/3] Informe os dados do Aluguel:");
        System.out.print("Código do contrato de aluguel: ");
        int codAluguel = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Data de início (DD/MM/AAAA): ");
        String dataInicio = scanner.nextLine();

        System.out.print("Data de fim (DD/MM/AAAA): ");
        String dataFim = scanner.nextLine();

        Aluguel aluguel = new Aluguel(codAluguel, dataInicio, dataFim, imovel, cliente);

        // 4. Saída de dados chamando exibeDados()
        aluguel.exibeDados();

        scanner.close();
    }
}