public class MaxNoFromArray {

    public static void main(String[] args) {
        MaxNoFromArray maxNoFromArray = new MaxNoFromArray();

        System.out.println("Max No in Array is : " + maxNoFromArray.maxArray(new int[]{24, 1, 3, 12, 100, -4}));
    }

    public int maxArray(int[] arrNum) {
        int max = arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > max) {
                max = arrNum[i];
            }
        }
        return max;
    }
}
