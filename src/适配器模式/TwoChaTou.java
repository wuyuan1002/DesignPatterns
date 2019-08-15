package 适配器模式;

/**
 * 两脚插头
 *
 * @author THINKPAD
 */
public class TwoChaTou implements Two {
    
    @Override
    public void twoRound() {
        System.out.println("两脚插头");
    }
    
}
