package c99_web.model;

import java.time.LocalDateTime;

/**
 *
 * @author TiramiAsu
 */
public class TimeCardOffWork {
    
    private int tcoID;              // key
    private String emCode;
    private LocalDateTime tcoTime;

    public TimeCardOffWork() {
    }

    public TimeCardOffWork(String emCode, LocalDateTime tcoTime) {
        this.emCode = emCode;
        this.tcoTime = tcoTime;
    }

    public int getTcoID() {
        return tcoID;
    }

    public void setTcoID(int tcoID) {
        this.tcoID = tcoID;
    }

    public String getEmCode() {
        return emCode;
    }

    public void setEmCode(String emCode) {
        this.emCode = emCode;
    }

    public LocalDateTime getTcoTime() {
        return tcoTime;
    }

    public void setTcoTime(LocalDateTime tcoTime) {
        this.tcoTime = tcoTime;
    }

    @Override
    public String toString() {
        return "TimeCardOffWork{" + "tcoID=" + tcoID + ", emCode=" + emCode + ", tcoTime=" + tcoTime + '}';
    }
    
}
