package javaFundamentals;

//Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ClearDigits {
    public static void main(String[] args){
        ArrayList<String> numbers = readNumbers();
        ArrayList<String> evenNumbersInNumber = evenNumbersInNumber(numbers);
        numbers.removeAll(evenNumbersInNumber);
        numberWithAnEqualNumberOfEvenAndOdd(numbers);
    }

    private static ArrayList<String> readNumbers(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
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
            else array.add(s);
        }
        return array;
    }

    public static int evenCounter(String number) {
        int count = 0;
        for (int i = 0; i < number.length(); ++i) {
            int x = number.charAt(i) - '0';
            if (x % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

    public static ArrayList<String> evenNumbersInNumber(ArrayList<String> array){
        ArrayList<String> onlyEvenNumbers = new ArrayList<>();
        int countEvenNumbersInArray = 0;
        for (String number: array) {
            if(evenCounter(number) == number.length()){
                onlyEvenNumbers.add(number);
                countEvenNumbersInArray++;
            }
        }
        System.out.println(countEvenNumbersInArray + " чисел, содержащих только чётные цифры");
        return onlyEvenNumbers;
    }

    public static int oddCounter(String number) {
        int count = 0;
        for (int i = 0; i < number.length(); ++i) {
            int x = number.charAt(i) - '0';
            if (x % 2 == 1) {
                ++count;
            }
        }
        return count;
    }

    public static void numberWithAnEqualNumberOfEvenAndOdd(ArrayList<String> array){
        int count = 0;
        for (String number: array) {
            if(evenCounter(number) == oddCounter(number)){
                ++count;
            }
        }
        System.out.println(count + " колличество чисел с равным числом четных и нечетных цифр.");
    }

}