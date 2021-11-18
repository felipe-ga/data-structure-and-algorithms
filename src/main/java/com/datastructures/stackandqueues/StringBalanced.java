package com.datastructures.stackandqueues;

import java.util.Stack;

public class StringBalanced {
    static char[][] pairTerm = {
            {'{','[','('},
            {'}',']',')'}
    };

    static boolean isOpenCharacter(char c){
        for (int i = 0; i < pairTerm[0].length; i++) {
            if(c == pairTerm[0][i]){
                return true;
            }
        }
        return false;
    }
    static boolean matches(char open, char close){
        for (int i = 0; i < pairTerm[0].length; i++) {
            if(open == pairTerm[0][i]){
                return close == pairTerm[1][i];
            }
        }
        return false;
    }
    static String isBalanced(String s) {
        Stack<Character> character = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpenCharacter(s.charAt(i))) {
                character.push(s.charAt(i));
            } else {
                if (character.isEmpty() || !matches(character.pop(),s.charAt(i))) {
                    return "NO";
                }
            }
        }
        if(!character.isEmpty()){
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]"));
    }
}
