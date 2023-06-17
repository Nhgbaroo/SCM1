package REFACTOR;

public class paint {
    // print the result in location(x,y) with the color(red blue,green)
    public void paintResult(PaintBuilder builder) {
        // do not need to rewrite this code
        System.out.println(builder.getX() + ", " + builder.getY());
        System.out.println(builder.getRed() + ", " + builder.getBlue() + ", " + builder.getGreen());
    }
}

class PaintBuilder {
    private int x;
    private int y;
    private byte red;
    private byte blue;
    private byte green;

    public PaintBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public PaintBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public PaintBuilder setRed(byte red) {
        this.red = red;
        return this;
    }

    public PaintBuilder setBlue(byte blue) {
        this.blue = blue;
        return this;
    }

    public PaintBuilder setGreen(byte green) {
        this.green = green;
        return this;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public byte getRed() {
        return red;
    }

    public byte getBlue() {
        return blue;
    }

    public byte getGreen() {
        return green;
    }
}