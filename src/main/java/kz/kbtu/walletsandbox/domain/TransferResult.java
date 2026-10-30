package kz.kbtu.walletsandbox.domain;

import java.math.BigDecimal;

public record TransferResult(
        Wallet from,
        Wallet to,
        BigDecimal amount,
        BigDecimal fee
) {}
