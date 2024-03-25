package Products;

import java.util.ArrayList;

import exceptions.EqualsBarCodeException;
import exceptions.NegativePriceException;

public class ProductsControler extends Products{
    ArrayList<Products> productsList = new ArrayList<>();

    public ProductsControler(String name, double priceInCents, String barCode,int stock){
        super(name,priceInCents,barCode,stock);

    }

    public Products create(Products payload){
        try{
     
        if (payload.getPriceInCents() < 0){
            throw new NegativePriceException("Numero negativo não né cria");
        }
        
        for(int i=0; i < productsList.size(); i++){
            if (productsList.get(i).getBarCode().equals(payload.getBarCode()) ){
                throw new EqualsBarCodeException();
            }

        }
        productsList.add(payload);
 
        System.out.println("Produto Criado seu cria"+ payload);
        return payload;

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
               
        }

    }

    public ArrayList<Products> read(){
        System.out.println(productsList);
        return productsList;

    }
    public Double retrievePrice(String barCode){
        for (int i = 0; i < productsList.size(); i++){
            if (productsList.get(i).getBarCode().equals(barCode)){
                 System.out.println("Produto encontrado " + productsList.get(i).getPriceInCents());
                 return productsList.get(i).getPriceInCents();
            }

        }
        return null;

    }
    
}
