class Solution {
    public boolean isPalindrome(String s) {
        //removing all non-alphanumeric characters
        String str = s.replaceAll(\[^a-zA-Z0-9]\, \\);
        str = str.toLowerCase();

        //convert the string into arrays
        char[] charArray = str.toCharArray();

        int i = 0, j = charArray.length -1;
        while(i < j){
            if(charArray[i] != charArray[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}