public class Count012 {

    public static void main(String[] args) {
    int a[]={2,1,0,0,1,2};
    Count012 c=new Count012();
    c.sort012(a);
    for(int i=0;i<=a.length-1;i++){
        System.out.println(a[i]);
    }
    }
    public void sort012(int a[]){
        int count0=0,count1=0,count2=0;

        for (int i=0;i<a.length;i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }else {
                count2++;
            }
        }

        for (int i=0;i<count0;i++){
            a[i]=0;
        }
        for(int i=count0;i<(count0+count1);i++){
            a[i]=1;
        }
        for(int i=(count0+count1);i<a.length-1;i++){
            a[i]=2;
        }
    }
}
