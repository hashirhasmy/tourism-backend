package com.sahan.csd63.service;

import com.sahan.csd63.dao.PostRepository;
import com.sahan.csd63.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Optional<Post> getPostByID(int id){
        return postRepository.findById(id);
    }

    public int addPost(Post post){
        if(post != null){
            postRepository.save(post);
            return 1;
        } else {
            return -1;
        }
    }

//    public int updatePost(Post upd_post){
//        if(upd_post != null){
//
//            //Post post = postRepository.findById(upd_post.getId()).get();
//            postRepository.save(upd_post);
//            return 1;
//        } else {
//            return -1;
//        }
//    }

    public int updatePost(Post post){
        if(post != null){
            if(postRepository.findById(post.getId()).isPresent()) {
                postRepository.save(post);
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }


//    public int deletePost(int id){
//        //please do proper validations.
//      if(id > 0){
//          postRepository.deleteById(id);
//          return 1;
//      } else{
//          return -1;
//      }
//    }

    public int deletePost(int id){
        if(postRepository.findById(id).isPresent()){
            postRepository.deleteById(id);
            return 1;
        }

        return -1;
    }


}
