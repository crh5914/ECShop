package scut.csunion.ecshop.Model.Entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by zijun on 16-11-24.
 */
@Entity
@Table(name = "\"order\"")
public class OrderEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userEntity;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "receiver_name", nullable = false, columnDefinition = "varchar(25)")
    private String receiver_name;

    @Column(name = "phone", nullable = false, columnDefinition = "varchar(15)")
    private String phone;

    @Column(name = "turnover", nullable = false, columnDefinition = "decimal(12, 2)")
    private BigDecimal turnover;

    @Column(name = "status", nullable = false, columnDefinition = "tinyint(1)")
    private byte status;

    @Column(name = "package_info", columnDefinition = "varchar(255) default ''")
    private String package_info;

    public OrderEntity() {
    }

    public OrderEntity(UserEntity userEntity, String address, String receiver_name, String phone, BigDecimal turnover, byte status, String package_info) {
        this.userEntity = userEntity;
        this.address = address;
        this.receiver_name = receiver_name;
        this.phone = phone;
        this.turnover = turnover;
        this.status = status;
        this.package_info = package_info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getPackage_info() {
        return package_info;
    }

    public void setPackage_info(String package_info) {
        this.package_info = package_info;
    }
}
