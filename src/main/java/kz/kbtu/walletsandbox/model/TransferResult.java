package kz.kbtu.walletsandbox.model;

import java.math.BigDecimal;

public record TransferResult(
        Wallet from,
        Wallet to,
        BigDecimal amount,
        BigDecimal fee
) {}
