package com.cg.module4.dictionary.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private final Map<String, String> dictionary = new HashMap<>();
    public DictionaryController(){
        dictionary.put("hello", "Xin chào");
        dictionary.put("world", "Thế giới");
    }
    @RequestMapping
    public String home(){
        return "index";
    }
    @RequestMapping(value = "/search" ,  method = RequestMethod.POST)
    public String search(@RequestParam String word, Model model){
        String meaning = dictionary.getOrDefault(word,"Không tìm thấy từ trong từ điển");
        model.addAttribute("word",word);
        model.addAttribute("meaning",meaning);
        return "result";
    }
}
