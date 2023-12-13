public class MinNoFromArray {

    public static void main(String[] args) {
        MinNoFromArray minNoFromArray = new MinNoFromArray();

        System.out.println("Min No in Array is : " + minNoFromArray.minArray(new int[]{1, 24, 3, 12, -4, 100}));

    }

    public int minArray(int[] arrNum) {
        int min = arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < min) {
                min = arrNum[i];
            }
        }
        return min;
    }
}
