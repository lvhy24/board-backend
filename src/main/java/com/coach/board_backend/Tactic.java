package com.coach.board_backend;
import jakarta.persistence.*;

@Entity//// 标记这是JPA实体类，对应数据库中的一张表
@Table(name = "tactic")// 指定映射的表名是tactic
public class Tactic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 主键自增（对应MySQL的AUTO_INCREMENT）
    private Long id;
    private String title;
    private String message;//描述信息
    @Column(columnDefinition = "JSON")
    private String framesJson;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFramesJson() {
        return framesJson;
    }
    public void setFramesJson(String framesJson) {
        this.framesJson = framesJson;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
}
