public class ZadanieRekrutacyjneTrzecie {

    public static void main(String[] args) {

        //zadanie polega na posortowaniu liczb całkowitych z tablicy --> rosnąco
        //rozwiązanie --> 0 1 2 2 3 3 4 4 8 9

        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
             //indeks = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

        int min;
//      System.out.println(numbers.length); --> 10

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
