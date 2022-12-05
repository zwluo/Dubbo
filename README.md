# Dubbo
Dubbo+nacos，父子模块项目

创建父模块和公共接口模块时，选择new project, maven项目，不能通过spring initializer创建，否则重载子模块的pom文件会没有反应

生产者和消费者子模块需要通过spring initializer创建，右击父项目，新建moudule

父模块和子模块的```<type>pom</type>```需要同时出现，或者同时不出现

打包时，需要切换到父模块根目录下，直接打包所以子项目
