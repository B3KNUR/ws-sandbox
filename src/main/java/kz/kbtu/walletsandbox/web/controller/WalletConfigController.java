package kz.kbtu.walletsandbox.web.controller;

import kz.kbtu.walletsandbox.app.config.WalletProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wallet/config")
public class WalletConfigController {

    private final WalletProperties walletProperties;

    public WalletConfigController(WalletProperties walletProperties) {
        this.walletProperties = walletProperties;
    }

    @GetMapping
    public WalletProperties getConfig() {
        return walletProperties;
    }
}