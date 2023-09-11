# Проект по тестированию элементов сайта "Иви"

сделано в рамках дипломного проекта для qa.guru
 <p align="center">
<img title="ivipage" alt="frontpage" src="media/screen/iviMain.png" width="700">
</p>
> <a target="_blank" href="https://www.ivi.ru">ivi.ru</a>



<a name="Ссылка"></a>

## Оглавление

- <a href="#tools">Использованный стек технологий</a>
- <a href="#list">Список проверок</a>
- <a href="#jenkins">Удаленный запуск через Jenkins</a>
- <a href="#allure">Результаты запуска тестов в Allure Report</a>
- <a href="#testops">Интеграция с Allure TestOps</a>
- <a href="#jira">Интеграция с Jira</a>
- <a href="#tg">Результаты запуска тестов в Telegram-боте</a>
- <a href="#vic">Видео одной из проверок</a>

<p align="left">
<a id="tools"></a>
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media\logo\JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media\logo\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
<a href="https://qameta.io/"><img src="media\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO" title="Allure_TO"></a>
<a href="https://www.atlassian.com/software/jira"><img src="media\logo\Jira.svg" width="50" height="50" alt="Jira" title="Jira"></a>
</p>

Для написания проектов использовался язык **Java**  и фреймворк тестирования **Selenide**. Среда сборки **IntelliJ IDEA
** сочетается с **Gradle**.
**JUnit5** - фреймворк модульного тестирования. Запуск тестов выполняется из **Jenkins**. **Selenoid** используется для
запуска браузеров в контейнерах **Docker**.

**Allure Report**, **AllureTestOps** и **Telegram Bot** использованы для визуализации результатов проверок.

<a id="list"></a>

## :heavy_check_mark: Тест кейсы

- Проверка на присутствие в маркетах приложений приложения Иви
- Проверка проставления рейтинга фильмов
- Проверка на регистрацию пользователя
- Проверка на регистрацию пользователя с неверным форматом email
- Проверка на поиск фильмов по заголовкам
- Проверка возможности поделиться фильмом в соцсети
- Проверка сортировки фильмов по годам

## <img src="media/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Задача в <a target="_blank" href="https://jenkins.autotests.cloud/job/project-ivi-eb-try1/">Jenkins</a>

<p align="center">
<a id="jenkins"></a>
<img title="Jenkins" alt="Jenkins" src="media/screen/jenkinsScreen1.png"> </p> 

> Jenkins позволяет сделать тест параметризованным, выбрать нужный браузер, разрешение

<a id="allure"></a>

## <img src="media/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/project-ivi-eb-try1/allure/">Allure Report</a>

<p align="center">
<img title="Allure Overview" alt="allure" src="media/screen/allureSteps.PNG">
</p>

> Отчет позволяет детально посмотреть шаги выполнения тестов

<p align="center">
<img title="Allure Overview" alt="allure" src="media/screen/allureAttach.PNG">
</p>

> Также отчет предоставляет вложение с последним скриншотом, кодом страницы, логами и видео, фиксирующим ход выполнения теста.

## <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://allure.autotests.cloud/launch/29495">Allure TestOps</a>

<p align="center">
<a id="testops"></a>
<img title="Allure Overview1" alt="Allure" src="media/screen/testOpsScreen001.PNG">
</p>

> Интеграция с TestOps позволяет выборочно или поточно запускать тесты
<p align="center">
<img title="Allure Overview2" alt="testOps" src="media/screen/testOpsScreen02.PNG">
</p>


<a id="jira"></a>

## <img src="media/logo/Jira.svg" width="25" height="25"  alt="Jira"/></a> Отчет в <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-857">Jira</a>

<p align="center">
<img title="Jira" alt="Jira" src="media/screen/jiraScreen01.PNG">
</p>

> Тест-кейсы и результаты прогонов можно прикреплять к задачам в Jira

## <img src="media/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет
> сообщение с отчетом о прогоне.
<a id="tg"></a>
<p align="center">
<img title="Telega" alt="Telega" src="media/screen/telegramScreen.jpg" width ="300" >
</p>

> Видео к прохождению теста "Проверка на присутствие в маркетах приложения Иви" на Selenoid
<a id="vid"></a>
<p align="center">
  <img title="Selenoid Video" alt="vid" src="media/video/videogif.gif">
</p>