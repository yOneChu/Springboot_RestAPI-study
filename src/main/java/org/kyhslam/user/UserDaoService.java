package org.kyhslam.user;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1, "AAA", new Date()));
        users.add(new User(2, "BBB", new Date()));
        users.add(new User(3, "CCC", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(user.getId() == null) {
            user.setId(++usersCount);
        }

        users.add(user);
        return user;
    }


    public User findOne(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    
    public User deleteById(int id) {
        for (User user : users) {
            if(user.getId() == id){
                users.remove(user);
                return user;
            }
        }

        return null;
    }
}
