package c99_web.model;

import java.time.LocalDateTime;

/**
 *
 * @author TiramiAsu
 */
public class TimeCardGoWork {
    
    private int tcgID;
    private LocalDateTime tcGoWork;

    public TimeCardGoWork() {
    }

    public TimeCardGoWork(LocalDateTime tcGoWork) {
        this.tcGoWork = tcGoWork;
    }

    public LocalDateTime getTcGoWork() {
        return tcGoWork;
    }

    public int getTcgID() {
        return tcgID;
    }

    public void setTcgID(int tcgID) {
        this.tcgID = tcgID;
    }

    public void setTcGoWork(LocalDateTime tcGoWork) {
        this.tcGoWork = tcGoWork;
    }

    @Override
    public String toString() {
        return "TimeCardGoWork{" + "tcgID=" + tcgID + ", tcGoWork=" + tcGoWork + '}';
    }

}
