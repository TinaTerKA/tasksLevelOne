package javaFundamentals;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheShortestAndLongestNumber {
    public static void main(String[] args){
        ArrayList<Integer> numbers = readNumber();
        printNumberByLength(Length.SHORTEST, numbers);
        printNumberByLength(Length.LONGEST, numbers);
    }

    private static ArrayList<Integer> readNumber(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (true){
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(s.isEmpty()){
                break;
            }
            else array.add(Integer.parseInt(s));
        }
        return array;
    }

    enum Length {
        LONGEST, SHORTEST
    }
    private static void printNumberByLength(Length length, ArrayList<Integer> list){
        int x = 0;
        for (Integer integer : list) {
            switch (length) {
                case LONGEST:
                    if (String.valueOf(Math.abs(integer)).length() >= String.valueOf(Math.abs(x)).length()) {
                        x = integer;
                    }
                    break;
                case SHORTEST:
                    if (String.valueOf(Math.abs(integer)).length() <= String.valueOf(Math.abs(x)).length()) {
                        x = integer;
                    }
                    break;
            }
        }
        System.out.println(String.format("%s number: %s it has %s characters", length, x, String.valueOf(Math.abs(x)).length()));
    }
}