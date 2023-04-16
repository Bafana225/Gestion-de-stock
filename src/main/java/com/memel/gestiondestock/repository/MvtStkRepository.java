package com.memel.gestiondestock.repository;

import com.memel.gestiondestock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<Integer, MvtStk> {
}
