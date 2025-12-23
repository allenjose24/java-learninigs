public class Polygon {
    public static void main(String[] args) {

        System.out.println("The area of the Rectangle with l=5 and b=4 is: " + areaOfRectangle(5, 4));

        System.out.println("The area of Square with side a=6 is: " + areaOfSquare(6));

        System.out.println("The area of the circle with radius r= 4.63 is: "+ areaOfCircle(4.63));

        System.out.println("The area of the triangle with b=3 and h=4 is: "+ areaOfTriangle(3, 4));
        
    }

    static int areaOfRectangle(int l, int b){
        return l*b;
    }
    static int areaOfSquare(int a){
        return a*a;
    }
    static double areaOfCircle(double r){
        return Math.PI*r*r;
    }
    static int areaOfTriangle(int b, int h){
        return (int)(0.5*b*h);
    }
}
