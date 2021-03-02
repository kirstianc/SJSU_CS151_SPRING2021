//package Assignment3;

public class BusinessTest {

    public static void main(String[] args){
        Address add1 = new Address(100, "Long Street", "San Jose", "90000", "CA");
        Address add2 = new Address(777, "Blessed Avenue", "Heaven Gates", "7777777", "SKY");

        Executive e1 = new Executive();
        e1.introduce();
        System.out.println(e1.computePay()+"\n");

        Executive e2 = new Executive("John", "Executive-son", add1, 1, 1000.0, 500.0, "11N");
        e2.setEducationLevel("Doctorate");
        e2.introduce();
        System.out.println(e2.computePay()+"\n");

        FullTimeSalaried FTS1 = new FullTimeSalaried();
        FTS1.introduce();
        System.out.println(FTS1.computePay(0)+"\n");

        FullTimeSalaried FTS2 = new FullTimeSalaried("Johnny", "Salary", add2, 2, 1500.0, "22N");
        FTS2.setEducationLevel("Masters");
        FTS2.introduce();
        System.out.println(FTS2.computePay(10)+"\n");

        FullTimeHourly FTH1 = new FullTimeHourly();
        FTH1.introduce();
        System.out.println(FTH1.computePay(0)+"\n");

        FullTimeHourly FTH2 = new FullTimeHourly("Frank", "FTHourly", add1, 3, 500.0, "33N");
        FTH2.setEducationLevel("College");
        FTH2.introduce();
        System.out.println(FTH2.computePay(10)+"\n");

        PartTimeHourly PTH1 = new PartTimeHourly();
        PTH1.introduce();
        System.out.println(PTH1.computePay(0)+"\n");

        PartTimeHourly PTH2 = new PartTimeHourly("Perry", "PTHourly", add2, 4, 25.0, "44N");
        PTH2.setEducationLevel("High School");
        PTH2.introduce();
        System.out.println(PTH2.computePay(10)+"\n");

        Contractor C1 = new Contractor();
        C1.introduce();
        System.out.println(C1.computePay(0)+"\n");

        Contractor C2 = new Contractor("Christian", "Contractor", add1, 5, 50.0, "55N");
        C2.setEducationLevel("High School");
        C2.introduce();
        System.out.println(C2.computePay(10)+"\n");

        Customer Cu1 = new Customer();
        Cu1.introduce();
        Cu1.makePayment();
        System.out.println();

        Customer Cu2 = new Customer("Cranky", "Customer", add2, 6, "66N");
        Cu2.setPayPreference("Debit");
        Cu2.introduce();
        Cu2.makePayment();
        System.out.println();

    }
}
