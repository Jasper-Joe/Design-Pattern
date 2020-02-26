interface visitor {
    //The visitor pattern is used when we have to
    // perform the same action on many objects of different types
    public double visit(liquor liquorItem);
    public double visit(tobacco tobaccoItem);
    public double visit(necessity necessityItem);
}
