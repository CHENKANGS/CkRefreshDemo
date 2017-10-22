package ff_wms_rf.feifanzhixing.com.refreshdemo.ceshi;


import java.io.Serializable;

/**
 * Created by ChenKang on 2017/6/17.
 */
public class CK_HisListDateChildModel implements Serializable {


    /**
     * id : 167
     * car_attr : 1
     * car_attr_name : 标的车
     * license_no : 川AA780D
     * brand : 北京现代牌BH7164MX
     * status_no : 2000
     * reCount : 1
     * wtCount : 1
     */

    private String id;
    private String car_attr;
    private String car_attr_name;
    private String license_no;
    private String brand;
    private String status_no;
    private String reCount;
    private String wtCount;
    /**
     * id : 204
     * car_attr : 1
     * address : 湖北省,武汉市,江夏区,汤逊湖北路,28号
     * count : 1
     * icount : 0
     */

    private String address;
    private String count;
    private String icount;
    /**
     * id : 165
     * car_attr : 1
     * reCount : 0
     * wtCount : 0
     * scaner_id : 5
     * scaner_name : 柳山
     * scaner_phone : 13600001234
     */

    private String scaner_id;
    private String scaner_name;
    private String scaner_phone;
    /**
     * id : 23
     * car_attr : 1
     * reCount : 1
     * wtCount : 1
     * scaner_id : 28
     * check_losser_id : 0
     * check_losser_name :
     * is_push : 0
     */

    private String check_losser_id;
    private String check_losser_name;
    private String is_push;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCar_attr() {
        return car_attr;
    }

    public void setCar_attr(String car_attr) {
        this.car_attr = car_attr;
    }

    public String getCar_attr_name() {
        return car_attr_name;
    }

    public void setCar_attr_name(String car_attr_name) {
        this.car_attr_name = car_attr_name;
    }

    public String getLicense_no() {
        return license_no;
    }

    public void setLicense_no(String license_no) {
        this.license_no = license_no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStatus_no() {
        return status_no;
    }

    public void setStatus_no(String status_no) {
        this.status_no = status_no;
    }

    public String getReCount() {
        return reCount;
    }

    public void setReCount(String reCount) {
        this.reCount = reCount;
    }

    public String getWtCount() {
        return wtCount;
    }

    public void setWtCount(String wtCount) {
        this.wtCount = wtCount;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getIcount() {
        return icount;
    }

    public void setIcount(String icount) {
        this.icount = icount;
    }

    public String getScaner_id() {
        return scaner_id;
    }

    public void setScaner_id(String scaner_id) {
        this.scaner_id = scaner_id;
    }

    public String getScaner_name() {
        return scaner_name;
    }

    public void setScaner_name(String scaner_name) {
        this.scaner_name = scaner_name;
    }

    public String getScaner_phone() {
        return scaner_phone;
    }

    public void setScaner_phone(String scaner_phone) {
        this.scaner_phone = scaner_phone;
    }

    public String getCheck_losser_id() {
        return check_losser_id;
    }

    public void setCheck_losser_id(String check_losser_id) {
        this.check_losser_id = check_losser_id;
    }

    public String getIs_push() {
        return is_push;
    }

    public void setIs_push(String is_push) {
        this.is_push = is_push;
    }

    public String getCheck_losser_name() {
        return check_losser_name;
    }

    public void setCheck_losser_name(String check_losser_name) {
        this.check_losser_name = check_losser_name;
    }
}
