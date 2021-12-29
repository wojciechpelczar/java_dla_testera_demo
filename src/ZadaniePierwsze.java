public class ZadaniePierwsze {
    public static void main(String[] args) {

        //1. 4 zmienne typy int
        //2. sprawdzamy czy suma pierwszych 2 liczb jest parzysta
        //3. sprawdzamy czy suma pozostalych 2 liczb jest parzystach
        //4. jezeli 2 sumy sa parzyste to wyswietl informacje, ze wszystkie liczby sa parzyste

        //1.
        int numberOne = 32;
        int numberTwo = 18;
        int numberThree = 16;
        int numberFour = 62;

        int firstSum = numberOne + numberTwo;
        int secondSum = numberThree + numberFour;

        System.out.println(firstSum);
        System.out.println(secondSum);

        //2.
        if (firstSum % 2 == 0) {
            System.out.println("suma pierwszych 2 liczb jest parzysta");
        } else {
            System.out.println("suma pierwszych 2 liczb nie jest parzysta");
        }

        //3.
        if (secondSum % 2 == 0) {
            System.out.println("suma pozostalych 2 liczb jest parzysta");
        } else {
            System.out.println("suma pozostalych 2 liczb nie jest parzysta");
        }

        //4.
        if (firstSum % 2 == 0 && secondSum % 2 == 0) {
            System.out.println("wszystkie liczby sa parzyste");
        } else {
            System.out.println("nie wszystkie liczby sa parzyste");
        }
    }
}
