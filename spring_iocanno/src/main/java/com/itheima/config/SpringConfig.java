package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//表示该类是核心配置类
@ComponentScan("com.itheima")//组件扫描//<context:component-scan base-package="com.itheima"/>
//<import resource=">导入分模块开发
@Import({DataSourceConfiguration.class})
public class SpringConfig {


}
