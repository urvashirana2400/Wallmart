public class SortMultiDimArray {
    public static void main(String[] args) {
        SortMultiDimArray s = new SortMultiDimArray();
        int arr[][] = {{35, 45, 55, 65},
                {40, 50, 60, 70},
                {52, 54, 62, 73},
                {57, 58, 64, 75}};
        int n= arr.length;
        int key=45;
        s.sort(arr,n,key);

    }

    public void sort(int a[][],int n, int key) {
    int i=0,j=n-1;
    while (i<=n-1 && j>=0){
        if(a[i][j]<key){
            i++;
        }
        else if(a[i][j]==key){
            System.out.println("element found at:a["+i+"]["+j+"]");
            return;
        }
        else {
            j--;
        }
    }

    }
}
