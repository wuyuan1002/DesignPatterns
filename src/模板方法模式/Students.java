package 模板方法模式;

/**
 * @author THINKPAD
 */
public class Students extends PrepareGotoSchool{

	@Override
	public void dressup() {
		System.out.println("学生 dressup");
	}

	@Override
	public void eatBreakfast() {
		System.out.println("学生 eatbreakfast");
	}

	@Override
	public void takeThings() {
		System.out.println("学生 takethings");
	}

}
