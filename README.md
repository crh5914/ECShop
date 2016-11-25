## 网上商城系统（数据库大作业）

#### 1. 功能简介
一个简单的商城系统，支持商家开铺，顾客购物和评论打分。

#### 2. 技术框架
* 前端：待定
* 后端：spring boot, spring mvc, spring data jpa
* 数据库：mysql

#### 3. 项目结构说明
* Model目录：Entity子目录存放数据表的实体模型，Repository存放了操作数据表所使用的接口
* Controller目录：View子目录存放 负责返回视图的控制器 文件，WebApi子目录存放 负责处理网络请求（除了网页请求）的控制器 文件
* application.properties文件：管理项目的各种配置,数据库的帐号密码可在里面看到

#### 4. 本地部署说明
* 依赖包安装：第一次打开项目，要根据IDE提示将项目处理为maven项目，然后会自动安装所需依赖，需要耐心等待一段时间
* 数据库配置：安装好mysql后，要先创建一个叫ecshop的数据库，以及创建帐号和密码（要与application.properties文件中的一致）
* 项目启动运行：在项目的根目录下，通过命令行“mvn spring-boot:run"来启动，或者在IDE中设置一下maven启动就不用每次都输命令行