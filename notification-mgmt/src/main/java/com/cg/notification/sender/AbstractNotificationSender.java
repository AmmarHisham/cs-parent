package com.cg.notification.sender;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.cg.notification.Notification;

public abstract class AbstractNotificationSender<T extends Notification> implements NotificationSender<Notification> {

	private void logMessage(CompletableFuture<String> message) {
		try {
			System.err.println(message.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	private void logMessage(String message) {
		System.err.println(message);
	}

	private void sendEmail(Notification notification) {
		System.err.println("b4 sending email");
		CompletableFuture.supplyAsync(() -> sendEmailNotification(notification)).thenAccept(s -> {
			logMessage(s);
		});
		System.err.println("after sending email");
	}

	private void sendSms(Notification notification) {
		System.err.println("b4 sending sms");
		CompletableFuture.supplyAsync(() -> sendSmsNotification(notification)).thenAccept(s -> {
			logMessage(s);
		});
		System.err.println("after sending sms");
	}

	private void sendEmailAndSms(Notification notification) {
		System.err.println("b4 sending email/sms");
		CompletableFuture<String> futureA = sendEmailNotification(notification);
		CompletableFuture<String> futureB = sendSmsNotification(notification);
		futureA.thenCombine(futureB, (a, b) -> {
			logMessage(a);
			logMessage(b);
			return null;
		});
		System.err.println("after sending email/sms");
	}

	@Override
	public final void sendNotification(Notification notification) {
		System.out.println("From notification sender \n\n\n" + notification);
		switch (notification.getRecipientType()) {
		case EMAIL:
			sendEmail(notification);
			break;
		case SMS:
			sendSms(notification);
			break;
		case EMAIL_SMS:
			sendEmailAndSms(notification);
			break;
		default:
			break;
		}
		System.err.println("after sending notification");
	}

}
