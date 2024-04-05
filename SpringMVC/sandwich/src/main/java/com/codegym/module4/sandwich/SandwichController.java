package com.codegym.module4.sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {
    // Danh sách các gia vị cho sandwich (có thể thay đổi tùy theo nhu cầu)
    private static final List<String> SPICES = new ArrayList<>();
    static {
        SPICES.add("Mayonnaise");
        SPICES.add("Mustard");
        SPICES.add("Ketchup");
        SPICES.add("Lettuce");
        SPICES.add("Tomato");
        SPICES.add("Onion");
        // Thêm các gia vị khác nếu cần
    }
    // Xử lý yêu cầu GET để hiển thị form chọn gia vị
    @RequestMapping(value = "/chooseSpices", method = RequestMethod.GET)
    public String showSpicesForm(Model model) {
        model.addAttribute("spices", SPICES);
        return "spices-form";
    }
    // Xử lý yêu cầu POST để xử lý việc lựa chọn gia vị
    @RequestMapping(value = "/chooseSpices", method = RequestMethod.POST)
    public String processSpicesForm(@RequestParam(value = "selectedSpices", required = false) List<String> selectedSpices, Model model) {
        if (selectedSpices != null) {
            model.addAttribute("selectedSpices", selectedSpices);
        }
        return "selected-spices";
    }
    @RequestMapping("/save")
    public String save(@RequestParam("condiment")String[] condiments){
        // Xử lý danh sách các gia vị đã được chọn
        for(String condiment: condiments){
            System.out.println("Selected condiment:" + condiment);
            // Thực hiện lưu trữ vào cơ sở dữ liệu, xử lý logic, v.v.
        }
        // Redirect hoặc trả về view tùy thuộc vào yêu cầu của ứng dụng
        // Điều hướng đến trang thành công
        return "redirect:/success";
    }
}