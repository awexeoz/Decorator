class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Сахар";
    }

    public double cost() {
        return decoratedCoffee.cost() + 30;
    }
}