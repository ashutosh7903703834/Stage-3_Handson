package com.cognizant.ormlearn.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
@Service
public class CountryService {
	@Autowired
	com.cognizant.ormlearn.repository.CountryRepository countryRepository;
	public CountryService() {
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
//		return null;
	}
	@Transactional
	public List<Country> findCountryLike(String name)
	{
		return countryRepository.findByNameContainingIgnoreCase(name);
	}
	@Transactional
	public List<Country> findCountryLikeasc(String name)
	{
		return countryRepository.findByNameContainingIgnoreCaseOrderByName(name);
	}
	@Transactional
	public List<Country> findCountryLikealp(char letter)
	{
		return countryRepository.findByNameStartingWithIgnoreCase(letter);
	}
}