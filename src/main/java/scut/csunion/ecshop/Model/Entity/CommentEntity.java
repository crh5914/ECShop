package scut.csunion.ecshop.Model.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by zijun on 16-11-24.
 */
@Entity
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "commodity_id", referencedColumnName = "id")
    private CommodityEntity commodityEntity;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "time", nullable = false, columnDefinition = "timestamp default current_timestamp")
    private Timestamp time;

    @Column(name = "level", columnDefinition = "tinyint(1)")
    private byte level;

    public CommentEntity() {
    }

    public CommentEntity(UserEntity userEntity, CommodityEntity commodityEntity, String content, Timestamp time, byte level) {
        this.userEntity = userEntity;
        this.commodityEntity = commodityEntity;
        this.content = content;
        this.time = time;
        this.level = level;
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

    public CommodityEntity getCommodityEntity() {
        return commodityEntity;
    }

    public void setCommodityEntity(CommodityEntity commodityEntity) {
        this.commodityEntity = commodityEntity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }
}
