package ie.atu.registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/confirm")
    public String confDetails(@RequestBody UserDetails userDetails){
        return (String.format("Thanks %s, We got your details with the following email: %s", userDetails.getName(), userDetails.getEmail()));
    }
}
