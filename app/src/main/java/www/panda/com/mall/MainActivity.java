package www.panda.com.mall;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mob.shop.OperationCallback;
import com.mob.shop.ShopSDK;
import com.mob.shop.datatype.entity.Product;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import www.panda.com.mall.adapter.LeftAdapter;
import www.panda.com.mall.adapter.RightAdapter;

public class MainActivity extends AppCompatActivity implements BaseQuickAdapter.OnItemClickListener {

    @BindView(R.id.rv_left)
    RecyclerView mRvLeft;
    @BindView(R.id.rv_right)
    RecyclerView mRvRight;
    private LeftAdapter mLeftAdapter;
    private RightAdapter mRightAdapter;
    private ArrayList<String> mLeftData;
    private ArrayList<Product> mRightData;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initProgrossBar();

        initView();

        initData();

        initListener();

    }

    private void initProgrossBar() {
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCanceledOnTouchOutside(false);
        mProgressDialog.setMessage(getString(R.string.loading));
        mProgressDialog.show();
    }

    private void initView() {
        initLeft();

        initRight();
    }

    private void initLeft() {
        mLeftData = new ArrayList<>();
        mLeftData.add(getString(R.string.one));
        mLeftData.add(getString(R.string.two));
        mLeftData.add(getString(R.string.three));
        mLeftData.add(getString(R.string.four));
        mLeftData.add(getString(R.string.five));
        mLeftData.add(getString(R.string.six));
        mLeftData.add(getString(R.string.seven));
        mLeftData.add(getString(R.string.eight));
        mLeftData.add(getString(R.string.nine));
        mLeftData.add(getString(R.string.ten));
        mRvLeft.setLayoutManager(new LinearLayoutManager(this));
        mLeftAdapter = new LeftAdapter(R.layout.item_left, mLeftData);
        mRvLeft.setAdapter(mLeftAdapter);
    }

    private void initRight() {
        mRightData = new ArrayList<>();
        mRvRight.setLayoutManager(new LinearLayoutManager(this));
        mRightAdapter = new RightAdapter(mRightData);
        mRvRight.setAdapter(mRightAdapter);
    }

    private void initData() {
        List<Long> ids = new ArrayList<>();
        ids.add(206739455485300736L);
        ids.add(206864872975507456L);
        ShopSDK.getProducts(ids, null, null, null, new OperationCallback<List<Product>>() {

            @Override
            public void onSuccess(List<Product> products) {
                super.onSuccess(products);
                mProgressDialog.dismiss();
                mRightData.addAll(products);
                mRightAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailed(Throwable throwable) {
                super.onFailed(throwable);
                mProgressDialog.dismiss();
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initListener() {
        mLeftAdapter.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        mLeftAdapter.setPosition(position);
        mProgressDialog.show();
    }
}
