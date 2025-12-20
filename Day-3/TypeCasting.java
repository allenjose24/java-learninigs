public class TypeCasting {
    public static void main(String[] args) {
        /*
        WAP to show the difference between type casting and type conversion
        */
        System.out.println("---------Wideninig---------");
        byte b = 10;
        int i = b;
        System.out.println(i);
        System.out.println(b);

        System.out.println("---------Narrowing---------");
        int i2 = 10;
        byte b2 = (byte) i2;
        System.out.println(b2);
        System.out.println(i2);

        System.out.println("---------Implicit Type Casting---------");
        float f = 10.5f;
        double d = f;
        System.out.println(d);
        System.out.println(f);

        System.out.println("---------Explicit Type Casting---------");
        double d2 = 10.5;
        float f2 = (float) d2;
        System.out.println(f2);
        System.out.println(d2);

        System.out.println("---------Type Conversion---------");
        int i3 = 10;
        double d3 = i3;
        System.out.println(d3);
        System.out.println(i3);

        int i4 = 10;
        double d4 = i4;
        System.out.println(d4);

        double d5 = 10.5;
        int i5 = (int) d5;
        System.out.println(i5);
        
    }
}
