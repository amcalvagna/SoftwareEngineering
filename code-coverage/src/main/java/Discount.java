
public class Discount {
    public static Status giveDiscount(long bonusPoints, boolean goldCustomer){
        Status rv = Status.ERROR; 
        long threshold=goldCustomer?80:120;
        long thresholdJump=goldCustomer?20:30;
        
        if(bonusPoints>0) {
            if(bonusPoints<thresholdJump)
                bonusPoints-=threshold;
            if(bonusPoints>thresholdJump)
                bonusPoints+=threshold;
            bonusPoints+=4*thresholdJump;
            if(bonusPoints>threshold)
                rv = Status.DISCOUNT;
            else
                rv = Status.FULLPRICE;
        }

        return rv;            
    }
}
