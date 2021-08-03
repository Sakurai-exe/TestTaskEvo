package com.example.testtaskforevotor.service;

import com.example.testtaskforevotor.model.User;
import com.example.testtaskforevotor.repository.UserFindRepo;
import com.example.testtaskforevotor.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Оболочка для приема запросов из вне и будет дергать репозиторный метод...
@Service
public class UserService {
    private static  UserFindRepo userFindRepo;
    private static UserRepository userRepository;

    public UserService(UserRepository userRepository, UserFindRepo userFindRepo) {
        this.userRepository = userRepository;
        this.userFindRepo = userFindRepo;
    }


    public User findById(Long id){
return userRepository.getOne(id);
    }
//    public List<User> findAll(){return userRepository.findAll();
//    }  //

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteById(Long id){
         userRepository.deleteById(id);
    }


    public List<User> findByName(String name) {
       return userFindRepo.findByNameLike("%"+name+"%");
    }

}
