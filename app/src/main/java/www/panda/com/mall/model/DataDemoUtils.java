package www.panda.com.mall.model;

import java.util.ArrayList;

import www.panda.com.mall.R;
import www.panda.com.mall.entity.MyProduct;
import www.panda.com.mall.entity.MySection;

public enum DataDemoUtils {

    Singleton;

    public ArrayList<MySection> getData0(ArrayList<MySection> list){
        list.clear();
        list.add(new MySection(true, "IPhone"));
        list.add(new MySection(new MyProduct("iphone6", R.drawable.two)));
        list.add(new MySection(new MyProduct("iphone7", R.drawable.two)));
        list.add(new MySection(new MyProduct("iphone8", R.drawable.two)));
        list.add(new MySection(new MyProduct("iphoneX", R.drawable.two)));
        list.add(new MySection(new MyProduct("iphoneXS", R.drawable.two)));
        list.add(new MySection(new MyProduct("ip XS MAX", R.drawable.two)));
        list.add(new MySection(new MyProduct("iphoneXR", R.drawable.two)));
        list.add(new MySection(true, "Huawei"));
        list.add(new MySection(new MyProduct("HuaweiP20", R.drawable.one)));
        list.add(new MySection(new MyProduct("HuaweiM20", R.drawable.one)));
        list.add(new MySection(new MyProduct("HuaweiM10", R.drawable.one)));
        list.add(new MySection(true, "Xiaomi"));
        list.add(new MySection(new MyProduct("xiaomi1", R.drawable.three)));
        list.add(new MySection(new MyProduct("xiaomi2", R.drawable.three)));
        list.add(new MySection(new MyProduct("xiaomi3", R.drawable.three)));
        list.add(new MySection(new MyProduct("xiaomi4", R.drawable.three)));
        list.add(new MySection(new MyProduct("xiaomi5", R.drawable.three)));
        list.add(new MySection(new MyProduct("xiaomi6", R.drawable.three)));
        list.add(new MySection(new MyProduct("xiaomi7", R.drawable.three)));
        list.add(new MySection(new MyProduct("xiaomi8", R.drawable.three)));
        list.add(new MySection(true, "oppo"));
        list.add(new MySection(new MyProduct("oppoR9", R.drawable.four)));
        list.add(new MySection(new MyProduct("oppoR10", R.drawable.four)));
        list.add(new MySection(new MyProduct("oppoR11", R.drawable.four)));
        list.add(new MySection(new MyProduct("oppoR12", R.drawable.four)));
        list.add(new MySection(new MyProduct("oppoR14", R.drawable.four)));
        list.add(new MySection(new MyProduct("oppoR15", R.drawable.four)));
        list.add(new MySection(new MyProduct("oppoR16", R.drawable.four)));
        list.add(new MySection(new MyProduct("oppoR17", R.drawable.four)));
        list.add(new MySection(true, "vivo"));
        list.add(new MySection(new MyProduct("vivoX17", R.drawable.five)));
        list.add(new MySection(new MyProduct("vivoX18", R.drawable.five)));
        list.add(new MySection(new MyProduct("vivoX19", R.drawable.five)));
        list.add(new MySection(new MyProduct("vivoX20", R.drawable.five)));
        list.add(new MySection(new MyProduct("vivoX21", R.drawable.five)));
        list.add(new MySection(new MyProduct("vivoX22", R.drawable.five)));
        list.add(new MySection(true, "samsung"));
        list.add(new MySection(new MyProduct("samsungS1", R.drawable.six)));
        list.add(new MySection(new MyProduct("samsungS2", R.drawable.six)));
        list.add(new MySection(new MyProduct("samsungS3", R.drawable.six)));
        list.add(new MySection(new MyProduct("samsungS4", R.drawable.six)));
        list.add(new MySection(new MyProduct("samsungS5", R.drawable.six)));
        return list;
    }

    public ArrayList<MySection> getData1(ArrayList<MySection> list){
        list.clear();
        list.add(new MySection(true, "Women's Dress"));
        list.add(new MySection(new MyProduct("Dress", R.drawable.seven)));
        list.add(new MySection(new MyProduct("Topa", R.drawable.seven)));
        list.add(new MySection(new MyProduct("T-Shirt", R.drawable.ten)));
        list.add(new MySection(new MyProduct("Jeans", R.drawable.nine)));
        list.add(new MySection(new MyProduct("Shirt", R.drawable.eight)));
        list.add(new MySection(new MyProduct("TARA", R.drawable.two)));
        list.add(new MySection(new MyProduct("H&M", R.drawable.ten)));
        list.add(new MySection(true, "Men's Wear"));
        list.add(new MySection(new MyProduct("Dress", R.drawable.ten)));
        list.add(new MySection(new MyProduct("T-Shirt", R.drawable.nine)));
        list.add(new MySection(new MyProduct("Jeans", R.drawable.seven)));
        list.add(new MySection(true, "Men's Clothes"));
        list.add(new MySection(new MyProduct("xiaomi1", R.drawable.eight)));
        list.add(new MySection(new MyProduct("Dress", R.drawable.six)));
        list.add(new MySection(new MyProduct("T-Shirt", R.drawable.six)));
        list.add(new MySection(new MyProduct("Dress", R.drawable.seven)));
        list.add(new MySection(new MyProduct("Jeans", R.drawable.nine)));
        list.add(new MySection(new MyProduct("Dress", R.drawable.nine)));
        list.add(new MySection(new MyProduct("Shirt", R.drawable.eight)));
        list.add(new MySection(new MyProduct("Topa", R.drawable.seven)));
        list.add(new MySection(true, "Men's Coat"));
        list.add(new MySection(new MyProduct("T-Shirt", R.drawable.seven)));
        list.add(new MySection(new MyProduct("Jeans", R.drawable.six)));
        list.add(new MySection(new MyProduct("H&M", R.drawable.eight)));
        list.add(new MySection(new MyProduct("TARA", R.drawable.six)));
        list.add(new MySection(new MyProduct("Shirt", R.drawable.seven)));
        list.add(new MySection(new MyProduct("Topa", R.drawable.nine)));
        list.add(new MySection(new MyProduct("H&M", R.drawable.seven)));
        list.add(new MySection(new MyProduct("Shirt", R.drawable.eight)));
        list.add(new MySection(true, "Men's Jacket"));
        list.add(new MySection(new MyProduct("H&M", R.drawable.seven)));
        list.add(new MySection(new MyProduct("Topa", R.drawable.six)));
        list.add(new MySection(new MyProduct("Jeans", R.drawable.eight)));
        list.add(new MySection(new MyProduct("Topa", R.drawable.seven)));
        list.add(new MySection(new MyProduct("TARA", R.drawable.six)));
        list.add(new MySection(new MyProduct("Shirt", R.drawable.nine)));
        list.add(new MySection(true, "Women's Skirt"));
        list.add(new MySection(new MyProduct("Jeans", R.drawable.eight)));
        list.add(new MySection(new MyProduct("Shirt", R.drawable.ten)));
        list.add(new MySection(new MyProduct("Topa", R.drawable.seven)));
        list.add(new MySection(new MyProduct("T-Shirt", R.drawable.nine)));
        list.add(new MySection(new MyProduct("TARA", R.drawable.seven)));
        return list;
    }
}
