package sumArray;

public class SumArray {
    public static int[] twoSum(int[] numbers, int target) {

        for(int i=0;i<numbers.length-1;i++){
            for(int k=1;k<numbers.length;k++){
                if(numbers[i]+numbers[k]==target){
                    return new int[]{i, k};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
