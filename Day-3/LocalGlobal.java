class LocalGlobal{
    /*
    WAP to show the difference between local and global variable
    */
    static int num = 10;
    public static void main(String[] args) {
        /*
        Global variable
        */
        System.out.println(num); //10
        /*
        Local variable
        */
        int num = 20;
        System.out.println(num); //20
    }   
}