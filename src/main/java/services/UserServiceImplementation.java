package services;

import data.model.User;
import data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{
   @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listOfUsers() {
        return userRepository.findAll();
    }
}
