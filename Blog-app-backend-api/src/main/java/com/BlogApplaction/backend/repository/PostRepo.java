package com.BlogApplaction.backend.repository;

import com.BlogApplaction.backend.entities.Category;
import com.BlogApplaction.backend.entities.Post;
import com.BlogApplaction.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {

    // find all post don by user
    List<Post> findByUser(User user);

    // find all post according Ctegary
    List<Post> findByCategory(Category category);


    @Query("select p from Post p where p.title like :key")
    List<Post> searchByTitle(@Param("key") String title);


}
