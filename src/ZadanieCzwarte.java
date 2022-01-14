public class ZadanieCzwarte {

    public static void main(String[] args) {

        //zadanie polega na posortowaniu liczb całkowitych z tablicy -- malejąco
        //rozwiązanie --> 9 8 5 5 4 4 2 2 1 0

        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
             //indeks = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

        int max;
//      System.out.println(numbers.length); --> 10

        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
