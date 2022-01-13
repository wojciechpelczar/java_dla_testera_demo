public class ZadanieRekrutacyjneDrugie {

    public static void main(String[] args) {

        //zadanie polega na policzeniu ile jest l.parzystych i l.nieparzystych w tablicy
        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
        int even = 0;  //liczby parzyste
        int odd = 0;   //liczby nieparzyste

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Liczb parzystych: " + even);
        System.out.println("Liczb nieparzystych: " + odd);
    }
}
