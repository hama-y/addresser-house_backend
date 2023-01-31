package addresser.AuthServicese.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static addresser.AuthServicese.support.SecurityConstants.SIGNUP_URL;

@RestController
public class JWTController {
    @GetMapping(value = "/public")
    public String publicApi() {
        return "this is public";
    }

    @GetMapping(value = "/private")
    public String privateApi() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // JWTAuthenticationFilter#successfulAuthenticationで設定したusernameを取り出す
        String username = (String) (authentication.getPrincipal());

        return "this is private for " + username;
    }
    @GetMapping(value = SIGNUP_URL)
    public String signup() {
        return "SIGNUP_URL!!";
    }
}
