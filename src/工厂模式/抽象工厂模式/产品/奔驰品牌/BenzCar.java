package 工厂模式.抽象工厂模式.产品.奔驰品牌;


import 工厂模式.抽象工厂模式.产品.Car;

/**
 * 奔驰汽车类
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class BenzCar implements Car {
    
    @Override
    public String getCarName() {
        return "奔驰汽车";
    }
}
