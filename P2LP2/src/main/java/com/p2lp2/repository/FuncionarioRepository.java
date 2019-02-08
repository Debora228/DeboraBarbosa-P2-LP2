package com.p2lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p2lp2.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
