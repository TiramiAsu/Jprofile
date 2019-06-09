package c99_web.model;

/**
 *
 * @author TiramiAsu
 */
public class Category {
    
    private String cgCode;      // key
    private String cgName;
    private String cgRemark;
    
    public Category() {
    }

    public Category(String cgCode, String cgName) {
        this.cgCode = cgCode;
        this.cgName = cgName;
    }

    public Category(String cgCode, String cgName, String cgRemark) {
        this.cgCode = cgCode;
        this.cgName = cgName;
        this.cgRemark = cgRemark;
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

    public String getCgRemark() {
        return cgRemark;
    }

    public void setCgRemark(String cgRemark) {
        this.cgRemark = cgRemark;
    }

    @Override
    public String toString() {
        return "Category{" + "cgCode=" + cgCode + ", cgName=" + cgName + ", cgRemark=" + cgRemark + '}';
    }
    
}
