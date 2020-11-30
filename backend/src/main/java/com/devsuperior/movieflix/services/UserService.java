package com.devsuperior.movieflix.services;

import java.util.Optional;

import com.devsuperior.movieflix.dto.RoleDTO;
import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.dto.UserInsertDTO;
import com.devsuperior.movieflix.entities.Role;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.RoleRepository;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.services.exceptions.DatabaseException;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired
  private BCryptPasswordEncoder passwordEncoder;

  @Autowired
  private UserRepository repository;

  @Autowired
  private RoleRepository roleRepository;

  @Transactional(readOnly = true)
  public Page<UserDTO> findAllPaged(PageRequest pageRequest) {
    Page<User> list = repository.findAll(pageRequest);
    return list.map(x -> new UserDTO(x));
  }

  @Transactional(readOnly = true)
  public UserDTO findById(Long id) {
    Optional<User> obj = repository.findById(id);
    User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
    return new UserDTO(entity);
  }

  @Transactional
  public UserDTO insert(UserInsertDTO dto) {
    User entity = new User();
    copyDtotoEntity(dto, entity);
    entity.setPassword(passwordEncoder.encode(dto.getPassword()));
    entity = repository.save(entity);
    return new UserDTO(entity);
  }

  @Transactional
  public UserDTO update(Long id, UserDTO dto) {
    try {
      User entity = repository.getOne(id);
      copyDtotoEntity(dto, entity);
      entity = repository.save(entity);
      return new UserDTO(entity);
    } catch (Exception e) {
      throw new ResourceNotFoundException("Id not found " + id);
    }
  }

  public void delete(Long id) {
    try {
      repository.deleteById(id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException("Id not found " + id);
    } catch (DataIntegrityViolationException e) {
      throw new DatabaseException("Integrity violation");
    }
  }

  private void copyDtotoEntity(UserDTO dto, User entity) {
    entity.setName(dto.getName());
    entity.setEmail(dto.getEmail());

    entity.getRoles().clear();
    for (RoleDTO roleDTO : dto.getRoles()) {
      Role role = roleRepository.getOne(roleDTO.getId());
      entity.getRoles().add(role);
    }
  }

}
