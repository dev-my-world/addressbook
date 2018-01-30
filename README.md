# addressbook 通讯录

- `src/main/resource/addressbook.sql` 为AddressBook数据库内容<br>
- `src/main/resource/application.yaml` 为SpringBoot的配置文件<br>
- `src/main/templates/*`  为FreeMark模板引擎文件<br>
 <br>[项目演示地址](http://118.89.108.227:8089/addressbook/list)

#运行指南
  - 执行`src/main/java/com/example/address/book/MyAddressBookApplication.java`中的```main```方法运行
  - 终端输入```gradle bootRun```运行
  - 执行```gradle jar``` 打包成```jar```，用```java -jar```运行
  - 修改```MyAddressBookApplication```，执行```gradle war``` 将打包好的war包放到tomcat中运行