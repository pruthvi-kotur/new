package com.mappings.Service;

import com.mappings.Repository.CommentsRepository;
import com.mappings.Repository.PostRepository;
import com.mappings.entity.Comments;
import com.mappings.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

    private CommentsRepository commentsRepository;
    private PostRepository postRepository;

    public CommentsService(CommentsRepository commentsRepository, PostRepository postRepository)
    {
        this.commentsRepository = commentsRepository;
        this.postRepository = postRepository;
    }

    public Comments newcomment(long postid, Comments comment) {
        Post post= postRepository.findById(postid).get();
        comment.setPost(post);
        Comments saved = commentsRepository.save(comment);
        return saved;

    }
}
