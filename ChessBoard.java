public class ChessBoard {
    String[][] chessPieces = new String [8][8];

    public void setPieces(String piece, char column, int row) {
        row--;
        int xCol = columnToNum(column);
        chessPieces[xCol][row] = piece;
    }

    public String getPieces(char column, int row) {
        row--;
        int xCord = columnToNum(column);
        String piece = chessPieces[xCord][row];
        return piece;


    }

    private static int columnToNum(char column) {
        switch (column) {
            default:
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            case 'd':
                return 3;
            case 'e':
                return 4;
            case 'f':
                return 5;
            case 'g':
                return 6;
            case 'h':
                return 7;
        }
    }
}
