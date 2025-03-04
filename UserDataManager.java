package com.userdata;
import java.util.ArrayList;
import java.util.List;

public class UserDataManager {
    private List<User> users = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }
    public void displayUsers(){
        for(User user : users){
            System.out.println(user.getName());
        }
    }
}
