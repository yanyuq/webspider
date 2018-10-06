package com.yqb.webspider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan(basePackages = "com.yqb.webspider.mapper")
public class WebspiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebspiderApplication.class, args);
    }
//
//    /**
//     * 自定义异步线程池
//     *
//     * @return
//     */
//    @Bean
//    public AsyncTaskExecutor taskExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setThreadNamePrefix("Anno-Executor");
//        executor.setMaxPoolSize(20);
//
//        // 设置拒绝策略
//        executor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
//            @Override
//            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//                // .....
//            }
//        });
//        // 使用预定义的异常处理类
//        // executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//
//        return executor;
//    }
}
