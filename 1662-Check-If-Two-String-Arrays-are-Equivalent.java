class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordA = new StringBuilder();
        StringBuilder wordB = new StringBuilder();
        for (String str : word1) {
            wordA.append(str);
        }
        for (String str : word2) {
            wordB.append(str);
        }
        return wordA.toString().equals(wordB.toString());
    }
}