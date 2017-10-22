package ff_wms_rf.feifanzhixing.com.refreshdemo.other;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import ff_wms_rf.feifanzhixing.com.refreshdemo.MyAdapter;
import ff_wms_rf.feifanzhixing.com.refreshdemo.R;
import ff_wms_rf.feifanzhixing.com.refreshdemo.ceshi.CK_HisListDateChildModel;
import ff_wms_rf.feifanzhixing.com.refreshdemo.ceshi.CK_HistoryListDateModel;
import ff_wms_rf.feifanzhixing.com.refreshdemo.ceshi.CK_History_expd_Item;
import ff_wms_rf.feifanzhixing.com.refreshdemo.jd.JdRefreshLayout;
import ff_wms_rf.feifanzhixing.com.refreshdemo.jd.MyExpdListview;

/**
 * Created by ChenKang on 2017/9/22.
 */
public class ClassicsActivity extends AppCompatActivity {
    /**
     * 列表
     */
    RecyclerView mRecyclerView;

    /**
     * 下拉刷新
     */
    JdRefreshLayout mLayout;

    /**
     * 布局管理器
     */
    RecyclerView.LayoutManager mManager;

    /**
     * 数据
     */
    private List<Object> mDatas;

    /**
     * 适配器
     */
    private MyAdapter mAdapter;

    private MyExpdListview expandList;
    private CK_History_expd_Item myAdapter_expd;
    private List<CK_HistoryListDateModel> listModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smar);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        mDatas=new ArrayList<>();
        for(int i=0;i<5;i++){
            mDatas.add(new Object());
        }

        expandList = (MyExpdListview) findViewById(R.id.expandlist);
        expandList.setGroupIndicator(null);
        setDate() ;
        setExpd();

//        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        mManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mManager);
//        mAdapter=new MyAdapter(mDatas);
//        mRecyclerView.setAdapter(mAdapter);
        RefreshLayout refreshLayout = (RefreshLayout)findViewById(R.id.refreshLayout);
        //设置 Header 为 Material风格   MaterialHeader
        //BezierRadarHeader  贝塞尔雷达
        //PhoenixHeader  金色校园
        //WaterDropHeader  苹果水滴
        //WaveSwipeHeader  全屏水波
        //ClassicsHeader   默认的
        //DropboxHeader   掉落盒子
        //DeliveryHeader  气球快递
        refreshLayout.setRefreshHeader(new ClassicsHeader(this));
//设置 Footer 为 球脉冲  BallPulseFooter
        refreshLayout.setRefreshFooter(new BallPulseFooter(this).setSpinnerStyle(SpinnerStyle.Scale));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
//                mDatas.add(new Object());
//                mAdapter.notifyDataSetChanged();
                refreshlayout.finishRefresh(2000);
            }
        });
        refreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadmore(2000);
            }
        });



//        mLayout = (JdRefreshLayout) findViewById(R.id.test_recycler_view_frame);
//        mRecyclerView = (RecyclerView) findViewById(R.id.test_recycler_view);
//        mManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mManager);
//        mAdapter=new MyAdapter(mDatas);
//        mRecyclerView.setAdapter(mAdapter);
//        mLayout.setPtrHandler(new PtrDefaultHandler() {
//            @Override
//            public void onRefreshBegin(PtrFrameLayout frame) {
//                doSth();
//            }
//        });
//        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//
//            }
//        });



    }

    /**
     * demo
     */
    private void doSth() {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }


            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                mDatas.add(new Object());
                mAdapter.notifyDataSetChanged();
                mLayout.refreshComplete();
            }
        }.execute();
    }

    private void setDate(){
        List<CK_HisListDateChildModel> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CK_HistoryListDateModel model = new CK_HistoryListDateModel();
            model.setCarcase_no("2222");
            CK_HisListDateChildModel model2 = new CK_HisListDateChildModel();
            model2.setAddress("6262626");
            list.add(model2);
            model.setItems(list);
            listModels.add(model);
        }
    }

    private void setExpd(){
        myAdapter_expd = new CK_History_expd_Item(this, listModels);
        expandList.setAdapter(myAdapter_expd);
//        GlobalVariable.setListViewHeightBasedOnChildren(expandList);
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//		expandList.setOnScrollListener(new AbsListView.OnScrollListener() {
//			@Override
//			public void onScrollStateChanged(AbsListView view, int scrollState) {
//				// 当不滚动时
//				if (scrollState == AbsListView.TRANSCRIPT_MODE_DISABLED) {
//					//获取最后一个完全显示的ItemPosition
//					int lastVisibleItem =expandList.getLastVisiblePosition();
//					int totalItemCount =expandList.getCount();
//					boolean isRefreshing = refresh.isRefreshing();
//					if (isRefreshing) {
//						return;
//					}
//					// 判断是否滚动到底部
//					if (lastVisibleItem == (totalItemCount - 1) && !isLoading) {
//						countRef = countRef + 1 ;
//						if (countRef == 2){//第二次才刷新
//							Log.e("==more==","more"+"");
//							isLoading = true;
//							//加载更多功能的代码
////                        if (StringUtils.isNeedLoadMore(mList.size(), GlobalConstant.DEFAULT_PAGES_NUMBERS)) {
//							dialogHelper.startProgressDialog();
//							dialogHelper.setDialogMessage("正在加载...");
//							mHandler.sendEmptyMessageDelayed(2, 500);
//							countRef = 0;
////                        }
//						}
//					}
//				}
//			}
//
//			@Override
//			public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//
//			}
//		});
//        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
//            @Override
//            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
//                return false;
//            }
//        });
//        expandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//                String carId = listModels.get(groupPosition).getItems().get(childPosition).getId();
//                Intent dingsun = new Intent(History_CKActivity.this, History_CK_DetailActivity.class);
//                dingsun.putExtra("CarId", carId);
//                startActivity(dingsun);
//                return false;
//            }
//        });
    }

}