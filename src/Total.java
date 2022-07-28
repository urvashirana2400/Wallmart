public class Total {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7,8};
        int n=a.length-1;
        int sum=0;
        int expectedTotal=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum=sum+i;
        }
        int missing=expectedTotal-sum;
        System.out.println(missing);
    }
}
