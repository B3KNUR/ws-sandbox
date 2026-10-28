package kz.kbtu.walletsandbox.service;

import java.math.BigDecimal;

public interface CommissionCalculator {
    BigDecimal calculate(BigDecimal amount);
}