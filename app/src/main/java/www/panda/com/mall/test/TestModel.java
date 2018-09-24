package www.panda.com.mall.test;

import java.util.ArrayList;

import www.panda.com.mall.entity.MySection;
import www.panda.com.mall.model.DataDemoUtils;

public class TestModel {

    public void test(){
        ArrayList<MySection> list = new ArrayList<>();
        DataDemoUtils.Singleton.getData(list);
        System.out.print(list.size());
    }
}
