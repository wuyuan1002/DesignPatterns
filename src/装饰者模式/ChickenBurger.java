package 装饰者模式;

/**
 * 一个简单的鸡腿堡，还没有被装饰
 *
 * @author THINKPAD
 */

public class ChickenBurger extends Humburger {
    
    public ChickenBurger() {
        super.name = "鸡腿堡";
    }
    
    @Override
    public double getPrice() {
        return 10;
    }
    
}
