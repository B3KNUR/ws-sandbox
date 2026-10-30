package kz.kbtu.walletsandbox.web.dto.response;

import java.math.BigDecimal;

public record FeeResponse(
        BigDecimal amount,
        BigDecimal fee,
        BigDecimal total
) {}
