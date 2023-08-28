# Проект по тестированию элементов сайта "Иви"
сделано в рамках дипломного проекта для qa.guru
 <p align="center">
<img title="ivipage" src="images/screenshots/iviMain.png" width="700">
</p>
> <a target="_blank" href="https://www.ivi.ru">ivi.ru</a>
> 
> ## :open_book: Содержание:
> 
> - [Технологии и инструменты](#gear-технологии-и-инструменты)
- [Тест кейсы](#heavy_check_mark-Тест-кейсы)
- [Запуск тестов](#computer-запуск-тестов-из-терминала)
- [Примеры использования](#примеры-использования)
- [Запуск тестов в Jenkins](#-запуск-тестов-из-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео прохождения тестов](#movie_camera-видео-с-прогоном-тестов)

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media\logo\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
<a href="https://qameta.io/"><img src="media\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO" title="Allure_TO"></a>
</p>

Для написания проектов использовался язык **Java**  и фреймворк тестирования **Selenide**. Среда сборки **IntelliJ IDEA** сочетается с **Gradle**.
**JUnit5** - фреймворк модульного тестирования. Запуск тестов выполняется из **Jenkins**. **Selenoid** используется для запуска браузеров в контейнерах **Docker**.

**Allure Report**, **AllureTestOps** и **Telegram Bot** использованы для визуализации результатов проверок.

## :heavy_check_mark: Тест кейсы
- Проверка на присутствие в маркетах приложений приложения Иви
- Проверка проставления рейтинга фильмов
- Проверка на регистрацию пользователя 
- Проверка на регистрацию пользователя с неверным форматом email
- Проверка на поиск фильмов по заголовкам
- Проверка возможности поделиться фильмом в соцсети
- Проверка сортировки фильмов по годам


###  Основной отчет
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allureSteps.PNG">
</p>
> Отчет позволяет посмотреть шаги выполнения теста и их код 

## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://allure.autotests.cloud/launch/15301">Allure TestOps</a>
<p align="center">
<img title="Allure Overview1" src="images/screens/testOpsScreen01.PNG" width="700">
</p>
>Интеграция с TestOps позволяет выборочно или поточно запускать тесты
<p align="center">
<img title="Allure Overview2" src="images/screens/testOpsScreen02.PNG" width="700">
</p>


## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота
> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.
<p align="center">
<img title="Telega" src="images/screens/telegramReport.PNG" >
</p>

> Видео к прохождению теста "Добавление игры в корзину".
<p align="center">
  <img title="Selenoid Video" src="media/video/appLinkscheckVideo.mp4">
</p>