package kz.kbtu.walletsandbox.domain.exception;

public class WalletAlreadyExistsException extends RuntimeException {

    private final Long existingWalletId;

    public WalletAlreadyExistsException(Long userId, String currency, Long existingWalletId) {
        super("User with id " + userId + " already has an open " + currency + " wallet");
        this.existingWalletId = existingWalletId;
    }

    public Long getExistingWalletId() {
        return existingWalletId;
    }
}