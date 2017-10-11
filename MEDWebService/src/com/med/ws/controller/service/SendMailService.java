package com.med.ws.controller.service;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.common.contants.Constants;

@Service
@Transactional
public class SendMailService {

	// @Autowired
	// EmailDAO emailDao;

	// private static final Logger log = LogManager.getLogger(Email.class);

	public Boolean send(String submitName, String submitEmail, String submitMessage, String submitSubject) throws MessagingException {

//		String submitName = "NAME";
//		String submitEmail = "test@test.test";
//		String submitMessage = "This is the message";
		Authenticator auth = null;
		Transport transport = null;
		Session session = null;
		Message message = null;
		Address toAddress = null;

		Properties props = new Properties();
		props.put(Constants.EMAIL.CONFIG.PROTOCOL, Constants.EMAIL.VALUE.PROTOCOL);
		props.setProperty(Constants.EMAIL.CONFIG.HOST, Constants.EMAIL.VALUE.HOST);
		props.setProperty(Constants.EMAIL.CONFIG.AUTH, Constants.EMAIL.VALUE.AUTH);
		props.setProperty(Constants.EMAIL.CONFIG.SSL, Constants.EMAIL.VALUE.SSL);
		props.setProperty(Constants.EMAIL.CONFIG.PORT, Constants.EMAIL.VALUE.PORT);

		try {
			auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("test@test.test", "testpassword");
				}
			};
		} catch (Exception e) {
			// TODO: error on authentication email
			return false;
		}

		try {
			session = Session.getInstance(props, auth);
			// session.setDebug(true);
			message = new MimeMessage(session);
			message.setSubject(submitSubject);
			message.setText(submitName + "; " + submitMessage);
			toAddress = new InternetAddress(submitEmail);
			message.setRecipient(Message.RecipientType.TO, toAddress);
		} catch (Exception e) {
			// TODO: error on prepare email
			return false;
		}
		;

		try {
			transport = session.getTransport(Constants.EMAIL.VALUE.PROTOCOL);
			transport.connect(Constants.EMAIL.VALUE.HOST, "test@test.test", "testpassword");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			return true;
		} catch (Exception e) {
			// TODO: error on send email
			return false;
		} finally {
			transport.close();
		}
	}
}