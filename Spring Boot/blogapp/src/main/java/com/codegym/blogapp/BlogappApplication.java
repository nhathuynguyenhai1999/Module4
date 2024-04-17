package com.codegym.blogapp;

import com.codegym.blogapp.model.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BlogappApplication {

    public static void main(String[] args) {

        SpringApplication.run(BlogappApplication.class, args);
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
//        EntityManager em = emf.createEntityManager();
//
//        // Bước 1: Truy vấn danh mục
//        Query categoryQuery = em.createQuery("select c from Category c");
//        List<Category> categories = categoryQuery.getResultList();
//
//        // Bước 2: Phân trang bài viết
//        Query postQuery = em.createQuery("select p from Post p", Post.class);
//        postQuery.setFirstResult(0);
//        postQuery.setMaxResults(10);
//        List<Post> posts = postQuery.getResultList();
//
//        // Bước 3: Sắp xếp bài viết theo tiêu đề
//        Query sortedPostQuery = em.createQuery("select p from Post order by p.title", Post.class);
//        List<Post> sortedPosts = sortedPostQuery.getResultList();
//
//        // Bước 4: Thực hiện join
//        Query joinQuery = em.createQuery("select p from Post p join fetch p.category", Post.class);
//        List<Post> postWithCategory = joinQuery.getResultList();
//
//        em.close();
//        emf.close();
    }

}
