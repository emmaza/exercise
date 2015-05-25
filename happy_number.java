public class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        HashSet<Integer> rec = new HashSet<Integer>();
        while(!rec.contains(n)) {
            rec.add(n);
            int x=0;
            while(n>0){
                x=x+(n%10)*(n%10);
                n=n/10;
            }
            n=x;
            if(n==1) return true;
        }
        return false;
    }
}