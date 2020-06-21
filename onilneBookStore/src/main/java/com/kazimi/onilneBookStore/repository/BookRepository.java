package com.kazimi.onilneBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kazimi.onilneBookStore.entity.Book;;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
