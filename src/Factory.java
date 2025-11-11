public class Factory {

    //instance variables
    public int yearFounded;
    public boolean isOpen;
    public double earnings;
    public String products;


    public static void main(String[] args) {
        System.out.println("Welcome to Max's factory");

        new Factory();


    }


    //constructor
    public Factory(){
        System.out.println("we make houses!");
        yearFounded = 2025;
        isOpen = false;
        earnings = 4.1;
        products = "houses";
        factoryInfo();

        //change the value of the year founded and isOpen
        //call factoryInfo
    }

    public void factoryInfo(){
        System.out.println("the factory info");
        System.out.println("we make:");
        System.out.println(products);
        System.out.println("the year founded:");
        System.out.println(yearFounded);
        System.out.println("the earnings:" + earnings);
        System.out.println("it is" + isOpen + "that the factory is open");

    }
}



