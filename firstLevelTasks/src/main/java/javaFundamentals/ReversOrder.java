package javaFundamentals;

// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReversOrder {
    private static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args){
        reversPrinting(enterArgs(list));
    }

    private static ArrayList<String> enterArgs(ArrayList<String> list){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String g = null;
            try {
                g = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(g.isEmpty()){
                break;
            }
            else list.add(g);
        }
        return list;
    }

    private static void reversPrinting(ArrayList<String> list){
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
