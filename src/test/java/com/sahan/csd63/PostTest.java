package com.sahan.csd63;

import com.sahan.csd63.model.Post;
import com.sahan.csd63.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class PostTest {

    //Arrange
    @Autowired
    private PostService postService;

    private int expected = 6;

    @Test
    public void getPostTest(){
        //Act
        List<Post> postList= postService.getAllPosts();
        int actual = postList.size();

        //Assert
       Assertions.assertEquals(expected,actual);

    }


}
