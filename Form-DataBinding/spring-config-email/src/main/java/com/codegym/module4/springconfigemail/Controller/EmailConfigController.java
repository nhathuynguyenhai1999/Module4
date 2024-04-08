package com.codegym.module4.springconfigemail.Controller;
import com.codegym.module4.springconfigemail.Model.EmailConfig;
import com.codegym.module4.springconfigemail.Service.EmailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EmailConfigController {
    @Autowired
    private EmailConfigService emailConfigService;
    private final EmailConfig emailConfig = new EmailConfig();// Khởi tạo cấu hình email
    @GetMapping("/config")
    public String saveConfig(Model model){
        model.addAttribute("emailConfig", emailConfig);
        return "config-form";
    }
    @PostMapping("/config")
    public String saveConfig(EmailConfig emailConfig){
        this.emailConfig.setPageSize(emailConfig.getPageSize());
        // Ở đây bạn có thể lưu cấu hình vào cơ sở dữ liệu hoặc nơi lưu trữ khác
        return "redirect:/config";
    }
}
