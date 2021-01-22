package com.valitov.vueback.redis.listener;


import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ChannelPublisher {

	private final ReactiveRedisOperations<String, String> redisOperations;

	public ChannelPublisher(ReactiveRedisOperations<String, String> redisOperations) {
		this.redisOperations = redisOperations;
	}

	public Mono<Long> convertAndSend(String destination, String message) {
		return redisOperations.convertAndSend(destination, message);
	}

}
