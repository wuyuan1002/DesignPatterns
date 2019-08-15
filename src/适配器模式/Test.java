package 适配器模式;

/**
 * @author THINKPAD
 */
public class Test {
    
    public static void main(String[] args) {
        
        //创建两个不同的插头
        TwoChaTou twoChaTou = new TwoChaTou();
        ThreeChaTou threeChaTou = new ThreeChaTou();
        
        //创建一个三脚插头适配器，并把三脚脚插头适配成两脚插头
        ThreeAdapter threeAdapter = new ThreeAdapter(twoChaTou);
        
        //调用三角插头的方法
        threeChaTou.threeRound();
        
        //调用适配器的方法
        threeAdapter.threeRound();
    }
    
}
