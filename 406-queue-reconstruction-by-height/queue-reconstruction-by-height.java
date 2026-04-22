class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // sort based on height (desc)
        // height equals -> sort based on k (asc)
        Arrays.sort(people, (a,b)-> {
            if(a[0]==b[0]) return a[1]-b[1];
            else return b[0]-a[0];
        });

        List<int[]> res = new ArrayList<int[]>();

        for(int[] p:people){
            res.add(p[1], p); // add p in kth position ->p[1]
        }

        return res.toArray(new int[people.length][2]);
    }
}