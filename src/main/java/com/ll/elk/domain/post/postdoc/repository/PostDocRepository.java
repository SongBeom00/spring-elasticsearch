package com.ll.elk.domain.post.postdoc.repository;

import com.ll.elk.domain.post.postdoc.document.PostDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PostDocRepository extends ElasticsearchRepository<PostDoc,String> {
    List<PostDoc> findByTitle(String keyword);
}
