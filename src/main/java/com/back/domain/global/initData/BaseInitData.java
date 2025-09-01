package com.back.domain.global.initData;


import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class BaseInitData {
    private final PostService postService;

    @Bean
    ApplicationRunner initApplicationRunner() {
        return args -> {
            if(postService.count() > 0) return;

            Post post1 = postService.write("제목1", "내용1");
            Post post2 = postService.write("제목2", "내용2");
            Post post3 = postService.write("제목3", "내용3");
        };
    }
}
