package point;

import java.time.Year;

public class Point_2D {
    double x = 0.0;
    double y = 0.0;
    Point_2D(){}
    Point_2D(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double [] getXY(){
        double [] arr = new double[2];
        arr[0] = x;
        arr[1] = y;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+"index" + i);
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Point_2D{" +
                getXY()
                + '}';
    }

    public static void main(String[] args) {
        Point_2D point_2D = new Point_2D();
        System.out.println(point_2D);
        point_2D = new Point_2D(2.0,3.0);
        System.out.println(point_2D);
    }
}
class Point_3D extends Point_2D{
    double z = 0.0;
    Point_3D(){}
    Point_3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXY(double x, double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double [] getXYZ() {
        double[] arr = new double[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "index" + i);
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Point_3D{"
                +super.toString()
                +"after add z=" + getXYZ() +
                '}';
    }

    public static void main(String[] args) {
        Point_3D point_3D = new Point_3D();
        System.out.println(point_3D);
        point_3D = new Point_3D(3.0,5.0,6.0);
        System.out.println(point_3D);
    }
}
