//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex02 {
     public static void main(String args[]) {
        System.out.println("Digite o valor da aresta do quadrado: ");
        Scanner scan = new Scanner(System.in);
        Double aresta = scan.nextDouble();
        Double area = aresta * aresta;
        System.out.println("A área do quadrado é: " + area);
        scan.close();
     }
}
