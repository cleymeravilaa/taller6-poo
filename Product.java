public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct(){
        System.out.println("Product name: " + this.name);
        System.out.println("Product price: " + this.price);
    }
}