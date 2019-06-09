package c99_web.model;

import java.time.LocalDateTime;
import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Orders{
    
    private String odCode;          // key
    private String emCode;          // employees Code
    private String ctCode;          // customers Code
    private String odRemark;
    private LocalDateTime odts;     // order timestamp
    private Set<OrderItem> ois;     // order items

    public Orders() {
    }

    public Orders(String odCode, String emCode, String ctCode) {
        this.odCode = odCode;
        this.emCode = emCode;
        this.ctCode = ctCode;
    }
    
    public Orders(String odCode, String ctCode, String odRemark, LocalDateTime odts) {
        this.odCode = odCode;
        this.ctCode = ctCode;
        this.odRemark = odRemark;
        this.odts = odts;
    }

    public String getOdCode() {
        return odCode;
    }

    public void setOdCode(String odCode) {
        this.odCode = odCode;
    }

    public String getEmCode() {
        return emCode;
    }

    public void setEmCode(String emCode) {
        this.emCode = emCode;
    }

    public String getCtCode() {
        return ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode;
    }

    public String getOdRemark() {
        return odRemark;
    }

    public void setOdRemark(String odRemark) {
        this.odRemark = odRemark;
    }

    public LocalDateTime getOdts() {
        return odts;
    }

    public void setOdts(LocalDateTime odts) {
        this.odts = odts;
    }

    public Set<OrderItem> getOis() {
        return ois;
    }

    public void setOis(Set<OrderItem> ois) {
        this.ois = ois;
    }

    @Override
    public String toString() {
        return "Orders{" + "odCode=" + odCode + ", emCode=" + emCode + ", ctCode=" + ctCode + ", odRemark=" + odRemark + ", odts=" + odts + ", ois=" + ois + '}';
    }   
    
}
