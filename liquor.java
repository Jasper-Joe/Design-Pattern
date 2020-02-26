class liquor implements visitable {
    private double price;
    liquor(double item){
        price=item;
    }

    public double accept(visitor v){
        return v.visit(this);
    }

    public double getPrice(){
        return price;
    }
}
