package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Employees{

    private int emID;                   // using for SQL
    private String emCode;
    private String emName;
    private String emPhone;
    private String emPosition;
    private String emRemark;    
    private Set<TimeCardGoWork> emtcGo;
    private Set<TimeCardOffWork> emtcOff;    

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

    public int getEmID() {
        return emID;
    }

    public void setEmID(int emID) {
        this.emID = emID;
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

    public Set<TimeCardGoWork> getEmtcGo() {
        return emtcGo;
    }

    public void setEmtcGo(Set<TimeCardGoWork> emtcGo) {
        this.emtcGo = emtcGo;
    }

    public Set<TimeCardOffWork> getEmtcOff() {
        return emtcOff;
    }

    public void setEmtcOff(Set<TimeCardOffWork> emtcOff) {
        this.emtcOff = emtcOff;
    }

    @Override
    public String toString() {
        return "Employees{" + "emID=" + emID + ", emCode=" + emCode + ", emName=" + emName + ", emPhone=" + emPhone + ", emPosition=" + emPosition + ", emRemark=" + emRemark + ", emtcGo=" + emtcGo + ", emtcOff=" + emtcOff + '}';
    }
    
}
