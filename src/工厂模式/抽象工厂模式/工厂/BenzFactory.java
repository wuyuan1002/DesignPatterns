package 工厂模式.抽象工厂模式.工厂;

import 工厂模式.抽象工厂模式.产品.Car;
import 工厂模式.抽象工厂模式.产品.FaDongJi;
import 工厂模式.抽象工厂模式.产品.奔驰品牌.BenzCar;
import 工厂模式.抽象工厂模式.产品.奔驰品牌.BenzFaDongJi;

/**
 * 奔驰品牌工厂
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new BenzCar();
    }
    
    @Override
    public FaDongJi getFaDongJi() {
        return new BenzFaDongJi();
    }
}
