package 工厂模式.工厂方法模式.工厂;

import 工厂模式.工厂方法模式.产品.BmwCar;
import 工厂模式.工厂方法模式.产品.Car;

/**
 * 宝马汽车工厂
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class BmwFactory implements Factory {
    @Override
    public Car getCar() {
        return new BmwCar();
    }
}
