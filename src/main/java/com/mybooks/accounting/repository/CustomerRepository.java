package com.mybooks.accounting.repository;

import com.mybooks.accounting.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Request, Long> {
}
