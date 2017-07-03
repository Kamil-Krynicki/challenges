package org.krynicki;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by K on 10.06.2017.
 */
public class LongestCorrectBracket {

    int longestBracketSequence(String in) {
        Deque<Integer> mem = new LinkedList<>();
        mem.push(-1);
        int result = 0;
        for( int i = 0 ;i <in.length();i++){
            if(in.charAt(i) == '(') {
                mem.push(i);
            } else {
                mem.pop();
                if(!mem.isEmpty()) {
                    result = Math.max(result, i - mem.peek());
                } else {
                    mem.push(i);
                }
            }
        }

        return result;
    }
}
