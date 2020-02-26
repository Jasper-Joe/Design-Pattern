import java.text.DecimalFormat;
class taxvisitor implements visitor {

    DecimalFormat df=new DecimalFormat("#.##");

    public taxvisitor(){

    }

    @Override
    public double visit(liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18)+liquorItem.getPrice()));

    }

    public double visit(tobacco tobaccoItem){
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice()* .32)+tobaccoItem.getPrice()));

    }

    public double visit(necessity necessityItem){
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format((necessityItem.getPrice())));

    }




}
