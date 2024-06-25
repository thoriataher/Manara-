class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String wordA = String.join("", word1);
       String wordB = String.join("", word2);

       return wordA.equals(wordB);
    }
}