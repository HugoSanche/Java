import java.util.Arrays;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int resultado = removeDuplicates2(nums);
           // System.out.println(resultado);

    }


    public static int removeDuplicates2(int nums[]) {
        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            //{0,0,1,1,1,2,2,3,3,4}

            if (nums[j] != nums[i-1 ]) {

                nums[i] = nums[j];
                i++;

            }
            System.out.println("j = "+j);
            System.out.println("i = "+i);
            System.out.println("nums[j] = "+nums[j]);
            System.out.println("nums[i - 1 ] = "+nums[i -1]);
            System.out.println(Arrays.toString(nums));
            System.out.println("-----------------");
        }

        return i;

    }


    //{1,1,2}
    public static int removeDuplicates(int nums[]) {
        int max=nums[0];
        int count=1;
        for (int i=0;i<nums.length;i++){
            if (max!=nums[i]){
                nums[count]=nums[i];
                max=nums[i];
                count++;
            }
        }
        System.out.println("----------");
        System.out.println("max ="+max);
      //  System.out.println("repetido ="+repetido);
        System.out.println("count ="+count);

        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return  count;
    }
}