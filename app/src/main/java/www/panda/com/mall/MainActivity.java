package www.panda.com.mall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.mob.shop.OperationCallback;
import com.mob.shop.ShopSDK;
import com.mob.shop.datatype.entity.Product;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import www.panda.com.mall.adapter.LeftAdapter;
import www.panda.com.mall.adapter.RightAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_left)
    RecyclerView mRvLeft;
    @BindView(R.id.rv_right)
    RecyclerView mRvRight;
    private LeftAdapter mLeftAdapter;
    private RightAdapter mRightAdapter;
    private ArrayList<String> mLeftData;
    private ArrayList<String> mRightData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();

        initData();

        initListener();

    }

    private void initView() {
        initLeft();

        initRight();
    }

    private void initLeft() {
        mLeftData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mLeftData.add("第" + i + "个品牌");
        }
        mRvLeft.setLayoutManager(new LinearLayoutManager(this));
        mLeftAdapter = new LeftAdapter(R.layout.item_left, mLeftData);
        mRvLeft.setAdapter(mLeftAdapter);
    }

    private void initRight() {
        mRightData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mRightData.add("某品牌下的第" + i + "个商品");
        }
        mRvRight.setLayoutManager(new LinearLayoutManager(this));
        mRightAdapter = new RightAdapter(R.layout.item_right, mRightData);
        mRvRight.setAdapter(mRightAdapter);
    }

    private void initData() {
        List<Long> ids = new ArrayList<>();
        ids.add(206739455485300736L);
        ids.add(206864872975507456L);
        ShopSDK.getProducts(ids ,null,null,null, new OperationCallback<List<Product>>() {

            @Override
            public void onSuccess(List<Product> products) {
                super.onSuccess(products);
                Toast.makeText(MainActivity.this, products.get(0).getProductName() + "", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailed(Throwable throwable) {
                super.onFailed(throwable);
                Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initListener() {

    }
}
