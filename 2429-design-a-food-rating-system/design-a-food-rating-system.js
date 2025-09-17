var FoodRatings = function(foods, cuisines, ratings) {
    class MaxHeap {
        constructor() { this.data = []; }
        size() { return this.data.length; }
        peek() { return this.data[0]; }
        push(val) {
            this.data.push(val);
            this._siftUp(this.data.length - 1);
        }
        pop() {
            if (this.size() === 0) return null;
            let top = this.data[0];
            let end = this.data.pop();
            if (this.size() > 0) {
                this.data[0] = end;
                this._siftDown(0);
            }
            return top;
        }
        _siftUp(idx) {
            while (idx > 0) {
                let parent = Math.floor((idx - 1) / 2);
                if (this._compare(this.data[idx], this.data[parent]) > 0) {
                    [this.data[idx], this.data[parent]] = [this.data[parent], this.data[idx]];
                    idx = parent;
                } else break;
            }
        }
        _siftDown(idx) {
            let left, right, largest;
            while (true) {
                left = idx * 2 + 1;
                right = idx * 2 + 2;
                largest = idx;
                if (left < this.size() && this._compare(this.data[left], this.data[largest]) > 0) largest = left;
                if (right < this.size() && this._compare(this.data[right], this.data[largest]) > 0) largest = right;
                if (largest !== idx) {
                    [this.data[idx], this.data[largest]] = [this.data[largest], this.data[idx]];
                    idx = largest;
                } else break;
            }
        }
        _compare(a, b) {
            if (a[0] !== b[0]) return a[0] - b[0];
            return b[1].localeCompare(a[1]);
        }
    }

    this.foodInfo = new Map();
    this.cuisineHeaps = new Map();

    for (let i = 0; i < foods.length; i++) {
        this.foodInfo.set(foods[i], { cuisine: cuisines[i], rating: ratings[i] });
        if (!this.cuisineHeaps.has(cuisines[i])) {
            this.cuisineHeaps.set(cuisines[i], new MaxHeap());
        }
        this.cuisineHeaps.get(cuisines[i]).push([ratings[i], foods[i]]);
    }
};

FoodRatings.prototype.changeRating = function(food, newRating) {
    let { cuisine } = this.foodInfo.get(food);
    this.foodInfo.set(food, { cuisine, rating: newRating });
    this.cuisineHeaps.get(cuisine).push([newRating, food]);
};

FoodRatings.prototype.highestRated = function(cuisine) {
    let heap = this.cuisineHeaps.get(cuisine);
    while (heap.size() > 0) {
        let [rating, food] = heap.peek();
        if (this.foodInfo.get(food).rating !== rating) {
            heap.pop();
        } else {
            return food;
        }
    }
    return null;
};
