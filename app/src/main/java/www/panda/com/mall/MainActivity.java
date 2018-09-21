package www.panda.com.mall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

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

    }

    private void initListener() {

    }
}
