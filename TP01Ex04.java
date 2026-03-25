//A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String args[]){
        System.out.println("Digite o valor da base do triângulo: ");
        Scanner scan = new Scanner(System.in);
        Double base = scan.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        Double altura = scan.nextDouble();
        Double area = (base * altura) / 2.0;
        System.out.println("A área do triângulo é: " + area);
        scan.close();
    }
}