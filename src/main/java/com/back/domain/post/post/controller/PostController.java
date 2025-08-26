package com.back.domain.post.post.controller;

import com.back.domain.post.post.entitty.Post;
import com.back.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostService postService;

    @PostMapping("/write")
    @ResponseBody
    public Post write(@RequestParam("title") String title, @RequestParam("content") String content) {
        Post post = postService.write(title, content);
        return post;
    }

    @GetMapping("/posts/write")
    @ResponseBody
    public String wrtie() {
        return """
                <form action="/doWrite" target="_blank" method="POST">
                  <input type="text" name="title" placeholder="제목" value="안녕">
                  <br>
                  <textarea name="content" placeholder="내용">반가워</textarea>
                  <br>
                  <input type="submit" value="작성">
                </form>
                """;
    }
}
