public class b4l2t1_Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int newSize = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0) {
                if (intArray[i] % 2 == 0) {
                    intArray[newSize] = intArray[i];
                    newSize++;
                }
            }
        }
        for (int i = 0; i < newSize; i++) {
            int min = intArray[i];
            int min_i = i;
            for (int j = i + 1; j < newSize; j++) {
                if (intArray[j] < min) {
                    min = intArray[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = intArray[i];
                intArray[i] = intArray[min_i];
                intArray[min_i] = tmp;
            }
        }
        for (int i = 0; i < newSize; i++) {
            System.out.println(intArray[i]);
        }
    }
}