class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i =0; i< n * 2;i++){
            int index =i % n;

            while(!stack.isEmpty() && nums[stack.peek()] < nums[index]){
                result[stack.pop()] = nums[index];
            }

            if(i < n){
                stack.push(i);
            }
        }
        return result;

    }
}