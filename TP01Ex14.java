//14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Aresta do cubo (a): "); Double a = scan.nextDouble();
        System.out.print("Raio da esfera (r): "); Double r = scan.nextDouble();
        Double volCubo = Math.pow(a, 3);
        Double volEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        Double volLivre = volCubo - volEsfera;
        System.out.println("Volume livre: " + volLivre);
        scan.close();
    }
}