//7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("V1: "); Double v1 = scan.nextDouble();
        System.out.print("V2: "); Double v2 = scan.nextDouble();
        Double mediaGeo = Math.sqrt(v1 * v2);
        System.out.println("Media geometrica: " + mediaGeo);
        scan.close();
    }
}