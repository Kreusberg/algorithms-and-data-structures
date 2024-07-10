package academy.learnprogramming.algorithm.kmp;

/**
 * Computes the table of the longest suffix and prefix on the pattern.
 */
public class KnuthMorrisPratt {

    // LSP stands for Longest Suffix Prefix
    public int[] computeLSPTable(char[] pattern) {
        int[] lsp = new int[pattern.length];
        int j = 0;

        for (int i = 1; i < pattern.length; i++) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = lsp[j - 1];
            }

            if (pattern[i] == pattern[j]) {
                lsp[i] = j + 1;
                j++;
            } else {
                lsp[i] = 0;
            }
        }
        return lsp;
    }
}
