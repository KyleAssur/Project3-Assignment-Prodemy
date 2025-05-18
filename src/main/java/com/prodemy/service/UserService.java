package com.prodemy.service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }
        user.setPassword_hash(BCrypt.hashpw(user.getPassword_hash(), BCrypt.gensalt()));
        return userRepository.save(user);
    }
}
