package c99_web.model;

/**
 *
 * @author TiramiAsu
 */
public class Category {
    
    private int cgID;           // using for SQL
    private String cgCode;
    private String cgName;
    private String cgVendor;	// 廠商
    private String cgRemark;
    
    public Category() {
    }

    public Category(String cgCode, String cgName, String cgVendor) {
        this.cgCode = cgCode;
        this.cgName = cgName;
        this.cgVendor = cgVendor;
    }

    public Category(String cgCode, String cgName, String cgVendor, String cgRemark) {
        this.cgCode = cgCode;
        this.cgName = cgName;
        this.cgVendor = cgVendor;
        this.cgRemark = cgRemark;
    }

    public int getCgID() {
        return cgID;
    }

    public void setCgID(int cgID) {
        this.cgID = cgID;
    }

    public String getCgCode() {
        return cgCode;
    }

    public void setCgCode(String cgCode) {
        this.cgCode = cgCode;
    }

    public String getCgName() {
        return cgName;
    }

    public void setCgName(String cgName) {
        this.cgName = cgName;
    }

    public String getCgVendor() {
        return cgVendor;
    }

    public void setCgVendor(String cgVendor) {
        this.cgVendor = cgVendor;
    }

    public String getCgRemark() {
        return cgRemark;
    }

    public void setCgRemark(String cgRemark) {
        this.cgRemark = cgRemark;
    }

    @Override
    public String toString() {
        return "Category{" + "cgID=" + cgID + ", cgCode=" + cgCode + ", cgName=" + cgName + ", cgVendor=" + cgVendor + ", cgRemark=" + cgRemark + '}';
    }
    
}
