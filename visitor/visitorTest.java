public class visitorTest {
    public static void main(String[] args){
        taxHolidayVisitor taxHolidayCalc = new taxHolidayVisitor();
        taxvisitor taxCalc=new taxvisitor();

        necessity milk = new necessity(3.47);
        liquor vodka = new liquor(11.99);
        tobacco cigars = new tobacco(19.99);
        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigars.accept(taxCalc) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");
        System.out.println(milk.accept(taxHolidayCalc) + "\n");
        System.out.println(vodka.accept(taxHolidayCalc) + "\n");
        System.out.println(cigars.accept(taxHolidayCalc) + "\n");











    }
}
