package com.codegym.blogapp.restcontroller;

import com.codegym.blogapp.dto.req.BlogReqDTO;
import com.codegym.blogapp.dto.res.BlogResDTO;
import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.model.Category;
import com.codegym.blogapp.service.BlogService;
import com.codegym.blogapp.service.ImplBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blogs")       // GET POST PUT PATCH DELETE
public class BlogAPIController {


    private final ImplBlogService blogService;

    public BlogAPIController(ImplBlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public ResponseEntity<?> showBlogs(){
        List<BlogResDTO> blogList = blogService.findAllBlogs();
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
    @PostMapping("/update")
    public ResponseEntity<?> saveBlog(@ModelAttribute Blog blog){
        BlogResDTO blogResDTO = blogService.saveBlogReqDTO(blog);
        return new ResponseEntity<>(blogResDTO, HttpStatus.OK);
    }
    @DeleteMapping("/del")
    public ResponseEntity<?> deleteBlog(@RequestParam Long id){
        blogService.deleteById(id);
        return new ResponseEntity<>("XOA THANH CONG", HttpStatus.OK);
    }

    /**
     * Find Clog by Id
     * @param id Find ID
     * @return return
     */
    @GetMapping("/find")
    public ResponseEntity<?> findById(@RequestParam("id") Long id){
        List<BlogResDTO> blogs = blogService.findBlogById(id);
        return new ResponseEntity<>(blogs, HttpStatus.FOUND);
    }
}
