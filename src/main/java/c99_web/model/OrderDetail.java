package c99_web.model;

/**
 *
 * @author TiramiAsu
 */
public class OrderDetail {

    private int odtID;          // using for SQL
    private String odtCode;
    private String pdCode;      // products Code
    private String odtPrice;
    private String odtUnit;
    private String odtQuantity;
    private String odtRemark;

    public OrderDetail() {
    }

    public OrderDetail(String odtCode, String pdCode, String odtPrice, String odtUnit, String odtQuantity) {
        this.odtCode = odtCode;
        this.pdCode = pdCode;
        this.odtPrice = odtPrice;
        this.odtUnit = odtUnit;
        this.odtQuantity = odtQuantity;
    }

    public OrderDetail(String odtCode, String pdCode, String odtPrice, String odtUnit, String odtQuantity, String odtRemark) {
        this.odtCode = odtCode;
        this.pdCode = pdCode;
        this.odtPrice = odtPrice;
        this.odtUnit = odtUnit;
        this.odtQuantity = odtQuantity;
        this.odtRemark = odtRemark;
    }

    public int getOdtID() {
        return odtID;
    }

    public void setOdtID(int odtID) {
        this.odtID = odtID;
    }

    public String getOdtCode() {
        return odtCode;
    }

    public void setOdtCode(String odtCode) {
        this.odtCode = odtCode;
    }

    public String getPdCode() {
        return pdCode;
    }

    public void setPdCode(String pdCode) {
        this.pdCode = pdCode;
    }

    public String getOdtPrice() {
        return odtPrice;
    }

    public void setOdtPrice(String odtPrice) {
        this.odtPrice = odtPrice;
    }

    public String getOdtUnit() {
        return odtUnit;
    }

    public void setOdtUnit(String odtUnit) {
        this.odtUnit = odtUnit;
    }

    public String getOdtQuantity() {
        return odtQuantity;
    }

    public void setOdtQuantity(String odtQuantity) {
        this.odtQuantity = odtQuantity;
    }

    public String getOdtRemark() {
        return odtRemark;
    }

    public void setOdtRemark(String odtRemark) {
        this.odtRemark = odtRemark;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "odtID=" + odtID + ", odtCode=" + odtCode + ", pdCode=" + pdCode + ", odtPrice=" + odtPrice + ", odtUnit=" + odtUnit + ", odtQuantity=" + odtQuantity + ", odtRemark=" + odtRemark + '}';
    }
    
}
