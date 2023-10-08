public class FashionClothesDecorator implements Clothes {
    private final Clothes decoratedClothes;

    public FashionClothesDecorator(Clothes decoratedClothes){
        this.decoratedClothes = decoratedClothes;
    }

    @Override
    public String getDescription(){
        return decoratedClothes.getDescription() + ",Модная одежда";
    }

    @Override
    public double getPrice(){
        return decoratedClothes.getPrice() + 40.0;
    }

}

