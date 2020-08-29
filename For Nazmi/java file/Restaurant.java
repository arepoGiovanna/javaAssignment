import java.util.*;


public class Restaurant extends FoodeliverMenu{
    //protected String[] foodItems;
    
    private boolean status;
    
    public Restaurant(){}  //Default constructor

    public Restaurant(String foodId, String foodName, int foodPrice, boolean orderStatus){
        super(foodId, foodName, foodPrice);
        this.status = orderStatus;
    }

    public boolean updateMenu(){
        
        
        if(status == true){
            System.out.println("Pick-up order is ready :D !!!");
        }else if(status == false){
            System.out.println("Your food is now cooking B) !!!");
        }
        return status;
    }
}