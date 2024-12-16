PriorityQueue<Integer> pq = new PriorityQueue<>((a ,b) -> {
            if (nums[a] == nums[b]) {
                 return a - b;  // If values are the same, compare indices
            }
            return nums[a] - nums[b];

        }
        );
        for (int i = 0; i < nums.length; i++) {
            pq.offer(i);
        }
        while (k > 0) {
            int min = pq.poll();
            nums[min] *= multiplier;
            pq.offer(min);
            k--;
        }
        return nums;
        