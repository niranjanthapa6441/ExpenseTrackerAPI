package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User.Registration;

import com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User.Registration.RegistrationToken.Status;
import com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class RegistrationController {
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    @PostMapping("/register")
    public Status register(@RequestBody RegistrationRequest registrationRequest){
         return registrationService.register(registrationRequest);
    }
    @GetMapping(path = "/register/confirm")
    public Status confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
