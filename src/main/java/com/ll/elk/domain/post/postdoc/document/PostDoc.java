package com.ll.elk.domain.post.postdoc.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName="app1_posts",createIndex = true)
@Setting(settingPath = "elasticsearch/settings.json")
@Mapping(mappingPath = "elasticsearch/mappings.json")
@Data
@Builder
public class PostDoc {
    @Id
    private String id;
    private String title;
    private String content;
}
