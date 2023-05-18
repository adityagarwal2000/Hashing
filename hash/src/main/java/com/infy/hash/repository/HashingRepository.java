package com.infy.hash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.infy.hash.entity.HashTable;


public interface HashingRepository extends CrudRepository<HashTable, Integer> {
	@Query("Select a from HashTable a where a.hashcodeMurmur=NULL or a.hashcode64=NULL")
	public List<HashTable> findByHash();
}
