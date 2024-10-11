public abstract class CondimentDecorator{
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
