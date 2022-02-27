import section7.*;

public class main {

    public static void main(String[] args) {


/*        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());*/


/*        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(150);
        double somme = bankAccount.getBalance();
        System.out.println(somme);

        bankAccount.withdraw(70);
        double somme2 = bankAccount.getBalance();
        System.out.println(somme2);*/

            //ExoOral80
/*        VipCustomer vipCustomer = new VipCustomer("antoine", 100, "160 ave st mitres des champs");
        String testName = vipCustomer.getName();
        System.out.println(testName);


        VipCustomer vipCustomer2 = new VipCustomer();
        String testName2 = vipCustomer2.getName();
        System.out.println(testName2);

        VipCustomer vipCustomer3 = new VipCustomer("bob", 100);
        String testName3 = vipCustomer3.getAddress();
        System.out.println(testName3);*/

/*        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());*/


        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());


    }


}
