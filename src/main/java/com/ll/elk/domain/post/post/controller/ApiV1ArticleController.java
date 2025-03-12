package com.ll.elk.domain.post.post.controller;

import com.ll.elk.domain.post.post.entity.Post;
import com.ll.elk.domain.post.post.service.PostService;
import com.ll.elk.global.rsdata.RsData;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class ApiV1ArticleController {
    private final PostService postService;

//    @PostMapping("/write")
//    public String write(){
//        postService.write("테스트 제목","테스트 내용");
//        return "작성 완료";
//    }

    @PostMapping("/write")
    public RsData<Post> write(@RequestBody @Valid PostWriteRequest writeRequest) {
        Post post = postService.write(writeRequest.title, writeRequest.content);
        return new RsData("201", "게시글이 생성되었습니다.", post);
    }


    record PostWriteRequest(@NotBlank String title,
                               @NotBlank String content) {

    }

}
