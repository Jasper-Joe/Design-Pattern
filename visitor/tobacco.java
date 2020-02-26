public class tobacco {
    private double price;
    tobacco(double item){
        price=item;
    }

    public double accept(visitor v){
        return v.visit(this);
    }

    public double getPrice(){
        return price;
    }
}
