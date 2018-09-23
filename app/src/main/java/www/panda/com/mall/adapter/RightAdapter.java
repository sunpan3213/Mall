package www.panda.com.mall.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import www.panda.com.mall.R;
import www.panda.com.mall.entity.MySection;

public class RightAdapter extends BaseSectionQuickAdapter<MySection, BaseViewHolder> {


    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param layoutResId      The layout resource id of each item.
     * @param sectionHeadResId The section head layout id for each item
     * @param data             A new list is created out of this one to avoid mutable list
     */
    public RightAdapter(int layoutResId, int sectionHeadResId, List<MySection> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, MySection item) {
        helper.setText(R.id.tv, item.header);
    }

    @Override
    protected void convert(BaseViewHolder helper, MySection item) {
        helper.setText(R.id.tv, item.t.getName());
        RequestOptions option = RequestOptions.circleCropTransform();
        option.placeholder(R.drawable.sample_footer_loading);
        Glide.with(mContext).load(item.t.getPic_url()).apply(option)
                .into((ImageView) helper.itemView.findViewById(R.id.iv));
    }

}
