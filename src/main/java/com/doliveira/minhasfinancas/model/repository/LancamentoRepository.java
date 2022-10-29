package com.doliveira.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doliveira.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
