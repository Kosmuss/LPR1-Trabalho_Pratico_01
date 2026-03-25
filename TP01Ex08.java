//8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Milhas maritimas: ");
        Double milhas = scan.nextDouble();
        Double km = milhas * 1.852;
        System.out.println("Quilometros: " + km);
        scan.close();
    }
}