package PoorPigs;

class Solution {
    public int poorPigs(int buckets, int tDie, int tTest) {
        int test = tTest/tDie;
        int i=0;
        while(Math.pow(test+1,i)< buckets){
            i++;
        }return i;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

