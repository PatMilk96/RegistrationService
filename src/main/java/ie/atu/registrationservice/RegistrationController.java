package ie.atu.registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private final NotificationServiceClient notificationServiceClient;

    @Autowired
    public RegistrationController(NotificationServiceClient notificationServiceClient){
        this.notificationServiceClient = notificationServiceClient;
    }

    @PostMapping("/confirm")
    public String confDetails(@RequestBody UserDetails userDetails){
        String notification = notificationServiceClient.notification(userDetails);
        return (String.format("Thanks %s, We got your details with the following email: %s", userDetails.getName(), userDetails.getEmail() + "\n" + notification));
    }
}
