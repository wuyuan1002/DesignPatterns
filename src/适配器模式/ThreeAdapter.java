package 适配器模式;

/**
 * 三脚插头适配器
 *
 * @author THINKPAD
 */
public class ThreeAdapter implements Three {
    private Two two;
    
    public ThreeAdapter(Two two) {
        this.two = two;
    }
    
    @Override
    public void threeRound() {
        this.two.twoRound();
    }
    
}
