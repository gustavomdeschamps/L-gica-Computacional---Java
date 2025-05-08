package tabuada;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // criando vetor
        int[] vetResultado = new int[10];
       
        // entrada de dados
        System.out.println("Informe a tabuada: ");
        int numTabuada = sc.nextInt() ;
        
        // calcula e armazene no vetor
        for (int i = 0; i < 10; i++) {
           vetResultado[i] = numTabuada * (i + 1);
        }
        
        // descarrega o vetor
        for (int i = 0; i < 10; i++) {
            System.out.println(numTabuada + " x " + (i + 1) + " = " + vetResultado[i]);
        }
        System.out.println("O numero da quinta posicao do vetor = " + vetResultado[4]);
                    
        sc.close();
       
    }

}
