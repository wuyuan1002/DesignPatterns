package 模板方法模式;

/**
 * @author THINKPAD
 */
public abstract class PrepareGotoSchool {
	final void doit() {
		dressup();
		eatBreakfast();
		takeThings();
	}
	
	public abstract void dressup();
	public abstract void eatBreakfast();
	public abstract void takeThings();
}
