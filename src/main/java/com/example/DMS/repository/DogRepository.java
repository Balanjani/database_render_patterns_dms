/**
 * 
 */
package com.example.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

/**
 * @author ${Balanjani Kamasani}
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {

	/**
	 * @param name
	 * @return
	 */
	List<Dog> findByName(String name);
}
