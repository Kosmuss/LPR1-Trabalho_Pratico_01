//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o diametro da esfera: ");
        Double diametro = scan.nextDouble();
        Double raio = diametro / 2.0;
        Double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume: " + volume);
        scan.close();
    }
}