package com.coach.board_backend;
import jakarta.persistence.*;
@Entity//// 标记这是JPA实体类，对应数据库中的一张表
@Table(name = "classic_tactic")// 指定映射的表名是classic_tactic
public class ClassicTactic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 主键自增（对应MySQL的AUTO_INCREMENT）
    private Long id;
    private String title;
    private String message;//战术描述：2v2，3v3等等
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
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public String getFramesJson() {
        return framesJson;
    }
    public void setFramesJson(String framesJson) {
        this.framesJson = framesJson;
    }
}
