# Проект по автоматизации mobile тестов для приложения [Wikipedia](https://ru.wikipedia.org/)
<p align="center"><a href="https://ru.wikipedia.org/"><img src="media/logo/WikiLogo.png" align="center" width="150" height="150" alt="Wiki"/></a></p>  

> Википедия - общедоступная многоязычная универсальная интернет-энциклопедия со свободным контентом, реализованная на принципах вики.

# 🧾 Содержание:

- <a href="#tools">Технологии и инструменты</a>
- <a href="#checking">Тестовые сценарии, реализованные в автоматизированных тест-кейсах</a>
- <a href="#console">Запуск тестов (Из терминала)</a>
- <a href="#allureReport">Allure-отчет</a>
- <a href="#allure">Интеграция с Allure TestOps</a>
- <a href="#teleg"> Уведомление в Telegram о результатах выполнения автоматизированных тестов</a>
- <a href="#movie">Видеопример прохождения тестов Browserstack</a>


<a id="tools"></a>

## 🔨 Технологии и инструменты:
<p>
  <a href="https://www.jetbrains.com/idea/"><img alt="IntelliJ IDEA" src="media/logo/Idea.svg" width="50" height="50"></a>
  <a href="https://github.com/"><img alt="GitHub" src="media/logo/GitHub.svg" width="50" height="50"></a>
  <a href="https://www.java.com/"><img alt="Java" src="media/logo/Java.svg" width="50" height="50"></a>
  <a href="https://gradle.org/"><img alt="Gradle" src="media/logo/Gradle.svg" width="50" height="50"></a>
  <a href="https://junit.org/junit5/"><img alt="JUnit 5" src="media/logo/Junit5.svg" width="50" height="50"></a>
  <a href="https://selenide.org/"><img alt="Selenide" src="media/logo/Selenide.svg" width="50" height="50"></a>
  <a href="https://aerokube.com/selenoid/"><img alt="Selenoid" src="media/logo/Selenoid.svg" width="50" height="50"></a>
  <a href="https://www.browserstack.com/"><img alt="BrowserStack" src="media/logo/Browserstack.svg" width="50" height="50"></a>
  <a href="https://developer.android.com/studio"><img alt="Android Studio" src="media/logo/androidstudio.svg" style="width:50px; height:50px;"/></a>
  <a href="https://www.jenkins.io/"><img alt="Jenkins" src="media/logo/Jenkins.svg" width="50" height="50"></a>
  <a href="https://github.com/allure-framework/"><img alt="Allure Report" src="media/logo/Allure.svg" width="50" height="50"></a>
  <a href="https://qameta.io/"><img alt="Allure TestOps" src="media/logo/Allure_TO.svg" width="50" height="50"></a>
  <a href="https://telegram.org/"><img alt="Telegram" src="media/logo/Telegram.svg" width="50" height="50"></a>
</p>

---

## :clipboard: Тестовые сценарии

### Для локального запуска
- :white_check_mark: Проверка стартовых страниц при запуске приложения
- :white_check_mark: Проверка функции поиска в Википедии

### Для удаленного запуска
- :white_check_mark: Проверка стартовых страниц при запуске приложения
- :white_check_mark: Проверка функции поиска в Википедии
---

- Тесты в данном проекте написаны на языке <code>Java</code> с использованием фреймворка для тестирования [Selenide](https://selenide.org/)
- Сборщик - <code>Gradle</code>.
- <code>JUnit 5</code> задействован в качестве фреймворка модульного тестирования.
- При прогоне тестов для запуска используется [Android Studio](https://developer.android.com/), [Browserstack](https://www.browserstack.com/), драйвер Appium.

---

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/021-Melnikov-Wikipedia_mobile_autotests/)

<p align="center">
<img src="media/screen/jenkinsscreen.PNG" alt="Jenkins Page" width="1000" height="350">
</p>

---

<a id="console"></a>
## :rocket: Команды для запуска

### Локальный запуск (через эмулятор)

```bash
gradle clean android_local_test
```

### Удаленный запуск (через browserstack)

```bash
gradle clean andoid_browserstack_test clean ios_browserstack_test
```

---

<a id="allure"></a>
## <img alt="Allure_TO" height="25" src="media/logo/Allure_TO.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3844/dashboards">Allure TestOps</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screen/testopsscreen.PNG" width="850" height="350">  
</p>

##  Добавление ручных тестов

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screen/manuel.PNG" width="500" height="350">  
</p>

---

<a id="teleg"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/> Уведомления в Telegram чат с ботом

### Уведомление через чат бот

<p align="center">
<img src="media/screen/TgScreen.jpeg" alt="Telegram" width="500" height="350">
</p>


#### Содержание уведомления в Telegram

- :heavy_check_mark: Окружение
- :heavy_check_mark: Комментарий
- :heavy_check_mark: Длительность прохождения тестов
- :heavy_check_mark: Общее количество сценариев
- :heavy_check_mark: Процент прохождения тестов
- :heavy_check_mark: Ссылка на Allure отчет

---

<a id="movie"></a>
## <img alt="Browserstack" height="25" src="media/logo/Browserstack.svg" width="25"/></a> Видеопример выполнения теста c Browserstack


<p align="center">
<img title="Browserstack Video" src="media/screen/video (3).gif" width="350" height="350"  alt="video">   
</p>