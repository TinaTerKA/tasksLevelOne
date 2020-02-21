package javaFundamentals;

//Вывести числа в порядке возрастания (убывания) значений их длины.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AscendingOrder {

    public static void main(String[] args){
        numbersInAscendingOrder(readNumber());
    }

    private static ArrayList<String> readNumber(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
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

    private static void numbersInAscendingOrder(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        printList(list);
    }

    private static void printList(ArrayList<String> list){
       for(String s: list){
           System.out.println(s);
       }
    }
}
