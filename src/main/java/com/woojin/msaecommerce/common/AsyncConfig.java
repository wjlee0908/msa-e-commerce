package com.woojin.msaecommerce.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 비동기 메소드 설정
 */
@Configuration
public class AsyncConfig {

    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10); // 코어 스레드 풀 크기 설정. 즉시 실행할 스레드 개수.
        executor.setMaxPoolSize(20); // 큐가 가득 찬 경우 쓰레드 추가 생성
        executor.setQueueCapacity(500); // 작업 큐 용량 설정
        executor.setThreadNamePrefix("AsyncThread-"); // 스레드 이름 접두사 설정

        // 작업 완료 후 스레드 풀 종료될 때 까지 대기할 시간
        executor.setAwaitTerminationSeconds(60);

        executor.initialize();
        return executor;
    }
}
