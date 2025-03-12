package com.ll.elk.domain.post.postdoc.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="app1_posts")
@Data
@Builder
public class PostDoc {
    @Id
    private String id;
    private String title;
    private String content;
}
