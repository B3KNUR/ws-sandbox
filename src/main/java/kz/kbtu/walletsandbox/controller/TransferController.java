package kz.kbtu.walletsandbox.controller;

import jakarta.validation.Valid;
import kz.kbtu.walletsandbox.dto.request.TransferRequest;
import kz.kbtu.walletsandbox.dto.response.TransferResponse;
import kz.kbtu.walletsandbox.mapper.WalletMapper;
import kz.kbtu.walletsandbox.service.WalletService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transfers")
public class TransferController {
    private final WalletService walletService;
    private final WalletMapper walletMapper;

    public TransferController(WalletService walletService, WalletMapper walletMapper) {
        this.walletService = walletService;
        this.walletMapper = walletMapper;
    }

    @PostMapping
    public TransferResponse transfer(@Valid @RequestBody TransferRequest request) {
        return walletMapper.toTransferResponse(walletService.transfer(
                request.fromWalletId(),
                request.toWalletId(),
                request.amount()
        ));
    }
}