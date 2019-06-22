package c99_web.model;

import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public class Category {
    
    private Integer categoryId;
    private String categoryName;
    private String categoryRemark;
    private Set<Product> products;
    
    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category(int categoryId, String categoryName, String categoryRemark) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryRemark = categoryRemark;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryRemark() {
        return categoryRemark;
    }

    public void setCategoryRemark(String categoryRemark) {
        this.categoryRemark = categoryRemark;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryRemark=" + categoryRemark + ", products=" + products + '}';
    }

    
    
}
