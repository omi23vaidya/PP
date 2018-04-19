/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.

*/

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        //ArrayList<String> ans = new ArrayList<String>();
        String[] res = new String[nums.length];
        PriorityQueue<Athlete> pq = new PriorityQueue<>(nums.length, new Comparator<Athlete>(){
            @Override
            public int compare(Athlete f, Athlete s){
                return s.score - f.score;
            }
                
        });

        
        for(int i=0; i<nums.length; i++) {
            Athlete temp = new Athlete(nums[i], i);
            pq.add(temp);
        }
        
        // while(pq.peek()!=null){
        //     System.out.println(pq.poll().index);
        // }
        
        int iter = 1;
        String[] medals = {"", "Gold Medal", "Silver Medal", "Bronze Medal"};
        
        while(iter<=3 && pq.peek()!=null) {
            //ans.add(pq.poll().index, medals[iter]);
            res[pq.poll().index] = medals[iter];
            iter++;
        }
        
        while(pq.peek()!=null) {
            //ans.add(pq.poll().index, String.valueOf(iter));
            res[pq.poll().index] = String.valueOf(iter);
            iter++;
        }
        
        //return ans.toArray(new String[0]);
        return res;
    }
}

class Athlete {
    int score;
    int index;
    
    Athlete(int score, int index) {
        this.score = score;
        this.index = index;
    }
}