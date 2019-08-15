package 工厂模式.简单工厂模式;

/**
 * @author THINKPAD
 */
public class HaierTV implements TV {
    
    @Override
    public void play() {
        System.out.println("生产了 HaierTV");
    }
    
}
