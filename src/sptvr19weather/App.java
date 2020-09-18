/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19weather;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zahhar Pertsev
 *
 */
class App {
    public void run() {
        System.out.println("--- Project Weather ---");
        Random random = new Random();
        int max1day = 0;
        int min1day = 0;
        int max1month = 0;
        int min1month = 0;
        int maxtemp = 0;
        int mintemp = 0;
        int current_temp = 0;
        int n = 0, min=-50, max = -50;
        int[][] tInYear = new int [12][];
            for (int i = 0; i < 12; i++) {
                switch (i){
                    case 0: min=-25; max=-5; n = 31; break;
                    case 1: min=-25; max=-5; n = 28; break;
                    case 2: min=-15; max=10; n = 31; break;
                    case 3: min=-5; max=15; n = 30; break;
                    case 4: min=0; max=20; n = 31; break;
                    case 5: min=10; max=25; n = 30; break;
                    case 6: min=15; max=30; n = 31; break;
                    case 7: min=10; max=25; n = 31; break;
                    case 8: min=5; max=15; n = 30; break;
                    case 9: min=0; max=10; n = 31; break;
                    case 10: min=-5; max=5; n = 30; break;
                    case 11: min=-15; max=0; n = 31; break;
                }
                tInYear[i] = new int[n];
            for (int j = 0; j < tInYear[i].length; j++) {
                //заполняем массив месяца диапазоном температур
                current_temp = random.nextInt(max-min+1)+min;
                tInYear[i][j] = current_temp;
                if (current_temp > maxtemp) {
                max1day = j;
                max1month = i;
                maxtemp = current_temp;
                }
                if (current_temp < mintemp) {
                min1day = j;
                min1month = i;
                mintemp = current_temp;
                System.out.printf("%4d",tInYear[i][j]);
                }
            }
                //выводим на консоль значения температур в i-том месяце
               
            }
            //переходим на новую строчку (новый месяц)
            System.out.println();
            
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.println("В этот день была температура: "+tInYear[month-1][day-1]); 
        
        System.out.println("Самая жаркая погода была: " +max1day + "." +max1month);
        
        System.out.println("Самая холодная погода была: " +min1day + "." +min1month);
        
        
        
    }
}