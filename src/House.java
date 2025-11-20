public class House {

    //instance variables
    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;

    public House(){
        walls = 4;
        size = 3200.7;
        owner = "Bobby";
        address = "323 centre st";
        isOccupied = true;
    }

    public House(double pSize,int pWalls,String pOwner,String pAddress,boolean pIsOccupied){
        size = pSize;
        walls = pWalls;
        owner = pOwner;
        address = pAddress;
        isOccupied = pIsOccupied;





    }


    public void printInfo(){
        System.out.println(walls);
        System.out.println(size);
        System.out.println("name of owner: " + owner);
        System.out.println("address: " + address);
        System.out.println(isOccupied);
    }
}
