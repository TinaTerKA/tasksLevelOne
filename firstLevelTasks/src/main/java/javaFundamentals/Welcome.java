package javaFundamentals;

// Приветствовать любого пользователя при вводе его имени через командную строку.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = null;
            try {
                name = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (name.isEmpty()) {
                break;
            } else System.out.println("Hello " + name);
        }
    }
}