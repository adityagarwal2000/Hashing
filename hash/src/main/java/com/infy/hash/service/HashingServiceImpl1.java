package com.infy.hash.service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;
import com.infy.hash.entity.HashTable;
import com.infy.hash.repository.HashingRepository;

@Service(value="hashingService1")
@Transactional
public class HashingServiceImpl1 implements HashingService {

	
	@Autowired
	HashingRepository hashingRepository;
	
	@Override
	public void generateHash() {
		
		List<HashTable> list=hashingRepository.findByHash();
		for(HashTable i : list) {
			List<String> list1 = new ArrayList<String>();
			int finalHash=0;
			int seed=12345;
			if(i.getCountry()==null)
				list1.add("");
			else
				list1.add(i.getCountry());
			if(i.getState()==null)
				list1.add("");
			else
				list1.add(i.getState());
			if(i.getProject()==null)
				list1.add("");
			else
				list1.add(i.getProject());
	        for(int it=0; it<list1.size(); it++) {
	            byte[] bytes=list1.get(it).getBytes(StandardCharsets.UTF_8);
	            finalHash^=Hashing.murmur3_32(seed+it).hashBytes(bytes).asInt();
	        }
			i.setHashcodeMurmur(Integer.toHexString(finalHash));
		}
	}
}
