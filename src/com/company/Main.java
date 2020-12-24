package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        int - целые числа
        double - дробные числа
        String - всё что находится в кавычках
        boolean - работает как выключатель - true/false
         */
        double[] array = new double[]{10.32, -1.4, 5.1, 49.0, 13.2, -9.31, -27.25, -31.90, 100.23, 90.87, 3456.908, 1.3, -24.55, 30.213, -27.53};

        double summa = 0;
        double kolichestvo = 0;

        boolean vykluchatel = false;

        for (double num : array) {

            if (num < 0)
                vykluchatel = true;


            if (num > 0 & vykluchatel == true) {
                summa = summa + num;
                kolichestvo += 1;
            }
        }


        System.out.println(summa);
        System.out.println(kolichestvo);
        System.out.println(summa / kolichestvo);

        System.out.println("------------------");

        String str = "5";
        while (str.length() < 5){
            str = str + "5";
            System.out.println(str);
        }
    }
}

