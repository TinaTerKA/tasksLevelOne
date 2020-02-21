package javaFundamentals;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GivenNumberOfRandomNumbers {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        try {
            int givenNumber = Integer.parseInt(reader.readLine());
            for (int i = 0; i < givenNumber; i++) {
                randomNumbers.add(Integer.parseInt(reader.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int j = 0; j < randomNumbers.size(); j++) {
            System.out.println(randomNumbers.get(j));
        }
        for (int k = 0; k < randomNumbers.size(); k++) {
            System.out.print(randomNumbers.get(k) + " ");
        }
    }
}
