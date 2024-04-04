package com.cg.module4.dictionary.Controller;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
public class DictionaryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Xử lý dữ liệu gửi từ form
        String word = req.getParameter("word");
        String meaning = getMeaningFromDictionary(word);// Hàm này trả về nghĩa của từ
        // Gửi kết quả về client
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Dictionary Result<title><head><body>");
        out.println("<h1>Result for " + word + ":<h1>");
        out.println("<p>Meaning: " + meaning + "</p>");
        out.println("<body><html>");
        out.close();
//        super.doPost(req, resp);
    }
    private String getMeaningFromDictionary(String word){
        // Logic để lấy nghĩa của từ từ từ điển
        // Đây là ví dụ, bạn cần thay thế bằng logic thực tế
        return "Nghĩa của từ " + word + "là...";
    }
}