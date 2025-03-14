package com.ll.elk.domain.post.postdoc.service;

import com.ll.elk.domain.post.postdoc.document.PostDoc;
import com.ll.elk.domain.post.postdoc.repository.PostDocRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostDocService {
    private final PostDocRepository postDocRepository;

    public PostDoc write(String title,String content) {
        PostDoc postDoc = PostDoc.builder()
                .title(title)
                .content(content)
                .build();
        return postDocRepository.save(postDoc);
    }

    public void truncate() {
        postDocRepository.deleteAll();
    }

    public List<PostDoc> searchByKeyword(String keyword) {
        return postDocRepository.searchByKeyword(keyword);
    }
}
