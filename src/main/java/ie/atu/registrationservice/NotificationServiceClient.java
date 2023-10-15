package ie.atu.registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient
public interface NotificationServiceClient {
    @PostMapping("/notification")
    String notification(@RequestBody UserDetails userDetails);
}
