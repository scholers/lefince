package com.lefince.web;

import com.lefince.manager.MailManager;
import com.lefince.util.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.UnsupportedEncodingException;

/**
 * Created by cuizhixiang on 2017/5/26.
 **/
@RestController
public class MailController {

    @Autowired
    private MailManager mailManager;

    /**
     * 发送邮件
     */
    @RequestMapping("/email")
    public void sendMail(){
        String emailMsg = "测试发送邮件";
        try{
            //mailManager.sendMail("2890657914@qq.com", emailMsg);
            MailService.sendHtmlMail("scholers@163.com","邮件发送测试","<a href='www.baidu.com' >百度一下</a>");
            //mailUtil.sendMail("2890657914@qq.com","邮件发送测试","<a href='www.baidu.com' >百度一下</a>");
        } catch(AddressException e) {
            e.printStackTrace();
        } catch(MessagingException e) {
            e.printStackTrace();
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}
