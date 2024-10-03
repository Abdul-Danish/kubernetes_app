package com.kube.vote.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document("votes")
public class Vote {

    @Id
    private String id;
    private Animal animal;
    
}

