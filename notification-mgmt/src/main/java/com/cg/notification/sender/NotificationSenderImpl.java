package com.cg.notification.sender;

import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

import com.cg.notification.Notification;

@Service
public class NotificationSenderImpl extends AbstractNotificationSender<Notification> {

	@Override
	public CompletableFuture<String> sendEmailNotification(Notification t) {
		System.err.println("In send email ");
		CompletableFuture<String> future = new CompletableFuture<>();
		try {
			Thread.sleep(2000);
			future.complete("sent email from future");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("sent email ");
		return future;
	}

	@Override
	public CompletableFuture<String> sendSmsNotification(Notification t) {
		System.err.println("In send sms ");
		CompletableFuture<String> future = new CompletableFuture<>();
		try {
			Thread.sleep(3000);
			future.complete("");
			future.complete("sent sms from future");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("sent sms ");
		return future;
	}

}
