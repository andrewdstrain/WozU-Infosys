import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        int[] array1 = {0, 1};
        int[] array2 = {0, 1, 0, 3, 12};

        System.out.println(Arrays.toString(zerosAtEnd(array1)));
        System.out.println(Arrays.toString(zerosAtEnd(array2)));
    }

    public static int[] zerosAtEnd(int[] array) {
        int zeroPointer = 0;

        for (int i = 0; i < array.length; i++) {
            int current = array[i];

            if (current != 0) {
                int tmp = array[zeroPointer];
                array[i] = tmp;
                array[zeroPointer] = current;
                zeroPointer++;
            }
        }

        return array;
    }
}