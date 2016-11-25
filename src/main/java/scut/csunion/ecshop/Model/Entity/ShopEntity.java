package scut.csunion.ecshop.Model.Entity;

import javax.persistence.*;

/**
 * Created by zijun on 16-11-24.
 */
@Entity
@Table(name = "shop")
public class ShopEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(50)")
    private String name;

    @OneToOne
    @JoinColumn(name = "manager", referencedColumnName = "id")
    private AdministratorEntity administratorEntity;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "description", nullable = false, columnDefinition = "varchar(255) default ''")
    private String description;

    public ShopEntity() {
    }

    public ShopEntity(String name, AdministratorEntity administratorEntity, String address, String description) {
        this.name = name;
        this.administratorEntity = administratorEntity;
        this.address = address;
        this.description = description;
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

    public AdministratorEntity getAdministratorEntity() {
        return administratorEntity;
    }

    public void setAdministratorEntity(AdministratorEntity administratorEntity) {
        this.administratorEntity = administratorEntity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
