package com.codegym.orm.image.controller;
import com.codegym.orm.image.model.Feedback;
import com.codegym.orm.image.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
@Controller
public class FeedbackController {
    @Autowired
    private FeedbackRepository feedbackRepository;
    @GetMapping("/")
    public String index(Model model) {
        // Gọi API của NASA và lấy bức ảnh của ngày
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://api.nasa.gov/planetary/apod?api_key=YOUR_API_KEY";
        NASAImageResponse response = restTemplate.getForObject(apiUrl, NASAImageResponse.class);
        model.addAttribute("nasaImage", response.getUrl());

        // Hiển thị danh sách feedback
        model.addAttribute("feedbacks", feedbackRepository.findAll());

        return "index";
    }

    @PostMapping("/submitFeedback")
    public String submitFeedback(Feedback feedback) {
        // Lưu feedback vào cơ sở dữ liệu
        feedbackRepository.save(feedback);
        return "redirect:/";
    }
}
