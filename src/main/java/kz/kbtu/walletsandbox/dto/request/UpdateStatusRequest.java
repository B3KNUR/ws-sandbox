package kz.kbtu.walletsandbox.dto.request;

import jakarta.validation.constraints.NotNull;
import kz.kbtu.walletsandbox.enums.WalletStatus;

public record UpdateStatusRequest(

        @NotNull(message = "{wallet.status.required}")
        WalletStatus status
) {}