//6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("V1: "); Double v1 = scan.nextDouble();
        System.out.print("V2: "); Double v2 = scan.nextDouble();
        System.out.print("V3: "); Double v3 = scan.nextDouble();
        System.out.print("V4: "); Double v4 = scan.nextDouble();
        Double media = (v1 + v2 + v3 + v4) / 4.0;
        System.out.println("Media: " + media);
        scan.close();
    }
}