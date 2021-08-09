public class DisplayNumbers {
    public static void main(String[] args) {
        int[] table = {72, 5, -6, 22, -9};
        int i = 0;

        do {
            System.out.println(table[i]);
            i++;
        } while (i < table.length && table[i-1] > 0);
    }
}
