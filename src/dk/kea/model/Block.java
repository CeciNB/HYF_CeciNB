package dk.kea.model;

public class Block {
    private Wall east;
    private Wall west;
    private Wall north;
    private Wall south;
    private Node node;

    public Block(Wall east, Wall west, Wall north, Wall south) {
        this.east = east;
        this.west = west;
        this.north = north;
        this.south = south;
    }

    public Wall getEast() {
        return east;
    }

    public void setEast(Wall east) {
        this.east = east;
    }

    public Wall getWest() {
        return west;
    }

    public void setWest(Wall west) {
        this.west = west;
    }

    public Wall getNorth() {
        return north;
    }

    public void setNorth(Wall north) {
        this.north = north;
    }

    public Wall getSouth() {
        return south;
    }

    public void setSouth(Wall south) {
        this.south = south;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
