import java.util.Scanner;
import javax.swing.JOptionPane; 
public class rebanhoOvelhas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
   
    int branca, marrom, negra, outraCor;
    int valorBrancas, valorMarrons, valorNegras, valorOutra;
    float valorTotal;

    branca = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas brancas: "));
    marrom = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas marrons: "));
    negra = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas negras: "));
    outraCor = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas outras cores: "));

    valorBrancas = branca * 250 ;
    valorMarrons = marrom * 200 ;
    valorNegras = negra * 300 ;
    valorOutra = outraCor * 180 ;

    JOptionPane.showMessageDialog(null, "Usada para produção de lã (Brancas) Quantia: " + branca + ("\n Valor em dinheiro: R$" + valorBrancas) ) ;
    JOptionPane.showMessageDialog(null, "Para estudo genético (Negras) Quantia: " + negra + ("\n Valor em dinheiro: R$" + valorNegras));
    JOptionPane.showMessageDialog(null, "Para venda (Marrons) Quantia: " + marrom + ("\n Valor em dinheiro: R$" + valorMarrons));
    JOptionPane.showMessageDialog(null, "Para avaliação (Outras cores) Quantia: " + outraCor + ("\n Valor em dinheiro: R$" + valorOutra));
    JOptionPane.showMessageDialog(null, "A quantia total das ovelhas é de: " + (branca + marrom + negra + outraCor));
    JOptionPane.showMessageDialog(null, "O valor total em dinheiro das ovelhas é de: R$" + (valorBrancas + valorMarrons + valorNegras + valorOutra));
        scanner.close();


}  
}