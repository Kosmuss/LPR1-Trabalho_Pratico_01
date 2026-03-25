//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex01 {

    public static void main(String args[]) {
        System.out.println("Digite a base do retângulo: ");
        Scanner scan = new Scanner(System.in);
        Double base = scan.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        Double altura = scan.nextDouble();
        Double area = base * altura;
        System.out.println("A área do retângulo é: " + area );
        scan.close();
    }
}