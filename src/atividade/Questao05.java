package atividade;

import com.sun.source.tree.TypeCastTree;

import java.util.Scanner;
import java.util.Arrays;

public class Questao05 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String[] word = input.nextLine().split("");

        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        StringBuilder newWord = new StringBuilder();

        char a = 'A';
        System.out.println("Teste: "+ (a+3) );

        for (String s : word) {
            for (int j = 0; j < alfabeto.length; j++) {

                if(j == 24){
                    j = 0;
                }
                if (s.toUpperCase().equals(alfabeto[j])) {
                    newWord.append(alfabeto[j + 3]);
                }
            }
        }
        System.out.println(newWord);

    }
}
