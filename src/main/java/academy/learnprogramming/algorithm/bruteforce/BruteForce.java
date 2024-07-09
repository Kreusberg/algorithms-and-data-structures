package academy.learnprogramming.algorithm.bruteforce;

import java.util.Arrays;

/**
 * Brute Force Algorithm <BR>
 *     Will search for a pattern into an array. If it is found, it will return the array's index where the first letter was found.<BR>
 *     If no match is found, -1 is returned.
 */
public class BruteForce {

    public int firstMatch(char[] array, char[] pattern) {
        for (int a = 0; a <= array.length - pattern.length; a++) {
            for (int p = 0; p < pattern.length; p++) {
                if (array[a+p] != pattern[p]) break;
                if (p == pattern.length - 1) return a;
            }
        }
        return -1;
    }

    public int[] everyMatch(char[] array, char[] pattern) {
        int[] found = new int[array.length];
        Arrays.fill(found, -1);
        int index = 0;
        for (int a = 0; a <= array.length - pattern.length; a++) {
            for (int p = 0; p < pattern.length; p++) {
                if (array[a+p] != pattern[p]) break;
                if (p == pattern.length - 1) {
                    found[index++] = a;
                }
            }
        }
        return found;
    }

}
