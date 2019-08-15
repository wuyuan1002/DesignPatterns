package 适配器模式;

/**
 * 三脚插头
 *
 * @author THINKPAD
 */
public class ThreeChaTou implements Three{

	@Override
	public void threeRound() {
		System.out.println("三角插头");
	}

}
