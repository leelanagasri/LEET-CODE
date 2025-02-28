class Solution {
    public boolean squareIsWhite(String cd) {
        int v1 = cd.charAt(0);
        int v2 = cd.charAt(1);
        if((v1%2 != 0 && v2%2 != 0) || (v1%2 == 0 && v2%2 == 0)){
            return false;
        }
        return true;
    }
}
