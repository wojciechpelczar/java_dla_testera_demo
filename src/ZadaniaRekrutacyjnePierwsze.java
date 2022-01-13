public class ZadaniaRekrutacyjnePierwsze {
    public static void main(String[] args) {

        //zadanie polega na zamianie miejscami pierwszej liczby z ostatnią liczbą
        int[] numbers = {1, 2, 3, 4, 5};

        //standardowe rozwiązanie (2 zmienne)
//        int firstNumber = numbers[0];
//        int lastNumber = numbers[numbers.length - 1];
//
//        numbers[0] = lastNumber;
//        numbers[numbers.length-1] = firstNumber;
//
//        for (int number: numbers) {
//            System.out.println(number);
//        }

        //rozwiązanie z minimalną ilością nowych zmiennych (1 zmienna)
//        int firstValue = numbers[0];
//        numbers[0] = numbers[numbers.length - 1];
//        numbers[numbers.length - 1] = firstValue;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        //rozwiązanie BEZ zmiennych
        numbers[numbers.length-1] = numbers[numbers.length-1] + numbers[0];
        numbers[0]= numbers[numbers.length-1] - numbers[0];
        numbers[numbers.length-1] = numbers[numbers.length-1] - numbers[0];

        for (int number: numbers) {
            System.out.println(number);
        }

    }
}

