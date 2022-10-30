package com.eficaztech.clumps.expopushtoken;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("expopushtoken")
@RequiredArgsConstructor
public class ExpoPushTokenController {

    private final ExpoPushTokenService expoPushTokenService;

    @PostMapping("save")
    public void save(@RequestBody ExpoPushToken expoPushToken) {
        expoPushTokenService.save(expoPushToken);
    }

}
