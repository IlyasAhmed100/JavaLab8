import java.util.Scanner;

public class ChessMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessBoard chessBoard = new ChessBoard();
        System.out.println("Enter Coordinate: ");
        char[] coordinate = sc.next().toCharArray();
        sc.close();
        int row = Integer.parseInt(Character.toString(coordinate[1]));
        char column = coordinate[0];

        chessBoard.setPieces("Black Rook", 'a', 8);
        chessBoard.setPieces("White Knight", 'b', 8);
        chessBoard.setPieces("Black Bishop", 'c', 8);
        chessBoard.setPieces("Black Queen", 'd', 8);
        chessBoard.setPieces("Black King", 'e', 8);
        chessBoard.setPieces("Black Bishop", 'f', 8);
        chessBoard.setPieces("Black Knight", 'g', 8);
        chessBoard.setPieces("Black Rook", 'h', 8);

        chessBoard.setPieces("White Rook", 'a', 1);

        System.out.println(column + " " + row);
        System.out.println(chessBoard.getPieces(column, row));


    }
}