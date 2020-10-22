package com.isageek.blaztek.day14.laba.repo;

import com.isageek.blaztek.day14.laba.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
}
