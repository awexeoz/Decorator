public class CasualClothesDecorator implements Clothes {
    private final Clothes decoratedClothes;

    public CasualClothesDecorator(Clothes decoratedClothes){
        this.decoratedClothes = decoratedClothes;
    }

    @Override
    public String getDescription(){
        return decoratedClothes.getDescription() + ",Повсдневная одежда";
    }

    @Override
    public double getPrice(){
        return decoratedClothes.getPrice() + 30.0;
    }
}
