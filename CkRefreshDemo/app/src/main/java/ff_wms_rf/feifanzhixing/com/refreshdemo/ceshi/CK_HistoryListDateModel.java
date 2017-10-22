package ff_wms_rf.feifanzhixing.com.refreshdemo.ceshi;


import java.io.Serializable;
import java.util.List;

/**
 * Created by ChenKang on 2017/6/17.
 */
public class CK_HistoryListDateModel implements Serializable {


    /**
     * id : 242
     * arrived_at : 2017-06-17
     * carcase_no : 28288282
     * items : [{"id":206,"car_attr":1,"car_attr_name":"标的车","license_no":"赣I63856","brand":"疼脱裤","status_no":"4000","reCount":0,"wtCount":0}]
     */

    private boolean isClickFirst ; //是否点击过一次

    private String id;
    private String arrived_at;
    private String carcase_no;
    private List<CK_HisListDateChildModel> items;
    private String is_push;

    public String getIs_push() {
        return is_push;
    }

    public void setIs_push(String is_push) {
        this.is_push = is_push;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArrived_at() {
        return arrived_at;
    }

    public void setArrived_at(String arrived_at) {
        this.arrived_at = arrived_at;
    }

    public String getCarcase_no() {
        return carcase_no;
    }

    public void setCarcase_no(String carcase_no) {
        this.carcase_no = carcase_no;
    }

    public List<CK_HisListDateChildModel> getItems() {
        return items;
    }

    public void setItems(List<CK_HisListDateChildModel> items) {
        this.items = items;
    }

    public boolean isClickFirst() {
        return isClickFirst;
    }

    public void setClickFirst(boolean clickFirst) {
        isClickFirst = clickFirst;
    }
}
