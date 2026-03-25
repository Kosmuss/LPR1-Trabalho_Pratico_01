//9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Resistencia: "); Double resistencia = scan.nextDouble();
        System.out.print("Corrente: "); Double corrente = scan.nextDouble();
        Double tensao = resistencia * corrente;
        System.out.println("Tensao: " + tensao);
        scan.close();
    }
}