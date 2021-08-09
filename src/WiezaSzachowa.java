public class WiezaSzachowa {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        char[][] szachy = {
                {' ', ' ', ' ', ' ', 'C', ' ', ' ', ' '},
                {'C', 'C', 'C', 'C', ' ', ' ', ' ', 'C'},
                {' ', ' ', 'C', ' ', '2', ' ', 'C', ' '},
                {'C', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', 'B', ' ', 'C', 'B', ' '},
                {' ', ' ', '1', ' ', 'W', '3', ' ', ' '},
                {'B', 'B', ' ', ' ', ' ', 'B', 'B', 'B'},
                {'B', ' ', ' ', ' ', '4', ' ', 'B', ' '},

        };

        ruchWGore(x, y, szachy);
        ruchWDol(x, y, szachy);
        ruchWLewo(x, y, szachy);
        ruchWPrawo(x, y, szachy);

    }

    private static void ruchWGore(int x, int y, char[][] szachy) {
        int i = 0;
        do {
            i++;
            if (x - i < 0) {
                break;
            }
            if (szachy[x - i][y] != ' ') {
                System.out.println("ruch w górę napotkał " + szachy[x - i][y] + " na pozycji x: " + (y+1) + " y: " + ((x-i)+1));
                break;
            }

        } while (szachy[x - i][y] == ' ');
    }

    private static void ruchWDol(int x, int y, char[][] szachy) {
        int i = 0;

        do {
            i++;
            if (x + i > 7) {
                break;
            }
            if (szachy[x + i][y] != ' ') {
                System.out.println("ruch w dół napotkał " + szachy[x + i][y] + " na pozycji x: " + (y+1) + " y: " + ((x+i)+1));
                break;
            }
        } while (szachy[x + i][y] == ' ');
    }
    private static void ruchWLewo(int x, int y, char[][] szachy) {
        int i = 0;

        do {
            i++;
            if (y - i < 0 ) {
                break;
            }
            if (szachy[x][y-i] != ' ') {
                System.out.println("ruch w lewo napotkał " + szachy[x][y-i] + " na pozycji x: " + (y+1) + " y: " + ((x+i)+1));
                break;
            }
        } while (szachy[x][y-i] == ' ');
    }private static void ruchWPrawo(int x, int y, char[][] szachy) {
        int i = 0;

        do {
            i++;
            if (y + i < 0 ) {
                break;
            }
            if (szachy[x][y+i] != ' ') {
                System.out.println("ruch w prawo napotkał " + szachy[x][y+i] + " na pozycji x: " + (y+1) + " y: " + ((x+i)+1));
                break;
            }
        } while (szachy[x][y+i] == ' ');
    }
}
//ctrl+alt+m - ekstrakcja do metody