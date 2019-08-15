package 工厂模式.工厂方法模式.工厂;

import 工厂模式.工厂方法模式.产品.Car;

/**
 * 工厂接口
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public interface Factory {
    public abstract Car getCar();
}
