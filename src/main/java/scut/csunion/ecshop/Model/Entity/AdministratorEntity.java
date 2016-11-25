package scut.csunion.ecshop.Model.Entity;

import javax.persistence.*;

/**
 * Created by zijun on 16-11-24.
 */
@Entity
@Table(name = "administrator")
public class AdministratorEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "account", nullable = false, columnDefinition = "varchar(25)")
    private String account;

    @Column(name = "password", nullable = false, columnDefinition = "char(32)")
    private String password;

    @Column(name = "\"group\"", nullable = false, columnDefinition = "tinyint(2) default 0")
    private byte group;

    public AdministratorEntity() {
    }

    public AdministratorEntity(String account, String password, byte group) {
        this.account = account;
        this.password = password;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getGroup() {
        return group;
    }

    public void setGroup(byte group) {
        this.group = group;
    }
}
