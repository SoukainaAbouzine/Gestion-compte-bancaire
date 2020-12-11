package com.banq.dao;





import org.springframework.data.jpa.repository.JpaRepository;

import com.banq.entity.Operations;

public interface OperationRepository extends JpaRepository<Operations, Long>{
	//@Query("select o from Operation o where o.compte.codeCompte=:x")
	//public Page<Operations> listOperation(@Param("x")String codeCpte,Pageable pageable);
//	public Page<Operations>ListOperation (Pageable pageable);
	
	
}
