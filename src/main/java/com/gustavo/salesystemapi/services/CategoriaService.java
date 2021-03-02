package com.gustavo.salesystemapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.salesystemapi.domain.Categoria;
import com.gustavo.salesystemapi.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

		public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
			
		return obj.orElse(null);
		}
}
