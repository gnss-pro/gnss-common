### 环境搭建
JDK 1.8+  
maven 3.6+(配置阿里云镜像加速请参考：**https://maven.aliyun.com/mvn/guide**)  
开发工具建议使用IntelliJ IDEA  

以下步骤以苹果Mac系统开发为例：  
(1) 下载项目：git clone https://github.com/gnss-pro/gnss-common.git    
(2) 打开IDEA，导入项目  
(3) 安装插件Lombok，点击Preferences -> Plugins -> 查询Lombok并安装重启IDEA   
(4) 设置Java编译版本，点击Preferences -> Compiler -> Java Compiler -> 右边的Target bytecode version选择1.8  
(5) 点击File -> Project Structure -> Project -> 右边Project SDK选择1.8，Modules -> 右边Module SDK选择1.8  
(6) 设置maven环境，点击Preferences -> Build Tools -> Maven -> 右边配置Maven home directory和User settings file  
(7) 打开IDEA的maven工具栏，双击clean，然后双击install，将公共包安装到本地仓库  

### gnss-core
整个平台公共的核心类，定义了注解、常量、异常、传输格式、RPC格式、Redis工具类、时间和数字等工具类。
### gnss-mqutil
整个平台公共的MQ工具类，采用了erlang语言编写的开源的RabbitMQ。  
此模块的主要功能：  
(1) 定义了所有模块用到的队列、交换机和路由key   
(2) 定义了MQ消息的序列化转换器  
(3) 定义了MQ消息生产者  
(4) 定义了所有模块用到的中间件(Redis、RabbitMQ)的bean
