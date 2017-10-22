package ff_wms_rf.feifanzhixing.com.refreshdemo.ceshi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.List;

import ff_wms_rf.feifanzhixing.com.refreshdemo.R;


/**
 * Created by ChenKang on 2017/6/17.
 */
public class CK_History_expd_Item extends BaseExpandableListAdapter {

    private String type;
    private String complete_type;
    private Context context;
    private List<CK_HistoryListDateModel> listModels;
    private LayoutInflater mInflater;
    boolean isShowTS = false ;
    public CK_History_expd_Item(Context context, List<CK_HistoryListDateModel> listModels){

        this.context = context;
        this.listModels = listModels;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getGroupCount() {
        return listModels.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
//        return listModels.get(groupPosition).getItems().size();
        if (null == listModels.get(groupPosition).getItems()) {
            //	Toast.makeText(mContext, "该报案号下无受损车辆", Toast.LENGTH_SHORT).show();
            return 0;
        } else {
            return listModels.get(groupPosition).getItems().size();
        }
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listModels.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listModels.get(groupPosition).getItems().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        GroupHolder groupHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.groupitem, null);
            groupHolder = new GroupHolder();
//            groupHolder.iv_enter = (ImageView) convertView.findViewById(R.id.iv_enter);
            groupHolder.groupText = (TextView) convertView.findViewById(R.id.tv_group_text);
//            groupHolder.tv_group_date = (TextView) convertView.findViewById(R.id.tv_group_date);
//            groupHolder.tv_dts = (TextView) convertView.findViewById(R.id.tv_dts);
            groupHolder.group_layout = (RelativeLayout) convertView.findViewById(R.id.group_layout);
            convertView.setTag(groupHolder);
        } else {
            groupHolder = (GroupHolder) convertView.getTag();
        }
//        if (listModels.get(groupPosition).isClickFirst()){
//            groupHolder.group_layout.setBackgroundColor(context.getResources().getColor(R.color.white));
//            if (isExpanded) {
//                groupHolder.iv_enter.setBackgroundResource(R.mipmap.up_y);
//            } else {
//                groupHolder.iv_enter.setBackgroundResource(R.mipmap.down_y);
//            }
//        }else {
//            groupHolder.group_layout.setBackgroundColor(context.getResources().getColor(R.color.line_gray));
//            if (isExpanded) {
//                groupHolder.iv_enter.setBackgroundResource(R.mipmap.up_n);
//                listModels.get(groupPosition).setClickFirst(true);
//                notifyDataSetChanged();
//            } else {
//                groupHolder.iv_enter.setBackgroundResource(R.mipmap.down_n);
//            }
//        }
        groupHolder.groupText.setText("报案号:" + listModels.get(groupPosition).getCarcase_no());
//        if (StringUtils.isNoEmpty(listModels.get(groupPosition).getArrived_at())){
//            groupHolder.tv_group_date.setText("出险时间:" + listModels.get(groupPosition).getArrived_at());
//        }
//
//        if (StringUtils.isNoEmpty(listModels.get(groupPosition).getIs_push())){
//            if ("0".equals(listModels.get(groupPosition).getIs_push())){
//                groupHolder.tv_dts.setVisibility(View.VISIBLE);
//            }else {
//                groupHolder.tv_dts.setVisibility(View.GONE);
//            }
//        }
        return convertView;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        ChildHolder childHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.childitem, null);
            childHolder = new ChildHolder();
            childHolder.childText = (TextView) convertView.findViewById(R.id.tv_child_text);
//            childHolder.tv_child_chexing = (TextView) convertView.findViewById(R.id.tv_child_chexing);
//            childHolder.tv_child_chepai = (TextView) convertView.findViewById(R.id.tv_child_chepai);
//            childHolder.tv_child_huishou = (TextView) convertView.findViewById(R.id.tv_child_huishou);
//            childHolder.tv_child_type = (TextView) convertView.findViewById(R.id.tv_child_type);
//            childHolder.sjx_bg_layout= (RelativeLayout) convertView.findViewById(R.id.sjx_bg_layout);
            convertView.setTag(childHolder);
        } else {
            childHolder = (ChildHolder) convertView.getTag();
        }
        childHolder.childText.setText(listModels.get(groupPosition).getItems().get(childPosition).getAddress());
//        String chetype=listModels.get(groupPosition).getItems().get(childPosition).getCar_attr();
//        if(chetype.equals("1")){
//            childHolder.sjx_bg_layout.setVisibility(View.VISIBLE);
//            childHolder.childText.setTextColor(context.getResources().getColor(R.color.text_color_red));
//        }else{
//            childHolder.sjx_bg_layout.setVisibility(View.GONE);
//            childHolder.childText.setTextColor(context.getResources().getColor(R.color.main));
//        }
//        childHolder.childText.setText(listModels.get(groupPosition).getItems().get(childPosition).getCar_attr_name());
//        childHolder.tv_child_chexing.setText(listModels.get(groupPosition).getItems().get(childPosition).getBrand() );
//        childHolder.tv_child_chepai.setText( listModels.get(groupPosition).getItems().get(childPosition).getLicense_no());
//        childHolder.tv_child_huishou.setText( listModels.get(groupPosition).getItems().get(childPosition).getReCount() );
////        childHolder.tv_child_daijian.setText("待检项:" + listModels.get(groupPosition).getItems().get(childPosition).getWtCount() + "项");
//        String status=listModels.get(groupPosition).getItems().get(childPosition).getStatus_no();
//        String is_push = listModels.get(groupPosition).getItems().get(childPosition).getIs_push();
//        if ("0".equals(is_push)){
//            childHolder.tv_child_type.setText("待推送");
//            childHolder.tv_child_type.setTextColor(context.getResources().getColor(R.color.text_color_red));
//        }else {
////            childHolder.tv_child_type.setTextColor(context.getResources().getColor(R.color.textcolor_grayyellow));
//            if(status.equals("1000")){
//                childHolder.tv_child_type.setText("查勘完成");
//            }else if(status.equals("2000")){
//                childHolder.tv_child_type.setText("待定损");
//            }else if(status.equals("3000")){
//                childHolder.tv_child_type.setText("待核损");
//            }else if(status.equals("4000")){
//                childHolder.tv_child_type.setText("待复勘");
//            }else if(status.equals("5000")){
//                childHolder.tv_child_type.setText("待复勘审核");
//            }else if(status.equals("6000")){
//                childHolder.tv_child_type.setText("待回收");
//            }else if(status.equals("6500")){
//                childHolder.tv_child_type.setText("待回收审核");
//            }else if(status.equals("7000")){
//                childHolder.tv_child_type.setText("已完成");
//            }
//        }


        return convertView;
    }


    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


    public class ViewHold {
        //组
        public TextView yw_name_tv,yw_nub_tv,yw_dc_tv;
        public ImageView yw_imageGroup_iv;
        private RelativeLayout groupLayout ;

        //子
        public TextView qckc_tv , brqc_tv , ljqc_tv , brjc_tv;
    }
    private class GroupHolder {
        RelativeLayout group_layout ;
        ImageView iv_enter;
        TextView groupText, tv_group_date , tv_dts;
    }

    private class ChildHolder {
        public RelativeLayout sjx_bg_layout ;
        TextView childText, tv_child_chexing,tv_child_chepai, tv_child_huishou, tv_child_type ,tv_child_daijian;
    }

}