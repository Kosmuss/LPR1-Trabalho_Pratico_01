//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Diametro: "); Double diametro = scan.nextDouble();
        Double raio = diametro / 2.0;
        Double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area: " + area);
        scan.close();
    }
}