package com.dada.banking_project.repositories;

import com.dada.banking_project.models.CreditCardAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardAccountRepository extends JpaRepository<CreditCardAccount, Integer> {
}
