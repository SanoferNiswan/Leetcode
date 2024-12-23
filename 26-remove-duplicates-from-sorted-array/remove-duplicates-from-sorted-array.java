class Solution {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        int i=0;
        for(int j=0;j<n-1;j++){
            if(a[j]!=a[j+1]){
                a[i++]=a[j];
            }
        }
        a[i++]=a[n-1];
    
        return i;
    }
}