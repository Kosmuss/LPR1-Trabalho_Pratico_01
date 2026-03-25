//13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Velocidade inicial (m/s): "); Double vInicial = scan.nextDouble();
        System.out.print("Aceleracao (m/s2): "); Double aceleracao = scan.nextDouble();
        System.out.print("Tempo (s): "); Double tempo = scan.nextDouble();
        Double vFinalMs = vInicial + (aceleracao * tempo);
        Double vFinalKmh = vFinalMs * 3.6;
        System.out.println("Velocidade final (km/h): " + vFinalKmh);
        scan.close();
    }
}