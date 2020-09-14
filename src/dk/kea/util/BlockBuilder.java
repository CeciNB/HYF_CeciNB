package dk.kea.util;

public class BlockBuilder {
    /*
    Skal der læses fra en fil? Hvordan?
    Builer
     */
    private int verticalWall[][];
    private int horizontalWall[][];

    //-1 Entrance
    //2 Exit

    public BlockBuilder(){
        horizontalWall = new int[][]{
                {1, -1, 1, 1, 1, 1},
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 0, 1},
                {1, 1, 2, 1, 1, 1}
        };
        verticalWall = new int[][]{
                {1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {1, 1, 1, 1, 1}
        };

    }
}
