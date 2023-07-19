package com.example.telegrambot.repository;

import com.example.telegrambot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findAllByNotificationDataTime(LocalDateTime dateTime);

    List<NotificationTask> findAllByNotificationDataTimeAndChatId(LocalDateTime dateTime, long chatId);
}
