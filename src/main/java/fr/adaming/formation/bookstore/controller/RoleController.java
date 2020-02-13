package fr.adaming.formation.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.formation.bookstore.model.Etagere;
import fr.adaming.formation.bookstore.model.Role;
import fr.adaming.formation.bookstore.service.IEtagereService;
import fr.adaming.formation.bookstore.service.IRoleService;

@RestController
@RequestMapping("roles")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	@Autowired
	IRoleService roleService;

	@GetMapping
	public List<Role> getAll(){
		return roleService.getAllRole();
		
	}
	
	@GetMapping("{id}") //equivalent au /:id dans node, router.get/:id
	public Role getOne(@PathVariable long id) {   //id rempli dans l'url par le webservice 
		return roleService.getOneRole(id);		
	}
	

	
	@DeleteMapping("delete2/{id}")
	public Boolean deleteById(@PathVariable long id) {
		 return roleService.deleteById(id);
	}
	
	@PostMapping()
	public Role createRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}
	
	@PutMapping("{id}")
	public Role updateRole(@RequestBody Role role, @PathVariable long id) {
		return roleService.saveRole(role);
	}

}


