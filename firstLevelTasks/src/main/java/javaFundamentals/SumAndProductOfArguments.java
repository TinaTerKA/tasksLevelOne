package javaFundamentals;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SumAndProductOfArguments {
    public static void main(String[] args){
        ArrayList<Integer> list = readArguments();
        System.out.println(sumArguments(list));
        System.out.println(productArguments(list));
    }

    private static ArrayList<Integer> readArguments() {
        ArrayList<Integer> arg = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String a = reader.readLine();
                if (!a.isEmpty()) {
                    arg.add(Integer.parseInt(a));
                } else break;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arg;
    }

    private static int sumArguments(ArrayList<Integer> arg){
        int sum = 0;
        for (int i = 0; i < arg.size(); i++) {
            sum += arg.get(i);
        }
        return sum;
    }

    private static int productArguments(ArrayList<Integer> arg){
        int product = 1;
        for (int i = 0; i < arg.size(); i++) {
            product *= arg.get(i);
        }
        return product;
    }
}