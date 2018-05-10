package com.lorelib.cuckoo.tools.codegen;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成器
 *
 * @author listening
 * @description
 * @date 2018-05-08 12:30
 * @since 1.0
 */
public class CodeGenerator {
  public static void main(String[] args) {
    AutoGenerator mpg = new AutoGenerator();
    // 选择 freemarker 引擎，默认 Veloctiy
    // mpg.setTemplateEngine(new FreemarkerTemplateEngine());

    // 全局配置
    GlobalConfig gc = new GlobalConfig();
    gc.setOutputDir("D://cuckoo");
    gc.setFileOverride(true);
    gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
    gc.setEnableCache(false);// XML 二级缓存
    gc.setBaseResultMap(false);// XML ResultMap
    gc.setBaseColumnList(true);// XML columList

    // 自定义文件命名，注意 %s 会自动填充表实体属性！
    // gc.setMapperName("%sDao");
    // gc.setXmlName("%sDao");
    // gc.setServiceName("MP%sService");
    // gc.setServiceImplName("%sServiceDiy");
    // gc.setControllerName("%sAction");
    mpg.setGlobalConfig(gc);

    // 数据源配置
    DataSourceConfig dsc = new DataSourceConfig();
    dsc.setDbType(DbType.MYSQL);
    dsc.setTypeConvert(new MySqlTypeConvert() {
      // 自定义数据库表字段类型转换【可选】
      @Override
      public DbColumnType processTypeConvert(String fieldType) {
        System.out.println("转换类型：" + fieldType);
        // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
        return super.processTypeConvert(fieldType);
      }
    });
    dsc.setDriverName("com.mysql.jdbc.Driver");
    dsc.setUsername("root");
    dsc.setPassword("123456");
    dsc.setUrl("jdbc:mysql://localhost:3307/cuckoo?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
    mpg.setDataSource(dsc);

    // 策略配置
    StrategyConfig strategy = new StrategyConfig();
    // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
    // strategy.setTablePrefix(new String[]{"tlog_", "tsys_"});// 此处可以修改为您的表前缀
    strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
    // strategy.setInclude(new String[] { "user" }); // 需要生成的表
    // strategy.setExclude(new String[]{"test"}); // 排除生成的表
    // 自定义实体父类
    strategy.setSuperEntityClass("com.lorelib.framework.domain.BaseEntity");
    // 自定义实体，公共字段
    //strategy.setSuperEntityColumns(new String[] { "id", "sys_status", "crt_time", "creator", "mod_time", "modifier", "sys_comment" });
    // 自定义 mapper 父类
    strategy.setSuperMapperClass("com.baomidou.mybatisplus.mapper.BaseMapper");
    // 自定义 service 父类
    // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
    // 自定义 service 实现类父类
    // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
    // 自定义 controller 父类
    // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
    // 【实体】是否生成字段常量（默认 false）
    // public static final String ID = "test_id";
    // strategy.setEntityColumnConstant(true);
    // 【实体】是否为构建者模型（默认 false）
    // public User setName(String name) {this.name = name; return this;}
    // strategy.setEntityBuilderModel(true);
    mpg.setStrategy(strategy);

    // 包配置
    PackageConfig pc = new PackageConfig();
    pc.setParent("com.lorelib.cuckoo");
    pc.setModuleName("user");
    mpg.setPackageInfo(pc);

    // 关闭默认 xml 生成，调整生成 至 根目录
    TemplateConfig tc = new TemplateConfig();
    //tc.setXml(null);
    tc.setController(null);
    tc.setService(null);
    tc.setServiceImpl(null);
    mpg.setTemplate(tc);

    // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
    // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
    // TemplateConfig tc = new TemplateConfig();
    // tc.setController("...");
    // tc.setEntity("...");
    // tc.setMapper("...");
    // tc.setXml("...");
    // tc.setService("...");
    // tc.setServiceImpl("...");
    // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
    // mpg.setTemplate(tc);

    // 执行生成
    mpg.execute();
  }
}
