package kz.kbtu.walletsandbox.dto.response;

import kz.kbtu.walletsandbox.enums.WalletStatus;

import java.math.BigDecimal;
import java.time.Instant;

public record WalletResponse(
        Long id,
        Long userId,
        String currency,
        BigDecimal balance,
        WalletStatus status,
        Instant createdAt) {}