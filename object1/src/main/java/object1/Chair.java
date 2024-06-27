package object1;

public class Chair {
    private String material;
    private String color;
    private int legs;
    private int adjustPositions;

    public Chair(String material, String color, int legs, int adjustPositions) {
        this.material = material;
        this.color = color;
        this.legs = legs;
        this.adjustPositions = adjustPositions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getAdjustPositions() {
        return adjustPositions;
    }

    public void setAdjustPositions(int adjustPositions) {
        this.adjustPositions = adjustPositions;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", legs=" + legs +
                ", adjustPositions=" + adjustPositions +
                '}';
    }
}
