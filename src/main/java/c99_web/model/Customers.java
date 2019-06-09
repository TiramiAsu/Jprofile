package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Customers{
	
    private String ctCode;      // key
    private String ctName;
    private String ctPhone;
    private int ctPoint;
    private String ctRemark;
    private Set<Orders> orders;

    public Customers() {
    }

    public Customers(String ctCode, String ctName, String ctPhone, int ctPoint) {
        this.ctCode = ctCode;
        this.ctName = ctName;
        this.ctPhone = ctPhone;
        this.ctPoint = ctPoint;
    }

    public Customers(String ctCode, String ctName, String ctPhone, int ctPoint, String ctRemark) {
        this.ctCode = ctCode;
        this.ctName = ctName;
        this.ctPhone = ctPhone;
        this.ctPoint = ctPoint;
        this.ctRemark = ctRemark;
    }

    public String getCtCode() {
        return ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode;
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName;
    }

    public String getCtPhone() {
        return ctPhone;
    }

    public void setCtPhone(String ctPhone) {
        this.ctPhone = ctPhone;
    }

    public int getCtPoint() {
        return ctPoint;
    }

    public void setCtPoint(int ctPoint) {
        this.ctPoint = ctPoint;
    }

    public String getCtRemark() {
        return ctRemark;
    }

    public void setCtRemark(String ctRemark) {
        this.ctRemark = ctRemark;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customers{" + "ctCode=" + ctCode + ", ctName=" + ctName + ", ctPhone=" + ctPhone + ", ctPoint=" + ctPoint + ", ctRemark=" + ctRemark + ", orders=" + orders + '}';
    }

}
