package 装饰者模式;

/**
 * 汉堡类
 *
 * @author THINKPAD
 */

public abstract class Humburger {
    
    protected String name;
    
    public String getName() {
        return name;
    }
    
    public abstract double getPrice();
    
}
