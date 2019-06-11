package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Customer{
	
    private Integer customerId;
    private String customerName;
    private String customerPhone;
    private Integer customerPoint;
    private String customerRemark;
    private Set<Order> orders;

    public Customer() {
    }

    public Customer(String customerName, String customerPhone, Integer customerPoint) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerPoint = customerPoint;
    }

    public Customer(String customerName, String customerPhone, Integer customerPoint, String customerRemark) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerPoint = customerPoint;
        this.customerRemark = customerRemark;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Integer getCustomerPoint() {
        return customerPoint;
    }

    public void setCustomerPoint(Integer customerPoint) {
        this.customerPoint = customerPoint;
    }

    public String getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", customerPhone=" + customerPhone + ", customerPoint=" + customerPoint + ", customerRemark=" + customerRemark + ", orders=" + orders + '}';
    }

    

}
