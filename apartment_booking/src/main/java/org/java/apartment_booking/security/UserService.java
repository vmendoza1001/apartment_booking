package org.java.apartment_booking.security;
import org.java.apartment_booking.security.User;
public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
