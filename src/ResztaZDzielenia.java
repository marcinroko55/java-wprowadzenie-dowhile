public class ResztaZDzielenia {
    public static void main(String[] args) {
        int number = 21;
        int reszta = 0;

        do {
            reszta = number % 2;
            number = number / 2;
            System.out.print(reszta);
        } while (number > 0);
    }
}
