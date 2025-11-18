package org.example.spingbootquickstat.controller;
import org.example.spingbootquickstat.Service.MailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/sendMail")
    public String sendMail() {
        mailService.sendSimpleMail("3164152900@qq.com", "测试邮件", "这是一封来自 Spring Boot 3.0.2 的测试邮件！");
        return "邮件已发送";
    }
}
