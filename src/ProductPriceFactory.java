public class ProductPriceFactory extends ProductFactory {
    @Override
    public Product getProduct(String ProductType) {
        if (ProductType.equalsIgnoreCase("BANANAS")) {
            return new BananasPrice();
        } else if (ProductType.equalsIgnoreCase("APPLES")) {
            return new ApplesPrice();
        }
        return null;
    }
}