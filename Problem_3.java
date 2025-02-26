class Solution {
    public List<String> cellsInRange(String s) {
        List<String> al = new ArrayList<>();
        char ch1 = s.charAt(0), ch2 = s.charAt(3);
        char start = s.charAt(1), end = s.charAt(4);
        for(char i=ch1;i<=ch2;i++){
            for(char j=start;j<=end;j++){
                al.add(new String(new char[]{i,j}));
            }
        }
        return al; 
    }
}
