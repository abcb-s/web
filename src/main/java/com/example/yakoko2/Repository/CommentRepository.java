package com.example.yakoko2.Repository;



import com.example.yakoko2.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Custom query methods (필요한 경우 추가)
}