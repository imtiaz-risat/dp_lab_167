public abstract class CondimentDecorator implements Beverage{
    Beverage beverage;
    CondimentDecorator condimentDecorator;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    public CondimentDecorator(CondimentDecorator condimentDecorator) {
        this.condimentDecorator = condimentDecorator;
    }

    public abstract String getDescription();
}
