package exceptions;

public class NegativePriceException extends Exception {

    public NegativePriceException(){
        super("Negative numbers are not valid value");
    }

    
    public NegativePriceException(String msg){
        super(msg);
    }


    }

