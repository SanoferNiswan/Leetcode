class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int num:nums){
            m.put(num, m.getOrDefault(num,0)+1);
            
        }
        int[] a = new int[m.size()];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            a[i]=entry.getValue();
            i++;
        }
        Arrays.sort(a);
        for(int x:a) System.out.print(x+", ");
        System.out.println(m);
        int[] res = new int[k];
        for(i=0;i<k;i++){
                int count = a[a.length-1-i];
                System.out.println("count:"+(i+1)+":"+count);
                for(Map.Entry<Integer,Integer> entry : m.entrySet()){
                    if(entry.getValue()==count){
                        res[i] = entry.getKey();
                        m.remove(res[i]);
                        break;
                    }
            }
        }

        return res;
    }
}