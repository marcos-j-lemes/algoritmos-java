package atividade;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double a = input.nextDouble();

        System.out.println("Digite o segundo número:  ");
        double b = input.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("O valor do discriminante (Δ) é: " + delta);

        input.close();
    }

}


