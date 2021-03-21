package com.xzinoviou.academia.backoffice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;


/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Configuration
public class RedisConfig {

//    @Bean
//    JedisConnectionFactory jedisConnectionFactory() {
//        RedisStandaloneConfiguration redisStandaloneConfiguration =
//                new RedisStandaloneConfiguration();
//        return new JedisConnectionFactory(redisStandaloneConfiguration);
//    }
//
//    @Bean
//    RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//        return redisTemplate;
//    }
}