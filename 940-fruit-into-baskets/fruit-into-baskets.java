class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int left = 0, right = 0, max = 0;
        for(right = 0;right < fruits.length; right++){
            m.put(fruits[right], right);

            if(m.size() > 2){
                int minIndex = fruits.length+1, removeElement = 0;
                for(Map.Entry<Integer, Integer> entry: m.entrySet()){
                    if(entry.getValue()<minIndex){
                        minIndex = entry.getValue();
                        removeElement = entry.getKey();
                    }
                }
                left = minIndex+1;
                m.remove(removeElement);
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}