package c99_web.model;

import java.time.LocalDateTime;

/**
 *
 * @author TiramiAsu
 */
public class TimeCardGoWork {
    
    private Integer goId;
    private Long goTime;
    private String goRemark;
    private Employee employee;

    public TimeCardGoWork() {
    }

    public TimeCardGoWork(Long goTime, Employee employee) {
        this.goTime = goTime;
        this.employee = employee;
    }

    public TimeCardGoWork(Long goTime, String goRemark, Employee employee) {
        this.goTime = goTime;
        this.goRemark = goRemark;
        this.employee = employee;
    }

    public Integer getGoId() {
        return goId;
    }

    public void setGoId(Integer goId) {
        this.goId = goId;
    }

    public Long getGoTime() {
        return goTime;
    }

    public void setGoTime(Long goTime) {
        this.goTime = goTime;
    }

    public String getGoRemark() {
        return goRemark;
    }

    public void setGoRemark(String goRemark) {
        this.goRemark = goRemark;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "TimeCardGoWork{" + "goId=" + goId + ", goTime=" + goTime + ", goRemark=" + goRemark + ", employee=" + employee + '}';
    }

    

}
