package 模板方法模式;

/**
 * @author THINKPAD
 */
public class Teachers extends PrepareGotoSchool{

	@Override
	public void dressup() {
		System.out.println("老师 dressup");
	}

	@Override
	public void eatBreakfast() {
		System.out.println("老师 eatbreakfast");
	}

	@Override
	public void takeThings() {
		System.out.println("老师 takethings");
	}
	
}
