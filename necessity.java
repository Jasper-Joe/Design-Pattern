public class necessity implements visitable {
    private double price;
    necessity(double item){
        price=item;
    }
    public double accept(visitor v){
        return v.visit(this);
    }

    public double getPrice(){
        return price;
    }
}
