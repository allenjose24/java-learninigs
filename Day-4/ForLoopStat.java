public class ForLoopStat {
    public static void main(String[] args) {
        System.out.println("-----Software starts-------");
        for(int i=1;i<=5;i++){
            //
           System.out.println(i++);
        }



        for(;;){
            System.out.println("Hello");
            break;
        }
        int i=1;

        for(System.out.println("HI");/*Either condition or no condition*/ i<=5; /*No icrement also needed to run successfully */){
            /*
            Even no block also needed to run successfully */
        }
        System.out.println("-----Software closed-------");
    }
}
