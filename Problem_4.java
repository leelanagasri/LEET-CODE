class Solution {
    public boolean checkIfPangram(String s) {
        char[] arr = new char[26];
        int ind = 0;
        for(int i=97;i<=122;i++){
            arr[ind++]=(char)i;
        }
        for(char ch:arr){
            if(!s.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}
