package 工厂模式.抽象工厂模式.产品.宝马品牌;

import 工厂模式.抽象工厂模式.产品.FaDongJi;

/**
 * 宝马发动机
 *
 * @author wuyuan
 * @date 2019/8/4
 * @version 1.0
 */
public class BmwFaDongJi implements FaDongJi {
    @Override
    public String getFaDongJiName() {
        return "宝马发动机";
    }
}
