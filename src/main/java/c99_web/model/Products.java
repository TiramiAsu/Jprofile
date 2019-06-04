package c99_web.model;

/**
 *
 * @author TiramiAsu
 */
public class Products extends Category{
	
        private int        pdID;        // using for SQL
	private String     pdCode;
	private String     pdName;
	private Integer pdPrice;    // BigDecimal
	private Integer pdCost;     // BigDecimal
	private String     pdUnit;
	private String     pdStatus;
	private String     pdRemark;
	
    public Products() {
    }

    public Products(String pdCode, String pdName, Integer pdPrice, 
            Integer pdCost, String pdUnit, String pdStatus) {
        this.pdCode = pdCode;
        this.pdName = pdName;
        this.pdPrice = pdPrice;
        this.pdCost = pdCost;
        this.pdUnit = pdUnit;
        this.pdStatus = pdStatus;
    }

    public Products(String pdCode, String pdName, Integer pdPrice,
            Integer pdCost, String pdUnit, String pdStatus, String pdRemark) {
        this.pdCode = pdCode;
        this.pdName = pdName;
        this.pdPrice = pdPrice;
        this.pdCost = pdCost;
        this.pdUnit = pdUnit;
        this.pdStatus = pdStatus;
        this.pdRemark = pdRemark;
    }

    public int getPdID() {
        return pdID;
    }

    public void setPdID(int pdID) {
        this.pdID = pdID;
    }

    public String getPdCode() {
        return pdCode;
    }

    public void setPdCode(String pdCode) {
        this.pdCode = pdCode;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public int getPdPrice() {
        return pdPrice;
    }

    public void setPdPrice(Integer pdPrice) {
        this.pdPrice = pdPrice;
    }

    public int getPdCost() {
        return pdCost;
    }

    public void setPdCost(Integer pdCost) {
        this.pdCost = pdCost;
    }

    public String getPdUnit() {
        return pdUnit;
    }

    public void setPdUnit(String pdUnit) {
        this.pdUnit = pdUnit;
    }

    public String getPdStatus() {
        return pdStatus;
    }

    public void setPdStatus(String pdStatus) {
        this.pdStatus = pdStatus;
    }

    public String getPdRemark() {
        return pdRemark;
    }

    public void setPdRemark(String pdRemark) {
        this.pdRemark = pdRemark;
    }

    @Override
    public String toString() {
        return "Products{" + "pdCode=" + pdCode + ", pdName=" + pdName + ", pdPrice=" + pdPrice + ", pdCost=" + pdCost + ", pdUnit=" + pdUnit + ", pdStatus=" + pdStatus + ", pdRemark=" + pdRemark + '}';
    }
	
}
