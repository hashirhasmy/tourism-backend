package com.sahan.csd63.dao;

import com.sahan.csd63.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {

}
