package com.codegym.blogapp.service;

import com.codegym.blogapp.dto.req.BlogReqDTO;
import com.codegym.blogapp.dto.res.BlogResDTO;
import com.codegym.blogapp.exception.Messenger;
import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.repository.BlogRepository;
import com.codegym.blogapp.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BlogService implements ImplBlogService{

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<BlogResDTO> findAllBlogs(){
        // lay ra danh sach blog theo dang entity Blog
        List<Blog> blogs = blogRepository.findAll();

        // can chuyen doi ve dang danh sach BlogResDTO
        List<BlogResDTO> blogResDTOS = new ArrayList<>();
        for (Blog b : blogs) {
            blogResDTOS.add(b.toBlogResDTO());
        }
        return blogResDTOS;
    }
    public Blog findById(Long id){
        return blogRepository.findById(id).orElseThrow();
    }

    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public BlogResDTO saveBlogReqDTO(Blog blog) {
//
////        BlogReqDTO blogReqDTO = new BlogReqDTO();
//        CategoryResDTO resDTO = new CategoryResDTO();
//        Blog blog = new Blog();
//        Category category = categoryRepository.findCategoriesByNameAndIdNot(resDTO.getName(), resDTO.getId());
//
//        blogs.setTitle(blog.getTitle());
//        blogs.setCategory(category.toCategoryResDTO());

        blogRepository.save(blog);

        // can chuyen doi tu entity sang BlogResDTO
        return blog.toBlogResDTO();

    }

    public BlogResDTO updateBlogReqDTO(BlogReqDTO blogReqDTO){
        Optional<Blog> optionalBlog = blogRepository.findById(blogReqDTO.getCategoryId());
        if(optionalBlog.isPresent()) {
            Blog blog = optionalBlog.get();
            // Cập nhật thông tin của bài viết từ blogReqDTO
            blog.setTitle(blogReqDTO.getTitle());
//            blog.setId(blogReqDTO.getCategoryId());
            // Lưu lại thông tin cập nhật
            blogRepository.save(blog);

            // Trả về đối tượng BlogResDTO đã được cập nhật thông tin
            return blog.toBlogResDTO();
        } else {
            // Xử lý trường hợp bài viết không tồn tại
            // (ví dụ: ném ra một ngoại lệ hoặc trả về thông báo lỗi)
            // Ở đây mình sẽ trả về null để thể hiện bài viết không tồn tại
            return null;
        }
    }

    @Override
    public List<BlogResDTO> findBlogById(Long id) {

        Optional<Blog> blogs = blogRepository.findById(id);
        List<BlogResDTO> blogResDTOS = new ArrayList<>();
        if (blogs.isPresent()){

            blogResDTOS.add(blogs.get().toBlogResDTO());

        }else {
            System.out.println("Loi khi tim kiem!");
        }

        return blogResDTOS;
    }

    public void deleteById(Long id){
        Blog blog = blogRepository.findById(id).get();
        blogRepository.delete(blog);
    }
}
