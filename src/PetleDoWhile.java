public class PetleDoWhile {

    public static void main(String[] args) {

        int i = 10;

        //pętla do - sprawdza warunek i jeżeli warunek jest spełniony, wchodzi do pętli i wykonuje kod
//        while(i<20){
//            System.out.println(i);
//            i++;
//        }

        //pętla do while - przynajmniej raz kod w sekcji DO się wykona, a później zostanie sprawdzony warunek,
        do {
            System.out.println("Jestem w pętli DO");
            System.out.println(i);
            i++;
        } while (i > 20);

        System.out.println(i);   //i po zwiększeniu o 1, ale już nie wejdzie do pętli
    }
}
