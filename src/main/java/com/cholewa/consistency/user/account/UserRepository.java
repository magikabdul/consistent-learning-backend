package com.cholewa.consistency.user.account;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Transactional
@Component
public interface UserRepository extends CrudRepository<User, Long> {

}
