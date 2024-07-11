package academy.learnprogramming.algorithm.rabinkarp;

/**
 * Rabin-Karp algorithm uses hashing to find a match between pattern and array of character.
 * To calculate the hash of the subsequent possibles matchs, Rolling Hash is being used.
 * Will return the index of the match in the array or -1, if it does not find anything.
 */
public class RabinKarp {

    private final int prime = 3;

    public int search(char[] array, char[] pattern) {
        if (array == null || pattern == null) return -1;

        int n = array.length;
        int m = pattern.length;
        int lastChar = (n - m);
        long patternHash = calculateHash(pattern, m);
        long arrayHash = calculateHash(array, m);


        for (int i = 0; i <= lastChar; i++) {
            if (patternHash == arrayHash && match(array, pattern, i)) {
                return i;
            }

            if (i < lastChar) {
                arrayHash = recalculateHash(arrayHash, array[i], array[i + m], m);
            }
        }
        return -1;
    }


    public long calculateHash(char[] text, int hashSize) {
        long hash = 0;

        for (int i = 0; i < hashSize; i++) {
            hash += charVal(text[i]) * Math.pow(prime, i);
        }

        return hash;
    }

    public long recalculateHash(long oldHash, char oldChar, char newChar, int hashSize) {
        long hash = oldHash - charVal(oldChar);
        hash = hash / prime;
        hash += charVal(newChar) * Math.pow(prime, hashSize - 1);

        return hash;
    }

    public boolean match(char[] array, char[] pattern, int index) {
        for (int i = 0; i < pattern.length; i++) {
            if (array[index + i] != pattern[i]) return false;
        }
        return true;
    }

    public int charVal(char val) {
        return val - 96;
    }

}
