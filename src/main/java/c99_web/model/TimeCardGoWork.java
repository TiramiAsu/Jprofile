package c99_web.model;

import java.time.LocalDateTime;

/**
 *
 * @author TiramiAsu
 */
public class TimeCardGoWork {
    
    private int tcgID;              // key
    private String emCode;
    private LocalDateTime tcgTime;

    public TimeCardGoWork() {
    }

    public TimeCardGoWork(String emCode, LocalDateTime tcgTime) {
        this.emCode = emCode;
        this.tcgTime = tcgTime;
    }

    public int getTcgID() {
        return tcgID;
    }

    public void setTcgID(int tcgID) {
        this.tcgID = tcgID;
    }

    public String getEmCode() {
        return emCode;
    }

    public void setEmCode(String emCode) {
        this.emCode = emCode;
    }

    public LocalDateTime getTcgTime() {
        return tcgTime;
    }

    public void setTcgTime(LocalDateTime tcgTime) {
        this.tcgTime = tcgTime;
    }

    @Override
    public String toString() {
        return "TimeCardGoWork{" + "tcgID=" + tcgID + ", emCode=" + emCode + ", tcgTime=" + tcgTime + '}';
    }

}
