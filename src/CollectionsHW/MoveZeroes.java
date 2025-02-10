package CollectionsHW;

public class MoveZeroes {
    public static void init() {
        System.out.println("");
        System.out.println("Move Zeroes");
        int[] numbers1 = {0, 1, 0, 3, 12};
        moveZeroes(numbers1);
        System.out.println(java.util.Arrays.toString(numbers1)); // [1, 3, 12, 0, 0]

        int[] numbers2 = {0};
        moveZeroes(numbers2);
        System.out.println(java.util.Arrays.toString(numbers2)); // [0]
    }

    public static void moveZeroes(int[] numbers) {
        int numbersLength = numbers.length;
        int notZeroIndex = 0; // Index

        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] != 0) {// Swap
                int temp = numbers[i];
                numbers[i] = numbers[notZeroIndex];
                numbers[notZeroIndex] = temp;
                notZeroIndex++;
            }
        }
    }
}
