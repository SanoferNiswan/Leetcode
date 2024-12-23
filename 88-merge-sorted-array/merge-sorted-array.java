class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i=m-1,j=n-1,x=n+m-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                a[x--]=a[i--];
            }
            else{
                a[x--]=b[j--];
            }
        }

        while(j>=0){
            a[x--] = b[j--];
        }

    }
}