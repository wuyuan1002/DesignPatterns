package 模板方法模式;

/**
 * 模板方法模式，定义一个操作中的算法骨架，而将一些步骤延迟到子类中，在
 * 子类中完成自己的实现。
 * 模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
 *
 * @author THINKPAD
 */
public class Test {

	public static void main(String[] args) {
		Teachers teachers = new Teachers();
		Students students = new Students();
		teachers.doit();
		students.doit();
	}

}
