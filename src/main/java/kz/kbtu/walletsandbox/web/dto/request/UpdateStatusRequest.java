package kz.kbtu.walletsandbox.web.dto.request;

import jakarta.validation.constraints.NotNull;
import kz.kbtu.walletsandbox.domain.WalletStatus;

public record UpdateStatusRequest(

        @NotNull(message = "{wallet.status.required}")
        WalletStatus status
) {}