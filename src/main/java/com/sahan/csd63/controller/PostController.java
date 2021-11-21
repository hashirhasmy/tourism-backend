package com.sahan.csd63.controller;

import com.sahan.csd63.model.Post;
import com.sahan.csd63.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts(){
       return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") int id){
        return postService.getPostByID(id).get(); //TODO:later availability checking
    }

    @PostMapping("/add")
    public int addPost(@RequestBody Post post){
        return postService.addPost(post);
    }

    @PutMapping("/update")
    public int updatePost(@RequestBody Post post){
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    public int deletePostById(@PathVariable("id") int id){
        return postService.deletePost(id);
    }

}
