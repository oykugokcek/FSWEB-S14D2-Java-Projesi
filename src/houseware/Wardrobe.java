package houseware;

public class Wardrobe {
    private int width;
    private int height;
    private int weight;

    public Wardrobe(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void add() {
        System.out.println("Wordrobe added into Bedroom");
    }
}
