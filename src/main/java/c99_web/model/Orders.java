package c99_web.model;

import java.time.LocalDateTime;
import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Orders{
    
    private int odID;               // using for SQL
    private String odCode;          // orders Code
    private String emCode;          // employees Code
    private String ctCode;          // customers Code
    private LocalDateTime odTS;     // order timestamp
    private String odRemark;
    private Set<OrderDetail> orderdetails;

    public Orders() {
    }

    public Orders(String odCode, String emCode, String ctCode, LocalDateTime odTS,
            Set<OrderDetail> orderdetails) {
        this.odCode = odCode;
        this.emCode = emCode;
        this.ctCode = ctCode;
        this.odTS = odTS;
        this.orderdetails = orderdetails;
    }

    public Orders(String odCode, String emCode, String ctCode, LocalDateTime odTS,
            String odRemark, Set<OrderDetail> orderdetails) {
        this.odCode = odCode;
        this.emCode = emCode;
        this.ctCode = ctCode;
        this.odTS = odTS;
        this.odRemark = odRemark;
        this.orderdetails = orderdetails;
    }

    public int getOdID() {
        return odID;
    }

    public void setOdID(int odID) {
        this.odID = odID;
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

    public LocalDateTime getOdTS() {
        return odTS;
    }

    public void setOdTS(LocalDateTime odTS) {
        this.odTS = odTS;
    }

    public String getOdRemark() {
        return odRemark;
    }

    public void setOdRemark(String odRemark) {
        this.odRemark = odRemark;
    }

    public Set<OrderDetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(Set<OrderDetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    @Override
    public String toString() {
        return "Orders{" + "odID=" + odID + ", odCode=" + odCode + ", emCode=" + emCode + ", ctCode=" + ctCode + ", odTS=" + odTS + ", odRemark=" + odRemark + ", orderdetails=" + orderdetails + '}';
    }

}
