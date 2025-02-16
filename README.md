# Spring Boot Demo

## 目录

- [上手指南](#上手指南)
  - [基本需求](#基本需求)
  - [安装步骤](#安装步骤)
- [文件目录说明](#文件目录说明)
- [使用到的框架](#使用到的框架)
- [版本控制](#版本控制)
- [作者](#作者)
- [版权说明](#版权说明)

### 上手指南

本项目为一个Spring Boot的案例，可直接使用。可供参考。

###### 基本需求

1. Java 版本 大于 17
2. Maven 版本 大于等于 3.6.3

###### **安装步骤**

```sh
git clone https://github.com/Dumese/Spring-Boot-Demo.git
```

### 文件目录说明

eg:

```
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─example
│  │  │          └─demo
│  │  │              ├─config	放置配置类，这些类通常用于定义应用程序的配置，比如数据库连接、消息队列配置等。
│  │  │              ├─controller	包含Spring MVC控制器类。这些类处理HTTP请求，返回视图名称或数据。
│  │  │              ├─dto	包含Spring MVC控制器类。这些类处理HTTP请求，返回视图名称或数据。
│  │  │              ├─entity	包含Spring MVC控制器类。这些类处理HTTP请求，返回视图名称或数据。
│  │  │              ├─handler	包含Spring MVC控制器类。这些类处理HTTP请求，返回视图名称或数据。
│  │  │              ├─mapper	MyBatis的mapper接口和对应的XML映射文件所在的位置。这些用于数据库操作。
│  │  │              │  └─xml	MyBatis的mapper接口和对应的XML映射文件所在的位置。这些用于数据库操作。
│  │  │              ├─service	业务逻辑层。这些类包含应用程序的核心业务逻辑。
│  │  │              │  └─impl	service接口的实现类。
│  │  │              ├─utils	工具类。这些类包含常用的工具方法，如日期处理、字符串处理等。
│  │  │              │  └─filter	放置Servlet过滤器类，用于请求预处理和后处理。
│  │  │              └─vo	View Object（视图对象）的缩写。这些类用于封装返回给前端的数据。
│  │  └─resources	资源文件目录。这里放置配置文件、静态文件、模板文件等。
│  │      ├─sql	SQL脚本文件，如初始化数据库脚本。
│  │      ├─static	静态资源文件，如CSS、JavaScript、图片等。这些文件可以直接通过URL访问。
│  │      └─templates	视图模板文件，如Thymeleaf、Freemarker模板。这些文件用于生成动态HTML内容。
```

### 部署

暂无

### 使用到的框架

- [Spring | Home](https://spring.io/)
- [Apache Druid | Apache® Druid](https://druid.apache.org/)
- [Hutool](https://doc.hutool.cn/)
- [Apache Log4j :: Apache Log4j](https://logging.apache.org/log4j/2.x/index.html)
- [io.jsonwebtoken](https://github.com/jwtk/jjwt?tab=readme-ov-file#java-jwt-json-web-token-for-java-and-android)

### 版本控制

该项目使用Git进行版本管理。您可以在repository参看当前可用版本。

### 作者

Dumese

### 版权说明

该项目签署了Apache 2.0授权许可，详情请参阅 [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0)
