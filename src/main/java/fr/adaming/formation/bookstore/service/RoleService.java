package fr.adaming.formation.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.bookstore.model.Role;

import fr.adaming.formation.bookstore.repository.IRoleRepository;
@Service
public class RoleService implements IRoleService{
	@Autowired 
	IRoleRepository roleRepository;

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public Role getOneRole(long id) {
		Optional<Role> RoleOptional = roleRepository.findById(id);
		Role role = new Role();
		if (RoleOptional.isPresent()) {
			role = RoleOptional.get();
			
		}
		
		return role;
	}

	@Override
	public void deleteRole(long id) {
		roleRepository.deleteById(id);
		
	}

	@Override
	public List<Role> getAllRole() {
		return  roleRepository.findAll();
	}

	@Override
	public Boolean deleteById(long id) {
		try {
		      roleRepository.deleteById(id); 
			} catch (Exception e) {
				return false;
			}
			return true;
			}


}
