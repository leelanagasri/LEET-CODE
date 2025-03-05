class Solution {
    public int numWaterBottles(int Bot, int Exc) {
        int sum = Bot;
        while(Bot>=Exc){
            int val = Bot/Exc;
            int rem = Bot%Exc;
            sum += val;
            Bot = val+rem;
        }
        return sum;
    }
}
