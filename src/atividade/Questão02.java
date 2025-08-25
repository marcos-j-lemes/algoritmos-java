package atividade;

import java.util.Scanner;

public class Questão02 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double[] provas = new double[4];
        for(int i = 0; i < 4; i++){
            System.out.print("Digite a " + (i+1) + "ª nota de prova: ");
            provas[i] = input.nextDouble();
        }

        double[] projetos = new double[2];
        for(int i = 0; i < 2; i++){
            System.out.print("Digite a " + (i+1) + "ª nota de projeto: ");
            projetos[i] = input.nextDouble();
        }

        System.out.print("Digite a presença (%): ");
        double presenca = input.nextDouble();

        double P = (provas[0] + provas[1] + provas[2] + provas[3]) / 4.0;
        double Pj = (projetos[0] + projetos[1]) / 2.0;

        double R = ((3 * P) + (2 * Pj)) / 5.0;
        R *= Math.floor(P / 6.0);
        R *= Math.floor(Pj / 6.0);

        System.out.println("Resultado R = " + R);

        if(R >= 6 && presenca > 75){
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

        input.close();
    }
}
