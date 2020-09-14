package dk.kea.model;

public class Node {
    private int x;
    private int y;

    private Node east;
    private Node west;
    private Node north;
    private Node south;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node getEast() {
        return east;
    }

    public void setEast(boolean isWallEast) {
        if(isWallEast) {
            this.east = null;
        } else {
            this.east = new Node(x + 1, y);
        }
    }

    public Node getWest() {
        return west;
    }

    public void setWest(boolean isWallWest) {
        if(isWallWest) {
            this.west = null;
        } else {
            this.west = new Node(x -1, y);
        }
    }

    public Node getNorth() {
        return north;
    }

    public void setNorth(boolean isWallNorth) {
        if(isWallNorth) {
            this.north = null;
        } else {
            this.north = new Node(x , y + 1);
        }
    }

    public Node getSouth() {
        return south;
    }

    public void setSouth(boolean isWallSouth) {
        if(isWallSouth) {
            this.south = null;
        } else {
            this.south = new Node(x, y - 1);
        }
    }
}
