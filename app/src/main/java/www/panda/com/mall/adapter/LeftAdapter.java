package www.panda.com.mall.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;

import www.panda.com.mall.R;

public class LeftAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    private int selectPosition = 0;

    public LeftAdapter(int layoutResId, @Nullable ArrayList<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        if (selectPosition == helper.getLayoutPosition()){
            helper.setTextColor(R.id.tv,mContext.getResources().getColor(R.color.black));
        }else {
            helper.setTextColor(R.id.tv,mContext.getResources().getColor(R.color.gray));
        }
        helper.setText(R.id.tv, item);
    }

    public void setPosition(int position) {
        selectPosition = position;
        notifyDataSetChanged();
    }
}
