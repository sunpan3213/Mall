package www.panda.com.mall.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.mob.shop.datatype.entity.Product;

public class MyProduct extends Product implements MultiItemEntity{

    private int type;

    @Override
    public int getItemType() {
        return type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
