package h1;

public class H1_main  
{
	public static void main(String[] args) {
        // Blinker-Muster
        Cell[] aliveCells = {
            new Cell(2, 1),
            new Cell(2, 2),
            new Cell(2, 3)
        };

        Grid grid = new Grid(aliveCells, 5, 5);

        // Ausgabe der Startgeneration
        System.out.println("Startgeneration:");
        printGrid(grid);

        // Weitere Generationen
        for (int gen = 1; gen <= 4; gen++) {
            grid.computeNextGen();
            System.out.println("Generation " + gen + ":");
            printGrid(grid);
        }
    }

    private static void printGrid(Grid grid) {
        for (int r = 0; r < grid.getGridArray().length; r++) {
            for (int c = 0; c < grid.getGridArray()[0].length; c++) {
                System.out.print(grid.getGridArray()[r][c].isAlive() ? "X " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }

}