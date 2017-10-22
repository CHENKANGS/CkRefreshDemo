package ff_wms_rf.feifanzhixing.com.refreshdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ff_wms_rf.feifanzhixing.com.refreshdemo.R;
import ff_wms_rf.feifanzhixing.com.refreshdemo.jd.JdActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.BezierRadarActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.ClassicsActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.DeliveryActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.MaterialActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.PhoenixActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.SmarActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.WaterDropActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.other.WaveSwipeActivity;
import ff_wms_rf.feifanzhixing.com.refreshdemo.tmall.TmallActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        findViewById(R.id.btn_jd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(JdActivity.class);
            }
        });
        findViewById(R.id.btn_tmall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(TmallActivity.class);
            }
        });
        findViewById(R.id.btn_Classics).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(ClassicsActivity.class);
            }
        });
        findViewById(R.id.btn_Material).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(MaterialActivity.class);
            }
        });
        findViewById(R.id.btn_BezierRadar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(BezierRadarActivity.class);
            }
        });
        findViewById(R.id.btn_Phoenix).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(PhoenixActivity.class);
            }
        });
        findViewById(R.id.btn_WaterDrop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(WaterDropActivity.class);
            }
        });
        findViewById(R.id.btn_WaveSwipe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(WaveSwipeActivity.class);
            }
        });
        findViewById(R.id.btn_Dropbox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(SmarActivity.class);
            }
        });
        findViewById(R.id.btn_Delivery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(DeliveryActivity.class);
            }
        });
    }

    /**
     * 跳转
     *
     * @param cl
     */
    public void toActivity(Class cl) {
        Intent intent = new Intent(this, cl);
        startActivity(intent);
    }

}
