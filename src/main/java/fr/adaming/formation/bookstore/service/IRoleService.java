package fr.adaming.formation.bookstore.service;

import java.util.List;


import fr.adaming.formation.bookstore.model.Role;

public interface IRoleService {

	public Role saveRole(Role role); //le save fait le update et le create
	public Role getOneRole(long id);
	public void  deleteRole(long id);
	public List<Role> getAllRole();
	public Boolean deleteById(long id);
}
