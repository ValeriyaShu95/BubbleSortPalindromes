public class Methods {
    public static void changeDigit(int[] array) {
        int number = array[1];
        array[1] = array[array.length - 2];
        array[array.length - 2] = number;
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public static void printArrayEven(int[] array) {
        if ((array[0] % 2 == 0) && ((array[array.length - 1]) % 2 == 0)) {
            changeDigit(array);

        }
    }

    public static void printArrayOneEven(int[] array) {
        if ((array[0] % 2 == 0) && ((array[array.length - 1]) % 2 == 0)) {
            changeDigit(array);
        }
    }

    public static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;

                }
            }
        }
        printArray(array);
    }
}
