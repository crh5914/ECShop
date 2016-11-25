package scut.csunion.ecshop.Model.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Created by zijun on 16-11-24.
 */
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "account", nullable = false, columnDefinition = "varchar(25)")
    @NotNull
    private String account;

    @Column(name = "password", nullable = false, columnDefinition = "char(32)")
    @NotNull
    private String password;

    @Column(name = "ctime", columnDefinition = "timestamp default current_timestamp")
    @NotNull
    private Timestamp ctime;

    public UserEntity() {
    }

    public UserEntity(String account, String password, Timestamp ctime) {
        this.account = account;
        this.password = password;
        this.ctime = ctime;
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

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }
}
