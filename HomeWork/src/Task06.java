public class Task06 {
    public static void main(String[] args) {

        hw0601();

        hw0602();

        hw0603();
    }

    /***
     * Задача №3
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести минимальное значение массива.
     */
    private static void hw0603() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int res = array[0];
        for (int i=1; i<array.length; i++){
            if (res > array[i]){
                res = array[i];
            }
        }
        System.out.println("Задача №3: " + res);
    }

    /***
     * Задача №2
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести максимальное значение массива.
     */
    private static void hw0602() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int res = array[0];
        for (int i=0; i<array.length; i++){
            if ( res < array[i]) {
                res = array[i];
            }
        }
        System.out.println("Задача №2: " + res);
    }

    /***
     * Задача №1
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести сумму всех значений массива.
     */
    static void hw0601(){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int result = 0;
        for (int i=0; i< array.length; i++){
            result += array[i];
        }
        System.out.println("Задача №1: " + result);
    }
}
