package com.cg.notification;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cg.notification.repo.NotificationRepo;
import com.cg.notification.service.NotificationService;
import com.cg.notification.service.NotificationServiceimpl;

@RunWith(MockitoJUnitRunner.class)
public class NotificationServiceMockTest {

	@Mock
	NotificationRepo notificationRepo;

	@InjectMocks
	NotificationService notificationService = new NotificationServiceimpl();

	@Test
	public void testGetById() {
		when(notificationRepo.getNotificationById("15")).thenReturn(null);
		assertEquals(null, notificationService.getNotificationById("15"));
	}
}
