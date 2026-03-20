class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unPlaced = 0;
        for(int i = 0; i < fruits.length ; i++){
            boolean placed = false;
            for(int j=0 ; j < baskets.length ; j++){
                if(baskets[j]>=fruits[i]){
                    placed = true;
                    baskets[j] = -1;
                    break;
                }
            }
            if(!placed) unPlaced++;
        }

        return unPlaced;
    }
}