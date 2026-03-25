//17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("X: "); Double x = scan.nextDouble();
        System.out.print("Y: "); Double y = scan.nextDouble();
        Double resultado = Math.exp(y * Math.log(x));
        System.out.println("X elevado a Y: " + resultado);
        scan.close();
    }
}