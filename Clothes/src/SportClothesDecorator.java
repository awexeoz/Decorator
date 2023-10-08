public class SportClothesDecorator implements Clothes {
    private final Clothes decoratedClothes;

    public SportClothesDecorator(Clothes decoratedClothes) {
        this.decoratedClothes = decoratedClothes;
    }

    @Override
    public String getDescription() {
        return decoratedClothes.getDescription() + ", Спортивная одежда";
    }

    @Override
    public double getPrice() {
        return decoratedClothes.getPrice() + 20.0;
    }
}