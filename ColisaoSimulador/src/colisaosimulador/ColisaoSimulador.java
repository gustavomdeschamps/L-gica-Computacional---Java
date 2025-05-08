package colisaosimulador;
import java.util.Scanner;
public class ColisaoSimulador {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double gravity = 9.81;
        double massaCorpo1, velocidadeCorpo1, massaCorpo2, velocidadeCorpo2,
                velocidadeFinal, energiaInicial, energiaFinal, energiaLiberada, distanciaDeformacao = 0, 
                aceleracaoMediaMs, aceleracaoMediaKmH, forcaG;
       
       // Passo 1: Solicitar os dados de entrada ao usuário
        System.out.println("Informe a massa do primeiro corpo em quilograma : ");
        massaCorpo1 = sc.nextDouble();

        System.out.println("Informe a velocidade do primeiro corpo em quilometros por hora : ");
        velocidadeCorpo1 = sc.nextDouble();

        System.out.println("Informe a massa do segundo corpo em quilograma : ");
        massaCorpo2 = sc.nextDouble();

        System.out.println("Informe a velocidade do segundo corpo em quilometros por hora : ");
        velocidadeCorpo2 = sc.nextDouble();
        
        // Passo 2: Converter as velocidades de km/h para m/s
        velocidadeCorpo1 = velocidadeCorpo1  * 1000 / 3600;
        velocidadeCorpo2 = velocidadeCorpo2  * 1000 / 3600;

      // Passo 3: Calcular a velocidade final do sistema após a colisão
        velocidadeFinal = (massaCorpo1 * velocidadeCorpo1 + massaCorpo2 * velocidadeCorpo2) / (massaCorpo1 + massaCorpo2);
        System.out.println("Velocidade final do sistema apos a colisao: " + velocidadeFinal + " m/s");

// Passo 4: Calcular a energia cinética inicial total
        double energia_inicial = (0.5 * massaCorpo1 * Math.pow(velocidadeCorpo1, 2)) + 
                                 (0.5 * massaCorpo2 * Math.pow(velocidadeCorpo2, 2));

// Passo 5: Calcular a energia cinética final total
        double energia_final = 0.5 * (massaCorpo1 + massaCorpo2) * velocidadeFinal;

// Passo 6: Calcular a energia cinética liberada no impacto
        energiaLiberada = energia_inicial - energia_final;

// Mostrar a energia liberada em Joule
        System.out.println("Energia cinetica liberada durante o impacto: " + energiaLiberada + " J");

// Passo 7: : Solicitar a distância de deformação ao usuário
        System.out.println("Digite a distancia de deformacao (m): ");
        distanciaDeformacao = sc.nextDouble();
// Passo 8:  Calcular a aceleração média durante o impacto
        aceleracaoMediaMs = (energiaLiberada / (massaCorpo1 + massaCorpo2)) / distanciaDeformacao;

// Mostre para o usuário a aceleração média em m/s²
        System.out.println("A aceleracao media = " + aceleracaoMediaMs + " m/s");

// Passo 9: Converter a aceleração média para km/h²
        aceleracaoMediaKmH = (aceleracaoMediaMs * 3600) / 1000;

// Mostre para o usuário a aceleração em km/h²
        System.out.println("A aceleracao = " + aceleracaoMediaKmH + " km/h");

// Passo 10: Calcular a aceleração média em termos de múltiplos de G
        forcaG = aceleracaoMediaMs / 9.81;

// Mostre para o usuário o valor da aceleração em múltiplos de G
        System.out.println("A aceleracao em multiplos de G = " + forcaG + " G");

// Exibir os resultados
        System.out.println("Velocidade final do sistema apos a colisao: " + velocidadeFinal + " m/s");
        System.out.println("Energia cinetica liberada durante o impacto: " + energiaLiberada + " J");
        System.out.println("Aceleracao media durante o impacto: " + aceleracaoMediaMs + " m/s");
        System.out.println("Aceleracao media convertida para km/h: " + aceleracaoMediaKmH + " km/h");
        System.out.println("Aceleracao media expressa em multiplos de G: " + forcaG + " G");

        sc.close();
    }

}