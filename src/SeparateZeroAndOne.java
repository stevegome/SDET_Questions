    // Replace ___ with your code below

    import java.util.Arrays;
    import java.util.Scanner;

    class SeparateZeroAndOne {

        // method to separate zeros and ones in an array
        public static int[] separateZerosOnes(int[] array) {
            int count = 0;

            // count the number of zeros in the array
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    count++;
                }
            }

            // calculate the number of ones in the array
            int onesCount = array.length - count;

            // create a new array to store the output
            int[] output = new int[array.length];

            // fill the first 'count' positions in the new array with 0s
            for (int i = 0; i < count; i++) {
                output[i] = 0;
            }

            // fill the remaining positions in the new array with 1s
            for (int i = count; i < array.length; i++) {
                output[i] = 1;
            }

            // return the new array
            return output;
        }

        public static void main(String[] args) {

            // take input for the array
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[7];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            // call the method to separate zeros and ones in the array
            int[] output = separateZerosOnes(array);

            // print output array
            System.out.println("Split zeros and ones are as belows ---->");
            System.out.println(Arrays.toString(output));
        }
    }




