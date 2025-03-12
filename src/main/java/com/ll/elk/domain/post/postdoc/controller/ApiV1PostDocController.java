package com.ll.elk.domain.post.postdoc.controller;

import com.ll.elk.domain.post.postdoc.document.PostDoc;
import com.ll.elk.domain.post.postdoc.service.PostDocService;
import com.ll.elk.global.rsdata.RsData;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/postsDocs")
public class ApiV1PostDocController {
    private final PostDocService postDocService;


    @PostMapping("/write")
    public RsData<PostDoc> write(@Valid @RequestBody PostDocWriteRequest writeRequest) {
        PostDoc postDoc = postDocService.write(writeRequest.title, writeRequest.content);
        return new RsData<>("201", "게시글이 생성되었습니다.",postDoc);
    }


    record PostDocWriteRequest(@NotBlank String title,
                               @NotBlank String content) {

    }

    @GetMapping("/search")
    public List<PostDoc> search(@RequestParam("keyword") String keyword){
        return postDocService.searchByKeyword(keyword);

    }

}
