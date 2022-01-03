package com.spring.RealEstate.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.RealEstate.model.Register;

@Repository
public interface LoginRepository extends JpaRepository<Register, Long> {
	 @Query(value = "Select bl from Register bl where bl.username=?1")
	    Register getUserLogin(String username);
	    @Query(value = "Select bm from Register bm where bm.username=?1 and bm.password=?2")
	    Register findByUserNameAndPassword(String username,  String password);


}