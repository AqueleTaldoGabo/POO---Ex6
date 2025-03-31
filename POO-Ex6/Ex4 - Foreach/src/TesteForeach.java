public class TesteForeach {
    public static void main(String[] args){
        int[] nums = {99, -10, 100, 19, 977, -562, 463, -9, 287, 49};
        int min, max;
        min = max = nums[0];
        for(int v: nums){
            if(v < min)
                min = v;
            if(v > max)
                max = v;
        }
        System.out.println("Max: " + max + "\nMin: " + min);
    }
}
