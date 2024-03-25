package Products;

public class Products {
    private String name;
    private double priceInCents;
    private String barCode ;
    private int stock;

    public Products(String name, double priceInCents, String barCode,int stock){
        this.name =name;
        this.priceInCents = priceInCents;
        this.barCode = barCode;
        this.stock = stock;
    }

    public String getName (){
        return this.name;
    }

    public void setName (String name){
     this.name = name;
    }

    public double getPriceInCents (){
        return this.priceInCents;
    }

    public void setPriceInCents ( double priceInCents){
       this.priceInCents = priceInCents;
    }

    public String getBarCode (){
        return this.barCode;
    }

    public int getStock(){
        return stock;
    }


    
}
