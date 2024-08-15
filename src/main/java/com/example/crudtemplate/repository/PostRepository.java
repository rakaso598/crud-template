package com.example.crudtemplate.repository;

import com.example.crudtemplate.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
