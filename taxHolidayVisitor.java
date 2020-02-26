import java.text.DecimalFormat;
class taxHolidayVisitor implements visitor {

    DecimalFormat df=new DecimalFormat("#.##");

    public taxHolidayVisitor(){

    }
    @Override
    public double visit(liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
    }

    @Override
    public double visit(tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));

    }

    @Override
    public double visit(necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));

    }
}
