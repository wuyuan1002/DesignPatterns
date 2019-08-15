package 装饰者模式;

/**
 * 装饰者与被装饰者要拥有共同的超类，继承的目的是继承类型，而不是行为。
 *
 * @author THINKPAD
 */

public class Test {
    
    public static void main(String[] args) {
        
        //买一个鸡腿堡
        Humburger humburger = new ChickenBurger();
        System.out.println(humburger.getName() + " -> 价格: " + humburger.getPrice());
        
        //加生菜
        Lettuce lettuce = new Lettuce(humburger);
        System.out.println(lettuce.getName() + " -> 价格: " + lettuce.getPrice());
        
        //加辣椒
        Chilli chilli = new Chilli(lettuce);
        System.out.println(chilli.getName() + " -> 价格: " + chilli.getPrice());
        
    }
    
}
