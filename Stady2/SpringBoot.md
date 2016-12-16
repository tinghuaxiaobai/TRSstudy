#SpringBoot
Spring Boot提供了一个强大的一键式Spring的集成开发环境，能够单独进行一个Spring应用的开发，其中： 
	
	（1）集中式配置（application.properties）+注解，大大简化了开发流程 
	
	（2）内嵌的Tomcat和Jetty容器，可直接打成jar包启动，无需提供Java war包以及繁琐的Web配置
	 
	（3）提供了Spring各个插件的基于Maven的pom模板配置，开箱即用，便利无比。
	
	（4）可以在任何你想自动化配置的地方，实现可能 
	
	（5）提供更多的企业级开发特性，如何系统监控，健康诊断，权限控制 
	
	（6） 无冗余代码生成和XML强制配置 
	
	（7）提供支持强大的Restfult风格的编码，非常简洁
SpringBoot有以下特性

	为基于Spring的开发提供更快的入门体验
	开箱即用，没有代码生成，也无需XML配置。同时也可以修改默认值来满足特定的需求。
	提供了一些大型项目中常见的非功能性特性，如嵌入式服务器、安全、指标，健康检测、外部配置等。
	Spring Boot并不是不对Spring功能上的增强，而是提供了一种快速使用Spring的方式。
#使用SpringBoot
###1.首先首先创建一个一般的Maven项目，有一个pom.xml和基本的src/main/java结构。
在pom.xml中添加maven依赖

	<?xml version="1.0" encoding="UTF-8"?>
	<project xmlns="http://maven.apache.org/POM/4.0.0"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.github.abel533</groupId>
    <artifactId>spring-boot</artifactId>
    <version>1.0-SNAPSHOT</version>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.3.0.RELEASE</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <dependencies>
                    <dependency>
                        <groupId>org.springframework</groupId>
                        <artifactId>springloaded</artifactId>
                        <version>1.2.5.RELEASE</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build></project>
2.创建一个应用类

	@RestController
	@EnableAutoConfiguration
	public class Application {
	
	 @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String hehe() {
        return "现在时间：" + (new Date()).toLocaleString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

	}

3.启动main()函数

在Tomcat启动后，访问http://localhost:8080就可以看到Hello World!出现在浏览器中了。

@RestController这个注解相当于同时添加@Controller和@ResponseBody注解。

@EnableAutoConfiguration作用：Spring Boot会自动根据你jar包的依赖来自动配置项目。例如当你项目下面有HSQLDB的依赖时，Spring Boot会创建默认的内存数据库的数据源DataSource，如果你自己创建了DataSource，Spring Boot就不会创建默认的DataSource。

添加如下配置，打包使用mvn package就可以将该项目打包成一个可执行的Jar文件，该Jar文件存在于项目中的target目录下。

	<build>   <!-- 构建Jar文件 -->
	    <plugins>
	        <plugin>
	            <groupId>org.springframework.boot</groupId>
	            <artifactId>spring-boot-maven-plugin</artifactId>
	        </plugin>
	    </plugins>
	</build>
[SpringBoot完整文档](http://docs.spring.io/spring-boot/docs/1.2.3.RELEASE/reference/html/index.html)
