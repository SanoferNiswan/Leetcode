class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int a[] = new int[n];
        for(int i=n-1 ; i>=0 ;i--){
            a[n-i-1] = citations[i];
            System.out.print(a[n-i-1]+" ");
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>=i+1){
                max=Math.max(max,i+1);
            }
        }

        return max;
        
    }
}