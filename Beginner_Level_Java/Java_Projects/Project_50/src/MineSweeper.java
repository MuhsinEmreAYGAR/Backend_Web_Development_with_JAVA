import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int column;
    private String[][] innerBoard;
    private String[][] outerBoard;
    private boolean isEnd = false;

    public MineSweeper(int row, int column) {
        if (row > 2 && column > 2) {
            this.row = row;
            this.column = column;
        } else {
            System.out.println("Girdiğiniz değerlerde tablo oluşturulamadı.");
            this.row = 3;
            this.column = 3;
            System.out.println("Varsayılan satır değeri : " + this.row);
            System.out.println("Varsayılan sütun değeri : " + this.column);
            System.out.println("İYİ OYUNLAR");
            System.out.println("==============================================");
        }
    }


    public void run() {
        System.out.println("\n Hadi başlayalım ");
        createBoards();
        placeMine();
        placeNumberOfMine();
        int round = (getColumn() * getRow()) - (getColumn() * getRow() / 4);
        while (isEnd() && round != 0) {
            select();
            round--;
            if (round == 0) {
                System.out.println("\n  MAYINLARIN KONUMU");
                System.out.println("----------------------------");
                showBoard(outerBoard);
                System.out.println("\n Tebrikler oyunu kazandınız.");
            }
        }
    }

    public void select() {
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("==============================================");
            showBoard(innerBoard);
            System.out.print("  Satır giriniz : ");
            int row = inp.nextInt() - 1;
            System.out.print("  Sütun giriniz : ");
            int column = inp.nextInt() - 1;

            if ((row >= 0 && row < innerBoard.length) && (column >= 0 && column < innerBoard[0].length)) {
                if (outerBoard[row][column].equals("*")) {
                    System.out.println("\n  MAYINLARIN KONUMU");
                    System.out.println("----------------------------");
                    showBoard(outerBoard);
                    System.out.println("\n  MAYINI SEÇTİNİZ");
                    System.out.println("  OYUN SONA ERDİ");
                    setEnd(true);
                } else {
                    innerBoard[row][column] = outerBoard[row][column];
                }
                break;
            } else {
                System.out.println("\n\tGEÇERSİZ KOORDİNAT");
                System.out.println("\tTEKRAR DENEYİNİZ\n");
            }
        } while (true);
    }

    public void createBoards() {
        setInnerBoard(new String[this.getRow()][this.getColumn()]);
        fillBoard(innerBoard);

        setOuterBoard(new String[this.getRow()][this.getColumn()]);
        fillBoard(outerBoard);
    }

    public void fillBoard(String[][] board) {
        for (String[] strings : board) {
            Arrays.fill(strings, "-");
        }
    }

    public void showBoard(String[][] board) {
        for (String[] row : board) {
            System.out.print("\t");
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public void placeMine() {
        int mineAmount = (this.getRow() * this.getColumn()) / 4;
        int i = 0;
        while (i < mineAmount) {
            Random random = new Random();
            int vertPosition = random.nextInt(0, this.getRow());
            int horiPosition = random.nextInt(0, this.getColumn());
            if (!this.outerBoard[vertPosition][horiPosition].equals("*")) {
                this.outerBoard[vertPosition][horiPosition] = "*";
                i++;
            }
        }
    }

    public void placeNumberOfMine() {
        String[][] extendedBoard = new String[this.outerBoard.length + 2][this.outerBoard[0].length + 2];
        fillBoard(extendedBoard);

        for (int j = 0; j < this.outerBoard.length; j++) {
            System.arraycopy(this.outerBoard[j], 0, extendedBoard[j + 1], 1, this.outerBoard[j].length);
        }

        for (int j = 1; j < extendedBoard.length - 1; j++) {
            for (int k = 1; k < extendedBoard[j].length - 1; k++) {
                if (!extendedBoard[j][k].equals("*")) {
                    int counter = 0;
                    for (int a = j - 1; a <= (j + 1); a++) {
                        for (int b = k - 1; b <= (k + 1); b++) {
                            if (extendedBoard[a][b].equals("*")) counter++;
                        }
                    }
                    extendedBoard[j][k] = String.valueOf(counter);
                }
            }
        }

        for (int j = 0; j < this.outerBoard.length; j++) {
            System.arraycopy(extendedBoard[j + 1], 1, this.outerBoard[j], 0, this.outerBoard[j].length);
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String[][] getInnerBoard() {
        return this.innerBoard;
    }

    public void setInnerBoard(String[][] innerBoard) {
        this.innerBoard = innerBoard;
    }

    public String[][] getOuterBoard() {
        return this.outerBoard;
    }

    public void setOuterBoard(String[][] outerBoard) {
        this.outerBoard = outerBoard;
    }

    public boolean isEnd() {
        return !this.isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}