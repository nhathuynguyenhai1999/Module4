package com.codegym.module4.springconfigemail.Service;
import com.codegym.module4.springconfigemail.Model.EmailConfig;
public interface EmailConfigService {
    EmailConfig getEmailConfig();
    void saveEmailConfig(EmailConfig emailConfig);
}
