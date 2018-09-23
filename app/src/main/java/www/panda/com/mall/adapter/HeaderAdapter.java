package www.panda.com.mall.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import www.panda.com.mall.R;
import www.panda.com.mall.entity.MyProduct;

public class HeaderAdapter extends BaseQuickAdapter<MyProduct,BaseViewHolder> {
    public HeaderAdapter(int layoutResId, @Nullable List<MyProduct> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyProduct item) {
        helper.setText(R.id.tv, item.getName());
        RequestOptions option = RequestOptions.circleCropTransform();
        option.placeholder(R.drawable.sample_footer_loading);
        Glide.with(mContext).load(item.getPic_url()).apply(option)
                .into((ImageView) helper.itemView.findViewById(R.id.iv));
    }
}
