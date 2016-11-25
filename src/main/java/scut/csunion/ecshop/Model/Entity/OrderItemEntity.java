package scut.csunion.ecshop.Model.Entity;

import javax.persistence.*;

/**
 * Created by zijun on 16-11-24.
 */
@Entity
@Table(name = "order_item")
public class OrderItemEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderEntity orderEntity;

    @Column(name = "amount", nullable = false, length = 6)
    private int amount;

    @OneToOne
    @JoinColumn(name = "commodity_id", referencedColumnName = "id")
    private CommodityEntity commodityEntity;

    public OrderItemEntity() {
    }

    public OrderItemEntity(OrderEntity orderEntity, int amount, CommodityEntity commodityEntity) {
        this.orderEntity = orderEntity;
        this.amount = amount;
        this.commodityEntity = commodityEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CommodityEntity getCommodityEntity() {
        return commodityEntity;
    }

    public void setCommodityEntity(CommodityEntity commodityEntity) {
        this.commodityEntity = commodityEntity;
    }
}
