package kz.kbtu.walletsandbox.repository;

import kz.kbtu.walletsandbox.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

    List<Wallet> findByUserId(Long id);
}
