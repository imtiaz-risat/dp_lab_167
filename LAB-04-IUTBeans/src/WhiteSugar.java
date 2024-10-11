public class WhiteSugar extends CondimentDecorator {

    public WhiteSugar(Beverage beverage) {
        super(beverage);
        //TODO Auto-generated constructor stub
    }

    public WhiteSugar(CondimentDecorator condimentDecorator){
        super(condimentDecorator);
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }
    
}
