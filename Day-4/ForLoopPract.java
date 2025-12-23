public class ForLoopPract {
    public static void main(String[] args) {
        /*
         * 
         * 
         * ```for ( initializers ; condition ; updates ) statement```
         * 
         */

        for (;;) {
            System.out.println("Hi");       //infinite loop
            break; //no need of any vallues inside the for loop
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " " + j); //can update multiple variables
        }


        for(System.out.println("allen"), System.out.println("raju"), System.out.println("allen");;){
            System.out.println("allen");
            break; //if not infinite loop
        }

        for (int i=0/*, int j=0; this is an error to initialize the two variable*/;;){
            System.out.println("allen");
            break;
        }

        for(/*System.out.println("allen"), System.out.println("raju");*/;;){
            System.out.println("allen");
            break;                          //block scope is not allowed inside the initializers
        }

        for(/*void method(){
            System.out.println("allen");    //method declaration is not allowed inside the for loop
        }*/;;){
            System.out.println("allen");
            break;
        }  

        ForLoopPract obj = new ForLoopPract();
        for(obj.method();;){
            System.out.println("allen");
            break;
        }

        for(number();;){
            System.out.println("allen");
            break;
        }

    }

    void method(){
        System.out.println("allen");
    }

    static int number(){
        return 1;
    }

}
