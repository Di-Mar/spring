package ru.marunich.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.marunich.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

//    @Bean
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }

}
