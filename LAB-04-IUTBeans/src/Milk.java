public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
        //TODO Auto-generated constructor stub
    }
    public Milk(CondimentDecorator condimentDecorator){
        super(condimentDecorator);
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }
    
}
