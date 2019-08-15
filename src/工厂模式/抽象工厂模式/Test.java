package 工厂模式.抽象工厂模式;

import 工厂模式.抽象工厂模式.产品.Car;
import 工厂模式.抽象工厂模式.产品.FaDongJi;
import 工厂模式.抽象工厂模式.工厂.BenzFactory;
import 工厂模式.抽象工厂模式.工厂.BmwFactory;

/**
 * 一类产品使用一个工厂，此例中一个品牌使用一个工厂，
 * 而不是像工厂方法模式那样每个产品都有自己的工厂
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        
        //要生产奔驰的产品(不管是奔驰的什么产品)，就创建一个奔驰的工厂
        BenzFactory benzFactory = new BenzFactory();
        //生产奔驰汽车
        Car benzCar = benzFactory.getCar();
        //生产奔驰发动机
        FaDongJi benzFaDongJi = benzFactory.getFaDongJi();
        
        
        //要生产宝马的产品(不管是宝马的什么产品)，就创建一个宝马的工厂
        BmwFactory bmwFactory = new BmwFactory();
        //生产宝马汽车
        Car bmwCar = bmwFactory.getCar();
        //生产宝马发动机
        FaDongJi bmwFaDongJi = bmwFactory.getFaDongJi();
        
        
        //测试
        System.out.println(benzCar.getCarName());
        System.out.println(benzFaDongJi.getFaDongJiName());
    
        System.out.println(bmwCar.getCarName());
        System.out.println(bmwFaDongJi.getFaDongJiName());
    }
}
