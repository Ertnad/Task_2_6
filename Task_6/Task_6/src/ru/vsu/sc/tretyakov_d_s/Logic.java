package ru.vsu.sc.tretyakov_d_s;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public List<List<Integer>> generateFinalList(List < Integer > list, int s){
        List<List<Integer>> result = new ArrayList<>();

        List<List<Integer>> allCombinations = formAllTriples(list);

        for (List<Integer> l :
                allCombinations) {
            if (calculateSum(l) == s) {
                result.add(l);
            }
        }

        return result;
    }

    public List<List<Integer>> formAllTriples(List < Integer > list) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> additionalList = new ArrayList<>(3);
        for (int i = 0; i < list.size(); i++) {
            additionalList.add(0, list.get(i));

            for (int j = i + 1; j < list.size(); j++) {

                additionalList.add(1, list.get(j));

                for (int k = j + 1; k < list.size(); k++) {

                    additionalList.add(2, list.get(k));

                    result.add(new ArrayList<>(additionalList));

                    additionalList.remove(2);
                }

                additionalList.remove(1);
            }

            additionalList.remove(0);
        }

        return result;
    }

    public int calculateSum (List < Integer > list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
