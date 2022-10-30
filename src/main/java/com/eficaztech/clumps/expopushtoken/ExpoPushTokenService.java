package com.eficaztech.clumps.expopushtoken;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpoPushTokenService {

    private final ExpoPushTokenRepository expoPushTokenRepository;

    public List<ExpoPushToken> findAll() { return expoPushTokenRepository.findAll(); }
    public ExpoPushToken save(ExpoPushToken expoPushToken) {
        return expoPushTokenRepository.save(expoPushToken);
    }

}
