import Products.Products;
import Products.ProductsControler;

public class Main {
    // atributos auxiliares para teste (caso precise).
    public static void main(String[] args) {
        Products item = new Products("ps4", 1400, "1231231", 1);
        Products item2 = new Products("ps3", 800, "123123123", 1);
       ProductsControler ps4 = new ProductsControler("ps4", 1400, "1231231", 1);
       ps4.create(item);

       ps4.read();
       ps4.retrievePrice("1231231");
    }

    // métodos auxiliares para teste (caso precise).
}
