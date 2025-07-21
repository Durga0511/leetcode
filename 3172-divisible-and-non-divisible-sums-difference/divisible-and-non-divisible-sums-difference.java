class Solution {
    public int differenceOfSums(int n, int m) {
        int Sum1 = 0;
        int Sum2 =0;
        for(int i=0;i<=n;i++){
            if(i%m==0){
                Sum1 =Sum1+i;
            }else{
                Sum2 =Sum2+i;
            }
        }
        return Sum2-Sum1;
    }
}