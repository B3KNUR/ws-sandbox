package kz.kbtu.walletsandbox.web.dto.response;

import kz.kbtu.walletsandbox.domain.WalletStatus;

import java.math.BigDecimal;
import java.time.Instant;

public record WalletResponse(
        Long id,
        Long userId,
        String currency,
        BigDecimal balance,
        WalletStatus status,
        Instant createdAt) {}