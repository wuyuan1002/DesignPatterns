package 工厂模式.工厂方法模式;

import 工厂模式.工厂方法模式.产品.Car;
import 工厂模式.工厂方法模式.工厂.BenzFactory;
import 工厂模式.工厂方法模式.工厂.BmwFactory;

/**
 * 一个工厂只生产其对应的一种产品，各司其职。即使是相同品牌，不同的产品都需要不同的工厂
 * 想要新增产品时，只需要新创建一个工厂类实现工厂接口即可，
 * 而不用像简单工厂模式那样修改原来的代码，代码耦合度降低
 *
 * 缺点：用户的操作度增高，没想生产一种产品都需要先创建他对应的工厂
 *
 *      ===见抽象工厂模式解决此缺点===
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        
        //要生产奔驰汽车，先创建一个奔驰工厂
        BenzFactory benzFactory = new BenzFactory();
        //生产奔驰汽车
        Car benzCar = benzFactory.getCar();
        
        
        //要生产宝马汽车，先创建一个宝马工厂
        BmwFactory bmwFactory = new BmwFactory();
        //生产宝马汽车
        Car bmwCar = bmwFactory.getCar();
        
        //测试
        System.out.println(benzCar.getName());
        System.out.println(bmwCar.getName());
    }
}
