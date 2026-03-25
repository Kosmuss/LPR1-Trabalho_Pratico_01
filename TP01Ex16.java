//16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Angulo em graus: "); Double angulo = scan.nextDouble();
        Double radianos = Math.toRadians(angulo);
        Double seno = Math.sin(radianos);
        Double cosseno = Math.cos(radianos);
        Double tangente = Math.tan(radianos);
        Double secante = 1.0 / cosseno;
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        scan.close();
    }
}