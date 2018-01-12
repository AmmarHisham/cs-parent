package com.capgemini.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.capgemini.config.RedisTemplateConnection;
import com.capgemini.config.UserUrl;
import com.fasterxml.jackson.annotation.JsonFormat.Value;

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
		Date date = new Date();
		long tim = date.getTime();
		String key = userId + "-" + tim;
		if (userId == null || userId.isEmpty()) {
			System.out.println("HHHHHHHHHHHHHHHHHHHHHHH" + userId);
			searchKye.put("userId", userId);
			searchKye.put("userUrl", userUrl);
			searchKye.put("timestam", date.toString());
			hash.putAll(userUrl, searchKye);
		} else {
			searchKye.put("userId", userId);
			searchKye.put("userUrl", userUrl);
			searchKye.put("timestam", date.toString());
			hash.putAll(key, searchKye);
		}
	}

	@Override
	public List<UserUrl> getByUserId(String userId) {
		System.out.println("***********");

		Set<String> names = redisTemplate.keys(userId + "*");
		java.util.Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String s = it.next();
		}
		/*
		 * System.out.println(redisTemplate.dump(s));
		 * System.out.println(redisTemplate.boundHashOps("1"));
		 */

		return null;
	}

	@Override
	public List<UserUrl> getAllUser() {

		return null;
	}

}
