package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User.Registration.RegistrationToken;

import com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfirmTokenRepository confirmTokenRepository;

    public void saveConfirmationToken(ConfirmationToken token){
        confirmTokenRepository.save(token);
    }
    public Optional<ConfirmationToken> getToken(String token) {
        return confirmTokenRepository.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return confirmTokenRepository.updateConfirmedAt(
                token, LocalDateTime.now());
    }
}
