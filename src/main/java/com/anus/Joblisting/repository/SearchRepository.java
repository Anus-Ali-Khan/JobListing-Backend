package com.anus.Joblisting.repository;

import com.anus.Joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
