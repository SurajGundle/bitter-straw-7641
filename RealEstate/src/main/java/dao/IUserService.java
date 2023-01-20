package src.main.java.dao;

import src.main.java.bean.User;

public interface IUserService {

    public User login(User user);

    public User logout(User user);


}
