package 工厂模式.简单工厂模式;

/**
 * @author THINKPAD
 */
public class TVFactory {
    private TV tv;
    
    public TV produceTV(String tv) {
        if ("Haier".equals(tv)) {
            this.tv = new HaierTV();
        } else if ("Hisence".equals(tv)) {
            this.tv = new HisenceTV();
        } else {
            System.err.println("无法生产这个产品！");
            this.tv = null;
        }
        return this.tv;
    }
}
