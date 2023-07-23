# Курсовая работа по созданию телеграм-бота
Телеграм-бот для планирования задач и уведомления пользователя
# Краткое описание
Этот телеграм-бот, который умеет принимать от пользователя сообщения в формате "01.01.2023 20:00 Сделать домашнюю работу", а затем присылать в назначенное время уведомление. Каждая задача заносится в базу данных, а после ее отправки пользователю удаляется из базы данных.
# Используемые технологии
- Spring Boot/Web
- Hibernate
- PostgreSQL
- Liquibase
- Logger
- JUnit
- Mockito
- 
# Запуск приложения
Откройте проект в Вашей IDE (например, IntelliJIDEA)
Укажите путь к Вашей базе данных в файле application.properties
Укажите токен Telegram бота в файле application.properties
Запустите метод main в классе TelegramBotApplication.class
