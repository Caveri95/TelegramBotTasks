package com.example.telegrambot.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_tasks")
public class NotificationTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String message;
    @Column(name = "chat_id", nullable = false)
    private long chatId;
    @Column(name = "notification_date_time", nullable = false)
    private LocalDateTime notificationDataTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public LocalDateTime getNotificationDataTime() {
        return notificationDataTime;
    }

    public void setNotificationDataTime(LocalDateTime notificationDataTime) {
        this.notificationDataTime = notificationDataTime;
    }
}
