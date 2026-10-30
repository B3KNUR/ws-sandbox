package kz.kbtu.walletsandbox.app;

import java.math.BigDecimal;

public interface CommissionCalculator {
    BigDecimal calculate(BigDecimal amount);
}