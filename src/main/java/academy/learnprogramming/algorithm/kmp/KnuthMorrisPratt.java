package academy.learnprogramming.algorithm.kmp;

public class KnuthMorrisPratt {

    /**
     * Retuns the index for the first match of the pattern.
     * Will return -1 in case where it does not match.
     * @param array
     * @param pattern
     * @return
     */
    public int search(char[] array, char[] pattern) {
        int[] lsp = computeLSPTable(pattern);
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            while (j > 0 && array[i] != pattern[j]) {
                j = lsp[j - 1];
            }

            if (array[i] == pattern[j]) {
                j++;
                if (j == pattern.length) {
                    return (i - (j-1));
                }
            }
        }

        return -1;
    }

    /**
     * Computes the table of the longest suffix and prefix on the pattern.
     */
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
