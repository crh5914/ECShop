package scut.csunion.ecshop.Model.Entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by zijun on 16-11-24.
 */
@Entity
@Table(name = "commodity")
public class CommodityEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(50) default ''")
    private String name;

    @Column(name = "price", nullable = false, columnDefinition = "decimal(10, 2) default 0")
    private BigDecimal price;

    @Column(name = "left_amount", nullable = false, columnDefinition = "int default 0")
    private int left_amount;

    @Column(name = "sold_amount", nullable = false, columnDefinition = "int default 0")
    private int sold_amount;

    @Column(name = "description", nullable = false, columnDefinition = "varchar(255) default ''")
    private String description;

    @ManyToOne
    @JoinColumn(name = "shop_id", referencedColumnName = "id")
    private ShopEntity shopEntity;

    public CommodityEntity() {
    }

    public CommodityEntity(String name, BigDecimal price, int left_amount, int sold_amount, String description, ShopEntity shopEntity) {
        this.name = name;
        this.price = price;
        this.left_amount = left_amount;
        this.sold_amount = sold_amount;
        this.description = description;
        this.shopEntity = shopEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getLeft_amount() {
        return left_amount;
    }

    public void setLeft_amount(int left_amount) {
        this.left_amount = left_amount;
    }

    public int getSold_amount() {
        return sold_amount;
    }

    public void setSold_amount(int sold_amount) {
        this.sold_amount = sold_amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShopEntity getShopEntity() {
        return shopEntity;
    }

    public void setShopEntity(ShopEntity shopEntity) {
        this.shopEntity = shopEntity;
    }
}
