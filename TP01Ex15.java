//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cotacao do dolar: "); Double cotacao = scan.nextDouble();
        System.out.print("Quantidade de dolares: "); Double dolares = scan.nextDouble();
        Double reais = cotacao * dolares;
        System.out.println("Reais: " + reais);
        scan.close();
    }
}