public class PairOfSongs {
    public int numPairsDivisibleBy60(int[] time) {

        int[] count = new int[60];

        for(int i:time){
            count[i%60]++;
        }
        int pair =0;
        for(int i=1;i<30;i++)
        {
            pair+=count[i]*count[60-i];
        }
        pair+=SumOfN(count[0]-1) + SumOfN(count[30]-1);

        return pair;


    }
    int SumOfN(int n){
        return n*(n+1)/2;
    }
}
