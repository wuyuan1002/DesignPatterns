package 装饰者模式;

/**
 * 加生菜装饰
 *
 * @author THINKPAD
 */

public class Lettuce extends Condiment {
    
    private Humburger humburger;
    
    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }
    
    @Override
    public String getName() {
        return this.humburger.getName() + " 加生菜";
    }
    
    @Override
    public double getPrice() {
        return this.humburger.getPrice() + 1.5;
    }
    
}