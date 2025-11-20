public class Farm {
    public int acres;
    public String name;
    public boolean moneyMaking;

    public void printInfo() {
        System.out.println(acres);
        System.out.println(name);
        System.out.println(moneyMaking);
    }

    public Farm (){
        acres = 100;
        name = "the Best Farm";
        moneyMaking = true;


    }


    public Farm(int pAcres,String pName,boolean pMoneyMaking){
        acres = pAcres;
        name = pName;
        moneyMaking = pMoneyMaking;


    }




}
