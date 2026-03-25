//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Celsius: "); Double celsius = scan.nextDouble();
        Double fahrenheit = (celsius * 1.8) + 32.0;
        System.out.println("Fahrenheit: " + fahrenheit);
        scan.close();
    }
}