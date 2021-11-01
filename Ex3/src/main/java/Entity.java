class Cube implements Figure {
    private int a;
    private String cube = "Cube";

    public Cube(Integer a) {
        if(a == null) {
            a=0;
        }else{
            this.a = a;
        }
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public String getFigure() {
        return cube;
    }
}

class Сylinder implements Figure {
    private int r;
    private final double PI = 3.14;
    private int h;
    private String cylinder = "Cylinder";

    public Сylinder(Integer r, Integer h) {
        if(r == null) {
            r=0;
        }else if (h==null){
            h=0;
        }else{
            this.r = r;
            this.h = h;
        }

    }

    @Override
    public double getVolume() {
        return PI * (Math.pow(r, 2)) * h;
    }

    @Override
    public String getFigure() {
        return cylinder;
    }
}

class Sphere implements Figure {
    private int r;
    private final double PI = 3.14;
    private String sphere = "Sphere";

    public Sphere(Integer r) {
        if(r == null) {
            this.r=0;
        }else{
            this.r = r;
        }

    }


    @Override
    public double getVolume() {
        return (4 * PI * (Math.pow(r, 3))) / 3;
    }

    @Override
    public String getFigure() {
        return sphere;
    }
}
