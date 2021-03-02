package com.gustavo.salesystemapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.salesystemapi.domain.Categoria;
import com.gustavo.salesystemapi.repositories.CategoriaRepository;
import com.gustavo.salesystemapi.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

		public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
			
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
}
