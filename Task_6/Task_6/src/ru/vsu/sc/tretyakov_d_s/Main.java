package ru.vsu.sc.tretyakov_d_s;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logic logic = new Logic();

        int s = readNumberFromKeyboard("sum of numbers");

        if (choosingSolutionOption())
        {
            MapImplement<Integer, Integer> map = new MapImplement<>();
            map.put(1, 23);
            map.put(2, 0);
            map.put(3, 12);
            map.put(4, 8);
            map.put(5, 6);
            map.put(6, 7);
            map.put(7, 1);

            List<Integer> list = map.toList();
            List<List<Integer>> result = logic.generateFinalList(list, s);
            System.out.println(result);
            printResultCombinations(result);
        }
        else
        {
            List<Integer> list = new ArrayList<>();
            list.add(23);
            list.add(0);
            list.add(12);
            list.add(8);
            list.add(6);
            list.add(7);
            list.add(1);

            List<List<Integer>> result = logic.generateFinalList(list, s);
            printResultCombinations(result);
        }
    }

    public static int readNumberFromKeyboard (String name){
        System.out.println("Input " + name + ":");
        Scanner scanner = new Scanner(System.in);
        String row = scanner.nextLine();
        return Integer.parseInt(row);
    }

    public static boolean choosingSolutionOption() {
        System.out.println("Do you want to use the standard method or your own?");
        System.out.println("1 - standard  2 - own");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 2) {
            return true;
        }
        return false;
    }



    public static void printResultCombinations(List < List < Integer >> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("List №" + (i + 1) + ": ");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}