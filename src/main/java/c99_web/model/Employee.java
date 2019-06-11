package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Employee{

    private Integer employeeId;
    private String employeeName;
    private String employeePhone;
    private String employeePosition;
    private String employeeRemark;
    private Set<Order> orders;
    private Set<TimeCardGoWork> goes;
    private Set<TimeCardOffWork> offs;

    public Employee() {
    }

    public Employee(String employeeName, String employeePhone, String employeePosition) {
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeePosition = employeePosition;
    }

    public Employee(String employeeName, String employeePhone, String employeePosition, String employeeRemark) {
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeePosition = employeePosition;
        this.employeeRemark = employeeRemark;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getEmployeeRemark() {
        return employeeRemark;
    }

    public void setEmployeeRemark(String employeeRemark) {
        this.employeeRemark = employeeRemark;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<TimeCardGoWork> getGoes() {
        return goes;
    }

    public void setGoes(Set<TimeCardGoWork> goes) {
        this.goes = goes;
    }

    public Set<TimeCardOffWork> getOffs() {
        return offs;
    }

    public void setOffs(Set<TimeCardOffWork> offs) {
        this.offs = offs;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone=" + employeePhone + ", employeePosition=" + employeePosition + ", employeeRemark=" + employeeRemark + ", orders=" + orders + ", goes=" + goes + ", offs=" + offs + '}';
    }

    
}
