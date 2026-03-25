class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int left = 0, max = 0;
        for(int right = 0 ; right < fruits.length ; right++){
            m.put(fruits[right],right);

            if(m.size() > 2){
                int minLength = fruits.length + 1, toRemove = 0;
                for(Map.Entry<Integer, Integer> entry:m.entrySet()){
                    if(entry.getValue() < minLength){
                        minLength = entry.getValue();
                        toRemove = entry.getKey();
                    }
                }
                left = minLength+1;
                m.remove(toRemove);
            }

            max = Math.max(max, right-left+1);
        }

        return max;
    }
}