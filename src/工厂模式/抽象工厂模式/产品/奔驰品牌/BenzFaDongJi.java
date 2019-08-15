package 工厂模式.抽象工厂模式.产品.奔驰品牌;

import 工厂模式.抽象工厂模式.产品.FaDongJi;

/**
 * 奔驰发动机
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class BenzFaDongJi implements FaDongJi {
    @Override
    public String getFaDongJiName() {
        return "奔驰发动机";
    }
}
