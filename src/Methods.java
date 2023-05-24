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

    public static void bubbleSort(int[] array) {
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
    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public static void quickSort(int[] sortArr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

//    public static void main(String args[]) {
//        int[] sortArr = {12, 6, 4, 1, 15, 10};
//        quickSort(sortArr, 0, sortArr.length - 1);
//        for(int i = 0; i < sortArr.length; i++){
//            System.out.print(sortArr[i] + "\n");
//        }
//    }

    public static void insertionSort(int[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

//    public static void main(String args[]) {
//        int[] sortArr = {12, 6, 4, 1, 15, 10};
//        insertionSort(sortArr);
//        for(int i = 0; i < sortArr.length; i++){
//            System.out.print(sortArr[i] + "\n");
//        }
//    }
}
