
package com.example.banking.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
