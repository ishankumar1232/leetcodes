package problems;

public class Prob_26 {

    // Function to remove duplicates from sorted array
    public int removeDuplicates(int[] nums) {

        // Edge case: empty array
        if (nums.length == 0) {
            return 0;
        }

        int k = 0; // index of last unique element

        // Traverse from second element
        for (int i = 1; i < nums.length; i++) {

            // If current element is different
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i]; // store unique element
            }
        }

        // Number of unique elements
        return k + 1;
    }

    
    public static void main(String[] args) {

    	Prob_26 sol = new Prob_26();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Updated array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}



