package javaFundamentals;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameOfTheMonthByTheEnteredNumber {
    private enum Month {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private int id;

        Month(Integer value) {
            this.id = value;
        }

        public Integer getId() {
            return id;
        }

        public static void printMonth(int id) {
            if (id <= 0 || id > 12){
                System.out.println("Only 12 months in a year.");
            }
            else {
                for (Month at : Month.values()) {
                    if (at.getId().equals(id)) {
                        System.out.println(at);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int x = enterNumber();
        Month.printMonth(x);
    }

    private static int enterNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int x = 0;
        try {
            x = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return x;
    }
}


