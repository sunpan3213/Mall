package www.panda.com.mall.entity;

import com.chad.library.adapter.base.entity.SectionEntity;

public class MySection extends SectionEntity<MyProduct> {

    public MySection(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public MySection(MyProduct o) {
        super(o);
    }
}
