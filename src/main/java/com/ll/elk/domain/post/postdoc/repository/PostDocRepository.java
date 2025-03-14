package com.ll.elk.domain.post.postdoc.repository;

import com.ll.elk.domain.post.postdoc.document.PostDoc;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PostDocRepository extends ElasticsearchRepository<PostDoc, String> {
    List<PostDoc> findByTitleContainingOrContent(String keyword, String keyword2);

    @Query("""
         {
             "bool": {
                 "should": [
                     {
                         "match": {
                             "title": "?0"
                         }
                     },
                     {
                         "match": {
                             "content": "?0"
                         }
                     }
                 ]
             }
         }
     """)
    List<PostDoc> searchByKeyword(String keyword);
}
