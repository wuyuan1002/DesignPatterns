package 工厂模式.简单工厂模式;

/**
 * 缺点：多种产品对应同一个工厂，每新增一个产品，都需要修改工厂里的 if else语句，
 *      都需要修改原来的代码，代码耦合度太高
 *
 *      ===见工厂方法模式解决此缺点===
 *
 * @author THINKPAD
 */
public class Test {
    
    public static void main(String[] args) {
        
        //创建一个电视机工厂
        TVFactory tvFactory = new TVFactory();
        
        //生产海尔电视
        TV tv1 = tvFactory.produceTV("Haier");
        tv1.play();
        
        //生产海信电视
        TV tv2 = tvFactory.produceTV("Hisence");
        tv2.play();
    }
    
}
