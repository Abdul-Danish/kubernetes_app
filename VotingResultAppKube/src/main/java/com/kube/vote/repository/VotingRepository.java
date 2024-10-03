package com.kube.vote.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kube.vote.model.Vote;

@Repository
public interface VotingRepository extends MongoRepository<Vote, String> {

}
