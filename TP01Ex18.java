//18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
//Exercício feito por Igor Cristiano Bezerra (CB3038408) e Pedro Matias dos Santos Neto (CB3038785)

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Produto 1: "); Double p1 = scan.nextDouble();
        System.out.print("Produto 2: "); Double p2 = scan.nextDouble();
        System.out.print("Produto 3: "); Double p3 = scan.nextDouble();
        System.out.print("Produto 4: "); Double p4 = scan.nextDouble();
        System.out.print("Produto 5: "); Double p5 = scan.nextDouble();
        System.out.print("Valor do pagamento: "); Double pagamento = scan.nextDouble();
        Double soma = p1 + p2 + p3 + p4 + p5;
        Double troco = pagamento - soma;
        System.out.println("Troco: " + troco);
        scan.close();
    }
}