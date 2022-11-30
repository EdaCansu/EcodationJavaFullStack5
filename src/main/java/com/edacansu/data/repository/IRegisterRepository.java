package com.edacansu.data.repository;


import com.edacansu.data.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRegisterRepository extends JpaRepository<RegisterEntity, Long> {

    //Email
    RegisterEntity findByEmailAddress(String emailAddress);
}
