package kz.zhelezyaka.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kz.zhelezyaka")
public class AppConfig {
    @Bean
    public MessageRenderer messageRenderer() {
        return new MessageRendererErrorImpl(message());
    }

    @Bean
    public Message message() {
        return new HelloMessage("This is Configuration!");
    }
}
