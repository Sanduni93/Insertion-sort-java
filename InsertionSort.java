class InsertionSort{
    public static void main(String h[]){
    int[] a = {5,4,3,2,1};
    int i,j,temp;
        for(i=1;i<a.length;i++){
            j = i-1; 
            while(i>=0 && a[j] > a[i]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for(int x=0; x<a.length;x++){
            System.out.println(a[x]);   
        }
    }
}