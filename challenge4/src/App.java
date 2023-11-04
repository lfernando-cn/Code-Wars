/*Write function RemoveExclamationMarks which removes all exclamation marks from a given string. */





class Solution {

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");// The replaceAll method of the String class replaces all occurrences of a substring
    }
}