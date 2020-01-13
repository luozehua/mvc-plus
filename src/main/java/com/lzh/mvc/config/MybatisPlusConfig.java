package com.lzh.mvc.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.lzh.mvc.mapper", "com.lzh.mvc.mapper.*"})
public class MybatisPlusConfig {
    /***
     * plus 的性能优化
     * @return
     */
    @Bean
    //@Profile({"devnew", "develop", "test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        /*<!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->*/
        performanceInterceptor.setMaxTime(1000);
        /*<!--SQL是否格式化 默认false-->*/
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }


    @Bean
   // @Profile({"devnew", "develop", "test"})// 设置 dev test 环境开启
    public SqlExplainInterceptor sqlExplainInterceptor() {
        //启用执行分析插件
        SqlExplainInterceptor sqlExplainInterceptor = new SqlExplainInterceptor();
        return sqlExplainInterceptor;
    }


    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }
}
