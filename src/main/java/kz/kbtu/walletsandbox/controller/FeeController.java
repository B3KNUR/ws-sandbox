package kz.kbtu.walletsandbox.controller;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Positive;
import kz.kbtu.walletsandbox.dto.response.FeeResponse;
import kz.kbtu.walletsandbox.mapper.WalletMapper;
import kz.kbtu.walletsandbox.service.WalletService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/fees")
public class FeeController {
    private final WalletService walletService;
    private final WalletMapper walletMapper;

    public FeeController(WalletService walletService, WalletMapper walletMapper) {
        this.walletService = walletService;
        this.walletMapper = walletMapper;
    }

    @GetMapping
    public FeeResponse calculate(@RequestParam @Positive @Digits(integer = 15, fraction = 2) BigDecimal amount) {
        BigDecimal fee = walletService.calculateFee(amount);
        return walletMapper.toFeeResponse(amount, fee);
    }
}
