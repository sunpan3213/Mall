package www.panda.com.mall;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import www.panda.com.mall.adapter.HeaderAdapter;
import www.panda.com.mall.adapter.LeftAdapter;
import www.panda.com.mall.adapter.RightAdapter;
import www.panda.com.mall.entity.MyProduct;
import www.panda.com.mall.entity.MySection;
import www.panda.com.mall.model.DataDemoUtils;
import www.panda.com.mall.utils.RecyclerViewUtils;
import www.panda.com.mall.view.SideView;

public class MainActivity extends AppCompatActivity implements BaseQuickAdapter.OnItemClickListener, SideView.OnTouchingLetterChangedListener {

    @BindView(R.id.rv_left)
    RecyclerView mRvLeft;
    @BindView(R.id.rv_right)
    RecyclerView mRvRight;
    @BindView(R.id.tv)
    TextView mTv;
    @BindView(R.id.sideview)
    SideView mSideview;
    private LeftAdapter mLeftAdapter;
    private RightAdapter mRightAdapter;
    private ArrayList<String> mLeftData;
    private ArrayList<MySection> mRightData;
    private ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initProgrossBar();

        initView();

        initData(0);

        initListener();

    }

    private void initProgrossBar() {
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCanceledOnTouchOutside(false);
        mProgressDialog.setMessage(getString(R.string.loading));
        mProgressDialog.show();
    }

    private void initView() {
        mSideview.setTextView(mTv);

        initLeft();

        initRight(0);
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

    private void initRight(int position) {
        if (mRightData == null) {
            mRightData = new ArrayList<>();
        }
        mRightData.clear();
        if (position == 0) {
            mSideview.setVisibility(View.VISIBLE);
            mRvRight.setLayoutManager(new LinearLayoutManager(this));
            mRightAdapter = new RightAdapter(R.layout.item_right, R.layout.item_section_f, mRightData);
            mRightAdapter.addHeaderView(getHeadView());
        } else {
            mSideview.setVisibility(View.GONE);
            mRvRight.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false));
            mRightAdapter = new RightAdapter(R.layout.item_other, R.layout.item_section, mRightData);
        }
        mRightAdapter.setEmptyView(R.layout.empty, mRvRight);
        mRvRight.setAdapter(mRightAdapter);
    }

    private View getHeadView() {
        ArrayList<MyProduct> list = new ArrayList<>();
        list.add(new MyProduct("Dress", R.drawable.one));
        list.add(new MyProduct("Topa", R.drawable.seven));
        list.add(new MyProduct("T-Shirt", R.drawable.six));
        list.add(new MyProduct("Jeans", R.drawable.nine));
        list.add(new MyProduct("Shirt", R.drawable.eight));
        list.add(new MyProduct("TARA", R.drawable.two));
        list.add(new MyProduct("H&M", R.drawable.ten));
        list.add(new MyProduct("Dress", R.drawable.five));
        list.add(new MyProduct("Dress", R.drawable.seven));
        list.add(new MyProduct("Dress", R.drawable.three));
        list.add(new MyProduct("Dress", R.drawable.four));
        View view = LayoutInflater.from(this).inflate(R.layout.header, mRvRight, false);
        RecyclerView rv = view.findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false));
        HeaderAdapter adapter = new HeaderAdapter(R.layout.item_header, list);
        rv.setAdapter(adapter);
        return view;
    }

    private void initData(int position) {
        time();//模拟网络请求
        switch (position) {
            case 0:
                DataDemoUtils.Singleton.getData(mRightData);
                break;
            case 1:
                DataDemoUtils.Singleton.getData1(mRightData);
                break;
            case 2:
                break;
            case 3:
                DataDemoUtils.Singleton.getData0(mRightData);
                break;
            case 4:
                DataDemoUtils.Singleton.getData1(mRightData);
                break;
            case 5:
                break;
            case 6:
                DataDemoUtils.Singleton.getData0(mRightData);
                break;
            case 7:
                DataDemoUtils.Singleton.getData1(mRightData);
                break;
            case 8:
                break;
            case 9:
                DataDemoUtils.Singleton.getData0(mRightData);
                break;
        }
        mRightAdapter.notifyDataSetChanged();
    }

    private void time() {
        CountDownTimer timer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                mProgressDialog.dismiss();
            }
        };
        timer.start();
    }

    private void initListener() {
        mLeftAdapter.setOnItemClickListener(this);
        mSideview.setOnTouchingLetterChangedListener(this);
        mRvRight.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                switch (newState) {
                    case RecyclerView.SCROLL_STATE_IDLE:
                        Glide.with(MainActivity.this).resumeRequests();
                        break;
                    case RecyclerView.SCROLL_STATE_DRAGGING:
                    case RecyclerView.SCROLL_STATE_SETTLING:
                        Glide.with(MainActivity.this).pauseRequests();
                        break;
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

            }
        });
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        mLeftAdapter.setPosition(position);
        mProgressDialog.show();
        initRight(position);
        initData(position);
    }

    @Override
    public void onTouchingLetterChanged(String s) {
        for (int i = 0; i < mRightData.size(); i++) {
            if (s.equals(mRightData.get(i).header)) {
                RecyclerViewUtils.Singleton.smoothMoveToPosition(mRvRight, i + 1);
            } else if (s.equals("#")){
                RecyclerViewUtils.Singleton.smoothMoveToPosition(mRvRight, 0);
            }
        }
    }

}
