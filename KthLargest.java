// Java program to find minimum element in a sorted and rotated array 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class KthLargest 
{ 

    static int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }   
    static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);
     
            if(q.size()>k){
                q.poll();
            }
        }
 
        return q.peek();
    }
    static int findKthLargest3(int[] nums, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<>(k, Collections.reverseOrder());
    for(int i: nums){
        q.offer(i);
 
        if(q.size()>k){
            q.poll();
        }
    }

    return q.peek();
    }


    // Driver Program 
	public static void main (String[] args) 
	{ 
		int nums[] = {5, 6, 1, 2, 3, 4}; 
	    int res1 = findKthLargest1(nums, 2);
		int res2 = findKthLargest2(nums, 2);
		int res3 = findKthLargest3(nums, 2);
		System.out.println("res1: " + res1);
		System.out.println("res2: " + res2);
		System.out.println("res3: " + res3);
	}

}
