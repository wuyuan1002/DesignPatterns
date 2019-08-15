package 工厂模式.抽象工厂模式.工厂;

import 工厂模式.抽象工厂模式.产品.Car;
import 工厂模式.抽象工厂模式.产品.FaDongJi;
import 工厂模式.抽象工厂模式.产品.宝马品牌.BmwCar;
import 工厂模式.抽象工厂模式.产品.宝马品牌.BmwFaDongJi;

/**
 * 宝马品牌工厂
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
    
    @Override
    public FaDongJi getFaDongJi() {
        return new BmwFaDongJi();
    }
}
