public class BasicClothes implements Clothes{
    @Override
    public String getDescription(){
        return "Базовая одежда";
    }

    @Override
    public double getPrice(){
        return 50.0;
    }
}
