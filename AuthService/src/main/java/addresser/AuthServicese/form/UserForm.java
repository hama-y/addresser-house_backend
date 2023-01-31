package addresser.AuthServicese.form;

import org.springframework.security.crypto.password.PasswordEncoder;

public class UserForm {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void encrypt(PasswordEncoder encoder){
        this.password = encoder.encode(password);
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

