//12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Altura: "); Double altura = scan.nextDouble();
        System.out.print("Raio da base: "); Double raio = scan.nextDouble();
        Double volume = (Math.PI * Math.pow(raio, 2) * altura) / 3.0;
        System.out.println("Volume: " + volume);
        scan.close();
    }
}