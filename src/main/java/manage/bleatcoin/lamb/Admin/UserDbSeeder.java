package manage.bleatcoin.lamb.Admin;

import manage.bleatcoin.lamb.Admin.entities.Credentials;
import manage.bleatcoin.lamb.Admin.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
public class UserDbSeeder implements CommandLineRunner {

    @Autowired
    IUserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // --- Database seeding complete. Do nothing. ---
    }
}
