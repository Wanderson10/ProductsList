package exceptions;

public class EqualsBarCodeException extends Exception {
    public EqualsBarCodeException(){
        super("Equals BarCode as not allowed");
    }

    
    public EqualsBarCodeException(String msg){
        super(msg);
    }

}
