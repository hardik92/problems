//  953. Verifying an Alien Dictionary
//  https://leetcode.com/problems/verifying-an-alien-dictionary/

class Solution {
    public static boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<words.length-1; i++){
            String current = words[i];
            String next = words[i+1];
            int clen = current.length();
            int nlen = next.length();
            boolean lastCheck = false;
            for(int j = 0; j<clen && j<nlen; j++){
                lastCheck = current.charAt(j) == next.charAt(j);
                if(order.indexOf(current.charAt(j)) > order.indexOf(next.charAt(j))){
                    return false;
                }
                else if (order.indexOf(current.charAt(j)) < order.indexOf(next.charAt(j))){
                    break;
                }
            }
            if(lastCheck && nlen < clen) return false;
        }
        return true;
    }

    public static void main(String args[]){
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(isAlienSorted(words, order));
    }
}