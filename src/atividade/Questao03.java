package atividade;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Questao03 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] a = input.nextLine().split("\\s");
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for(int i = a.length - 1; i >= 0; i--){
            result.add(conta(count, a[i]));
            count++;
        }

        int valorfinal = 0;
        String r ="";
        for(String j: a){
            r += j;
        }
        for(int i: result){
            valorfinal += i;
        }
        System.out.println("Número binario: "+ r + "\nValor em decimal: "+ valorfinal);
        input.close();
    }

    public static int conta(int v, String x){
        int result = Integer.parseInt(x);
        for(int i = 0; i < v; i++){
            result *= 2;
        }
        return result;
    }
}
