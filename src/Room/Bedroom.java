package Room;
import houseware.*;

public class Bedroom {
    private String name;
    private Lamp lamp;
    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;
    private Ceiling ceiling;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    public Bedroom(String name, Lamp lamp, Bed bed, Wardrobe wardrobe, Carpet carpet, Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.name = name;
        this.lamp = lamp;
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public String getName() {
        return name;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }
}
