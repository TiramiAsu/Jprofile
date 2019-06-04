package c99_web.model;

import java.time.LocalDateTime;

/**
 *
 * @author TiramiAsu
 */
public class TimeCardOffWork {
    
    private int tcoID;
    private LocalDateTime tcOffWork;

    public TimeCardOffWork() {
    }

    public TimeCardOffWork(LocalDateTime tcOffWork) {
        this.tcOffWork = tcOffWork;
    }

    public int getTcoID() {
        return tcoID;
    }

    public void setTcoID(int tcoID) {
        this.tcoID = tcoID;
    }
    
    public LocalDateTime getTcOffWork() {
        return tcOffWork;
    }

    public void setTcOffWork(LocalDateTime tcOffWork) {
        this.tcOffWork = tcOffWork;
    }

    @Override
    public String toString() {
        return "TimeCardOffWork{" + "tcoID=" + tcoID + ", tcOffWork=" + tcOffWork + '}';
    }
    
}
