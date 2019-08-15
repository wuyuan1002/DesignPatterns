package 工厂模式.抽象工厂模式.产品.宝马品牌;


import 工厂模式.抽象工厂模式.产品.Car;

/**
 * 宝马汽车类
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class BmwCar implements Car {
    
    @Override
    public String getCarName() {
        return "宝马汽车";
    }
}
