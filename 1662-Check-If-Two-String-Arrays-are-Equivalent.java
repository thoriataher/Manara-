class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordA = new StringBuilder();
        StringBuilder wordB = new StringBuilder();
        String res = "";
        for (String str : word1) {
            wordA.append(str);
        }
        for (String str : word2) {
            wordB.append(str);
        }
        String str1 = wordA.toString();
        String str2 = wordB.toString();
        // check if they have different length
        if (str1.length() != str2.length())
            return false;
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }
}