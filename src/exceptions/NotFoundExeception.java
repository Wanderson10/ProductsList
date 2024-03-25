package exceptions;
import Products.Products;

public class NotFoundExeception extends Exception {
    public NotFoundExeception(){
        super("Product not Found");
    }
}
