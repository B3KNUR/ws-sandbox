package kz.kbtu.walletsandbox.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.math.BigDecimal;

@ConditionalOnProperty(prefix = "wallet", name = "commission-enabled", havingValue = "false", matchIfMissing = true)
public class ZeroCommissionCalculator implements CommissionCalculator {

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        return BigDecimal.ZERO;
    }
}
