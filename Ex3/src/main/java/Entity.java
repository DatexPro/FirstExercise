
class Cube implements Figure {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }
}

class Сylinder implements Figure {
    private int r;
    private final double PI = 3.14;
    private int h;

    public Сylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return PI * (Math.pow(r, 2)) * h;
    }
}

class Sphere implements Figure {
    private int r;
    private final double PI = 3.14;

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (3 * PI * (Math.pow(r, 3))) / 4;
    }
}