package com.cognizant.ormlearn.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

//1.1
public List<Country> findByNameContainingIgnoreCase(String name);
//1.2
public List<Country> findByNameContainingIgnoreCaseOrderByName(String name);
//1.3
public List<Country> findByNameStartingWithIgnoreCase(char ch);

}
