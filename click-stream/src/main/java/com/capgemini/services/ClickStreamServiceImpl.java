package com.capgemini.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.capgemini.config.RedisTemplateConnection;
import com.capgemini.config.UserUrl;

/**
 * @author dimehta
 *
 */
@Service
public class ClickStreamServiceImpl implements ClickStreamService {

StringRedisTemplate redisTemplate = RedisTemplateConnection.getConnection();

	@Override
	public void saveUrl(String userId, String userUrl) {
	
		HashOperations<String, String, String> hash = redisTemplate.opsForHash();
		
		Map<String, String> searchKye = new HashMap<>();
		Date date=new Date();
		String  timestam =date.toString();
		searchKye.put("userId", userId);
		searchKye.put("userUrl", userUrl);
		searchKye.put("timestam", date.toString());
		hash.putAll(userId, searchKye);
	}

	@Override
	public List<UserUrl> getByUserId() {
		redisTemplate.getExpire("aa");
		return null;
	}

	@Override
	public List<UserUrl> getAllUser() {
		
		return null;
	}

}
