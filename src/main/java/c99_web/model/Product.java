package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Product {
	
	private Integer productId;
	private String  productName;
	private Integer productPrice;    // BigDecimal
	private Integer productCost;     // BigDecimal
	private String productUnit;
	private String productStatus;   // Y/N
	private String productRemark;
//        private Set<Order> orders;
        private Category category;
	
    public Product() {
    }

    public Product(String productName, Integer productPrice, Integer productCost, String productUnit, String productStatus) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCost = productCost;
        this.productUnit = productUnit;
        this.productStatus = productStatus;
    }

    public Product(String productName, Integer productPrice, Integer productCost, String productUnit, String productStatus, String productRemark) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCost = productCost;
        this.productUnit = productUnit;
        this.productStatus = productStatus;
        this.productRemark = productRemark;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductCost() {
        return productCost;
    }

    public void setProductCost(Integer productCost) {
        this.productCost = productCost;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductRemark() {
        return productRemark;
    }

    public void setProductRemark(String productRemark) {
        this.productRemark = productRemark;
    }

//    public Set<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(Set<Order> orders) {
//        this.orders = orders;
//    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

//    @Override
//    public String toString() {
//        return "Product{" + "productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + ", productCost=" + productCost + ", productUnit=" + productUnit + ", productStatus=" + productStatus + ", productRemark=" + productRemark + ", orders=" + orders + ", category=" + category + '}';
//    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + ", productCost=" + productCost + ", productUnit=" + productUnit + ", productStatus=" + productStatus + ", productRemark=" + productRemark + ", category=" + category + '}';
    }
    
    
    
}
