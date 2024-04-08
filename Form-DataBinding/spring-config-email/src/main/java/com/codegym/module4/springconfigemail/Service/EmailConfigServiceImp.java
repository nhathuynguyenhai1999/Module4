package com.codegym.module4.springconfigemail.Service;
import com.codegym.module4.springconfigemail.Model.EmailConfig;
import org.springframework.stereotype.Service;
@Service
public class EmailConfigServiceImp implements EmailConfigService {
    private EmailConfig emailConfig = new EmailConfig(); // Khởi tạo cấu hình email
    @Override
    public EmailConfig getEmailConfig() {
        return emailConfig;
    }
    @Override
    public void saveEmailConfig(EmailConfig emailConfig) {
        this.emailConfig.setPageSize(emailConfig.getPageSize());
        // Ở đây bạn có thể lưu cấu hình vào cơ sở dữ liệu hoặc nơi lưu trữ khác
    }
}
