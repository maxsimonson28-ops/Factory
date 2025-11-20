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
        int x;
        factoryInfo();
        yearFounded=1274;
        factoryInfo();


        //object of type house
        House h1 = new House();
        h1.owner = "Mr.Kim";
        System.out.println("The owner is " + h1.owner);

        h1.address = "41 Barbershop road";
        h1.isOccupied = true;
        h1.size = 50.67;
        h1.walls = 4;
        System.out.println("The address is " + h1.address);
        System.out.println("The size is " + h1.size);
        System.out.println("It has " + h1.walls + " walls");


        House h2 = new House();
        System.out.println(h2.size);
        h2.size = 40.2;
        System.out.println(h2.size);
        h2.printInfo();

        House myHouse = new House();
        myHouse.printInfo();


        House customHouse = new House(200.24,8,"Max","153 centre st",true);
        customHouse.printInfo();

        Farm f1 = new Farm();
        f1.name = "the Best Farm";
        System.out.println("The name of the farm is " + f1.name);
        f1.acres = 100;
        System.out.println("The farm has " + f1.acres + " acres");
        f1.moneyMaking = true;
        System.out.println("It is "+ f1.moneyMaking + " that the farm makes money");


        Farm myFarm = new Farm(100, "Farm", true);
        myFarm. printInfo();





    }

    public void factoryInfo(){
        System.out.println("the factory info");
        System.out.println("we make:");
        System.out.println(products);
        System.out.println("the year founded:");
        System.out.println(yearFounded);
        System.out.println("the earnings:" + earnings);
        System.out.println("it is " + isOpen + " that the factory is open");

    }





}



