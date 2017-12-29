package com.cg.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.notification.Notification;
import com.cg.notification.RecipientType;
import com.cg.notification.repo.NotificationRepo;

@Service
public class NotificationServiceimpl implements NotificationService {

	@Autowired
	private NotificationRepo notificationRepo;

	@Override
	public Notification saveNotification(Notification notification) {
		// TODO all business logic goes here
		return notificationRepo.saveNotification(notification);
	}

	@Override
	public Notification updateNotification(Notification notification) {
		// TTODO all business logic goes here
		return notificationRepo.updateNotification(notification);
	}

	@Override
	public List<Notification> getAllNotification() {
		// TODO all business logic goes here
		return notificationRepo.getAllNotification();
	}

	@Override
	public Notification getNotificationById(String id) {
		// TODO all business logic goes here
		return notificationRepo.getNotificationById(id);
	}

	@Override
	public List<Notification> getByRecipientId(String recipientId) {
		return notificationRepo.getByRecipientId(recipientId);
	}

	@Override
	public List<Notification> getByRecipientType(RecipientType type) {
		// TODO Auto-generated method stub
		return notificationRepo.getByRecipientType(type);
	}
}