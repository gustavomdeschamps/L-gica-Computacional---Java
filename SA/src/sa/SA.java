package sa;
import java.util.Scanner;
public class SA {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
// Passo 1: Solicitar o número de vendedores e seus nomes
        System.out.println("Digite o numero de vendedores: ");
        int numVendedores = sc.nextInt();
        sc.nextLine();  // Consumir a quebra de linha após o número

        String[] nomes = new String[numVendedores];
        double[][] vendas = new double[numVendedores][5]; // 5 dias úteis

        // Registrar os nomes dos vendedores
        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Digite o nome do vendedor " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        // Passo 2: Registrar as vendas dos 5 dias úteis da semana
        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Digite as vendas de " + nomes[i] + " (de segunda a sexta):");
            for (int j = 0; j < 5; j++) {
                System.out.print("Dia " + (j + 1) + ": R$ ");
                vendas[i][j] = sc.nextDouble();
            }
        }

        // Passo 3: Calcular o total de vendas semanais de cada vendedor
        double[] totais = new double[numVendedores];
        String[] classificacao = new String[numVendedores];
        double[] bonus = new double[numVendedores];
        double maiorVenda = 0;
        String melhorVendedor = "";

        // Passo 4: Classificar conforme as vendas e calcular bônus
        for (int i = 0; i < numVendedores; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += vendas[i][j];
            }
            totais[i] = total;

            // Classificação e bonificação
            if (total >= 5000.00) {
                classificacao[i] = "Excelente";
                bonus[i] = total * 0.10;
            } else if (total >= 3000.00) {
                classificacao[i] = "Bom";
                bonus[i] = total * 0.05;
            } else {
                classificacao[i] = "Regular";
                bonus[i] = 0.00;
            }

            // Passo 5: Identificar o melhor vendedor
            if (total > maiorVenda) {
                maiorVenda = total;
                melhorVendedor = nomes[i];
            }
        }

        // Passo 6: Gerar relatório
        System.out.println("============================================================");
        System.out.println("RELATORIO DE VENDAS SEMANAIS");
        System.out.println("============================================================");
        System.out.printf("| %-16s | R$ %10s | %-13s | R$ %8s |\n", "Vendedor", "Total Vendido", "Classificacao", "Bonus");
        System.out.println("+-----------------------------------------------------------------------------+");

        for (int i = 0; i < numVendedores; i++) {
            System.out.printf("| %-16s | R$ %10.2f | %-13s | R$ %8.2f |\n",
                    nomes[i], totais[i], classificacao[i], bonus[i]);
        }

        System.out.println("+-----------------------------------------------------------------------------+");
        System.out.println("MELHOR VENDEDOR DA SEMANA: " + melhorVendedor + " (R$ " + maiorVenda + ")");
        System.out.println("============================================================");


        sc.close();
    }

}