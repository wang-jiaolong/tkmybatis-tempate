# tkmybatis-tempate
> Tkmybatis是基于Mybatis框架开发的一个工具，通过调用它提供的方法实现对单表的数据操作，不需要写任何sql语句，这极大地提高了项目开发效率。

## 代码说明

- `tk-mybatis` 为spring boot集成`tkmybatis`,在配置好文件后，生成在当前模块中，以防误操作覆盖原有类。
- `demo`为示例模块，简单项目架构及测试。



## 使用方法

1. 在`tk-mybatis`中生成相应`mapper`、`pojo`、`maper.xml`
2. 复制到需要的模块中去

## 配置方法

![20210320201546](https://i.loli.net/2021/03/20/Z3VqOrmxFLGURC4.png)

1. 在`jdbc.properties`中添加数据库配置

   ```
   jdbc.driverClass=com.mysql.cj.jdbc.Driver
   jdbc.connectionURL=jdbc:mysql://localhost:3306/database?serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true
   jdbc.username=root
   jdbc.password=123456
   ```

2. 从配置中取值配置数据库连接

3. 配置实体类`pojo`路径

4. 配置`mapper.xml`的路径

5. 配置数据操作曾`Mapper`的路径

6. 配置要生成的数据库