package org.example.spingbootquickstat.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleMail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2711586824@qq.com"); // 发件人
        message.setTo(to);                // 收件人
        message.setSubject(subject);      // 主题
        message.setText(text);            // 内容
        mailSender.send(message);
    }
}
