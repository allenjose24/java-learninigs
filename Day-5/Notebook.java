public class Notebook {
    int pages;
    int price;

    Notebook(int pages, int price){
        this.pages = pages;
        this.price = price;
    }

    void display(){
        System.out.println("The number of pages for this notebook is: " + pages);
        System.out.println("The price of this notebook is: "+ price);
    }
    public static void main(String[] args) {
        
        //This is just for an example.
        int pages1 = 200;
        int price1 = 30;

        int pages2 = 10000;
        int price2 = 500;
        

        Notebook book1 = new Notebook(pages1, price1);
        Notebook book2 = new Notebook(pages2, price2);

        book1.display();
        book2.display();
    }    
}
