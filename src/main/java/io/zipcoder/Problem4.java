package io.zipcoder;

import java.util.ArrayList;

public class Problem4 {

    public static void main(String[] args) {
        String input = "aaabbbb";
        System.out.println(anagramCombinations(input));
    }

    public static ArrayList<String> anagramCombinations(String input){
        ArrayList<String> combinations = new ArrayList<String>();
        String anagram;

        for (int i = 0; i < input.length(); i++){
            for (int j = i + 1; j < input.length(); j++){
                if (input.charAt(j) != input.charAt(i)){
                    anagram = input.substring(0, i)
                }
            }
        }
        return combinations;
    }

}
