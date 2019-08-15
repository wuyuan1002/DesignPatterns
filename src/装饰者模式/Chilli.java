package 装饰者模式;

/**
 * 加辣椒装饰
 *
 * @author THINKPAD
 */

public class Chilli extends Condiment {
    
    private Humburger humburger;
    
    public Chilli(Humburger humburger) {
        this.humburger = humburger;
        
    }
    
    @Override
    public String getName() {
        return this.humburger.getName() + " 加辣椒";
    }
    
    @Override
    public double getPrice() {
        return this.humburger.getPrice();  //辣椒是免费
    }
    
}