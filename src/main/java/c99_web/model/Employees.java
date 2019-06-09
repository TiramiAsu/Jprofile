package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Employees{

    private String emCode;                  // key
    private String emName;
    private String emPhone;
    private String emPosition;
    private String emRemark;    
    private Set<TimeCardGoWork> tcgTimes;
    private Set<TimeCardOffWork> tcoTimes;
    private Set<Orders> orders;

    public Employees() {
    }

    public Employees(String emCode, String emName, String emPhone, String emPosition) {
        this.emCode = emCode;
        this.emName = emName;
        this.emPhone = emPhone;
        this.emPosition = emPosition;
    }

    public Employees(String emCode, String emName, String emPhone, String emPosition, String emRemark) {
        this.emCode = emCode;
        this.emName = emName;
        this.emPhone = emPhone;
        this.emPosition = emPosition;
        this.emRemark = emRemark;
    }

    public String getEmCode() {
        return emCode;
    }

    public void setEmCode(String emCode) {
        this.emCode = emCode;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public String getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(String emPhone) {
        this.emPhone = emPhone;
    }

    public String getEmPosition() {
        return emPosition;
    }

    public void setEmPosition(String emPosition) {
        this.emPosition = emPosition;
    }

    public String getEmRemark() {
        return emRemark;
    }

    public void setEmRemark(String emRemark) {
        this.emRemark = emRemark;
    }

    public Set<TimeCardGoWork> getTcgTimes() {
        return tcgTimes;
    }

    public void setTcgTimes(Set<TimeCardGoWork> tcgTimes) {
        this.tcgTimes = tcgTimes;
    }

    public Set<TimeCardOffWork> getTcoTimes() {
        return tcoTimes;
    }

    public void setTcoTimes(Set<TimeCardOffWork> tcoTimes) {
        this.tcoTimes = tcoTimes;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
    
    @Override
    public String toString() {
        return "Employees{" + "emCode=" + emCode + ", emName=" + emName + ", emPhone=" + emPhone + ", emPosition=" + emPosition + ", emRemark=" + emRemark + ", tcgTimes=" + tcgTimes + ", tcoTimes=" + tcoTimes + '}';
    }
    
}
