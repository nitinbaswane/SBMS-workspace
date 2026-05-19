package com.nb.service;

import com.nb.entity.UserInfo;
import com.nb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired(required = true)
    private UserRepo userRepo;

    UserService(){

    }

    public String test(){
        return userRepo.getClass().getName();
    }

    public void saveUser(){
        UserInfo u= new UserInfo();
        u.setUserid(111);
        u.setName("ram");
        u.setAge(25);
        u.setGender("male");
        u.setCity("pune");

        userRepo.save(u);

    }

    public void saveAllUsers(){
        UserInfo u1 = new UserInfo();
        u1.setUserid(101);
        u1.setName("Rahul");
        u1.setAge(25);
        u1.setGender("male");
        u1.setCity("Pune");

        UserInfo u2 = new UserInfo();
        u2.setUserid(102);
        u2.setName("Sham");
        u2.setAge(28);
        u2.setGender("male");
        u2.setCity("Nashik");

        UserInfo u3 = new UserInfo();
        u3.setUserid(103);
        u3.setName("Priya");
        u3.setAge(24);
        u3.setGender("female");
        u3.setCity("Mumbai");

        UserInfo u4 = new UserInfo();
        u4.setUserid(104);
        u4.setName("Amit");
        u4.setAge(30);
        u4.setGender("male");
        u4.setCity("Nagpur");

        UserInfo u5 = new UserInfo();
        u5.setUserid(105);
        u5.setName("Sneha");
        u5.setAge(27);
        u5.setGender("female");
        u5.setCity("Aurangabad");

        UserInfo u6 = new UserInfo();
        u6.setUserid(106);
        u6.setName("Rohit");
        u6.setAge(26);
        u6.setGender("male");
        u6.setCity("Kolhapur");

        UserInfo u7 = new UserInfo();
        u7.setUserid(107);
        u7.setName("Pooja");
        u7.setAge(23);
        u7.setGender("female");
        u7.setCity("Solapur");

        UserInfo u8 = new UserInfo();
        u8.setUserid(108);
        u8.setName("Karan");
        u8.setAge(31);
        u8.setGender("male");
        u8.setCity("Satara");

        UserInfo u9 = new UserInfo();
        u9.setUserid(109);
        u9.setName("Neha");
        u9.setAge(29);
        u9.setGender("female");
        u9.setCity("Sangli");

        UserInfo u10 = new UserInfo();
        u10.setUserid(110);
        u10.setName("Vikas");
        u10.setAge(32);
        u10.setGender("male");
        u10.setCity("Jalgaon");
        List<UserInfo> list = Arrays.asList(u1, u2,u3,u4,u5,u6,u7,u8,u9,u10);
        userRepo.saveAll(list);
    }

    public void getUsers(){
        Iterable<UserInfo> all = userRepo.findAll();
        all.forEach(System.out::println);
    }

    public void getUserById(Integer id){
        Optional<UserInfo> byId = userRepo.findById(id);
        byId.ifPresent(System.out::println);
    }

    public void getUsersById(){
        List<Integer> list = Arrays.asList(101, 103);
        Iterable<UserInfo> allById = userRepo.findAllById(list);
        allById.forEach(System.out::println);
    }

    public void getRecordCount(){
        System.out.println( userRepo.count());;
    }

    public void isExist(){
        System.out.println( "102 exist:: "+ userRepo.existsById(102));
    }

    public void deleteUser(Integer i){
        userRepo.deleteById(i);
    }

    public void deleteUsersById(){
userRepo.deleteAllById(Arrays.asList(102,103));
    }

    public void getUserByGender(){
        List<UserInfo> male = userRepo.findUserInfoByGender("male");
        male.forEach(System.out::println);

    }
    public void getUserByGenderandcity(){
        List<UserInfo> male = userRepo.findUserInfoByGenderAndCity("male","pune");
        male.forEach(System.out::println);

    }

    public void getUserInfoAgeGreaaterThan(){
        List<UserInfo> male = userRepo.findUserInfoByAgeGreaterThanEqual(28);
        male.forEach(System.out::println);

    }

    public void getAllDataWithQuery(){
        List<UserInfo> male = userRepo.getData2();
        male.forEach(System.out::println);

    }

    public void deleteUser(){
        userRepo.deleteUser(111);
    }
}
