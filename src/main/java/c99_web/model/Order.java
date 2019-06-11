package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Order{
    
    private Integer orderId;
    private Long orderTime;
    private String orderRemark;
    private Customer customer;
    private Set<Employee> employees;
    private Set<Product> products;

    public Order() {
    }

    public Order(Long orderTime) {
        this.orderTime = orderTime;
    }

    public Order(Long orderTime, String orderRemark) {
        this.orderTime = orderTime;
        this.orderRemark = orderRemark;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", orderTime=" + orderTime + ", orderRemark=" + orderRemark + ", customer=" + customer + ", employees=" + employees + ", products=" + products + '}';
    }

}
