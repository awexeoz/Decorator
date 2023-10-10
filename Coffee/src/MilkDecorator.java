class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Молоко";
    }

    public double cost() {
        return decoratedCoffee.cost() + 20;
    }
}