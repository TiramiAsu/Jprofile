package c99_web.model;

/**
 *
 * @author TiramiAsu
 */
public class OrderItem {

    private int oiID;           // key
    private String odCode;      // order Code
    private String pdCode;      // products Code
    private int oiQuantity;
    private String oiUnit;
    private Integer oiPrice;
    private String oiRemark;

    public OrderItem() {
    }

    public OrderItem(String odCode, String pdCode, int oiQuantity, String oiUnit, Integer oiPrice) {
        this.odCode = odCode;
        this.pdCode = pdCode;
        this.oiQuantity = oiQuantity;
        this.oiUnit = oiUnit;
        this.oiPrice = oiPrice;
    }

    public OrderItem(String odCode, String pdCode, int oiQuantity, String oiUnit, Integer oiPrice, String oiRemark) {
        this.odCode = odCode;
        this.pdCode = pdCode;
        this.oiQuantity = oiQuantity;
        this.oiUnit = oiUnit;
        this.oiPrice = oiPrice;
        this.oiRemark = oiRemark;
    }

    public int getOiID() {
        return oiID;
    }

    public void setOiID(int oiID) {
        this.oiID = oiID;
    }

    public String getOdCode() {
        return odCode;
    }

    public void setOdCode(String odCode) {
        this.odCode = odCode;
    }

    public String getPdCode() {
        return pdCode;
    }

    public void setPdCode(String pdCode) {
        this.pdCode = pdCode;
    }

    public int getOiQuantity() {
        return oiQuantity;
    }

    public void setOiQuantity(int oiQuantity) {
        this.oiQuantity = oiQuantity;
    }

    public String getOiUnit() {
        return oiUnit;
    }

    public void setOiUnit(String oiUnit) {
        this.oiUnit = oiUnit;
    }

    public Integer getOiPrice() {
        return oiPrice;
    }

    public void setOiPrice(Integer oiPrice) {
        this.oiPrice = oiPrice;
    }

    public String getOiRemark() {
        return oiRemark;
    }

    public void setOiRemark(String oiRemark) {
        this.oiRemark = oiRemark;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "oiID=" + oiID + ", odCode=" + odCode + ", pdCode=" + pdCode + ", oiQuantity=" + oiQuantity + ", oiUnit=" + oiUnit + ", oiPrice=" + oiPrice + ", oiRemark=" + oiRemark + '}';
    }
    
}
