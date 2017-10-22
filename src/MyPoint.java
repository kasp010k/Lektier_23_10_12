public class MyPoint {

    public static void main(String[] args) {

        MyPoint = new MyPoint(0, 0);
        System.out.println("Distance is " + test.distance(10, 30.5));
    }

    double x, y;

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    double distance(){
        return Math.sqrt((x-1)*(x-1))+((y-1)*(y-1));
    }

    double distance(double x1, double y1){
        return Math.sqrt( ( (x-x1)*(x-x1) )+( (y-y1)*(y-y1) ) );
    }

    public void setX(int x) { this.x = x;
    }
    public void setY(int y) { this.y = y;
    }
    public double getX() { return x;
    }
    public double getY() { return y;
    }
}