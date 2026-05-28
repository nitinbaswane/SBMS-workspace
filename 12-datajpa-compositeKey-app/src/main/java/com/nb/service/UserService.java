package com.nb.service;

import com.nb.entity.UserId;
import com.nb.entity.UserInfo;
import com.nb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public void saveData(){
        UserInfo u1 = new UserInfo();
        UserId userId1 = new UserId();
        userId1.setUserid(101);
        userId1.setName("Rahul");
        u1.setUserId(userId1);
        u1.setAge(25);
        u1.setGender("male");
        u1.setCity("Pune");


        UserInfo u2 = new UserInfo();
        UserId userId2 = new UserId();
        userId2.setUserid(102);
        userId2.setName("Sneha");
        u2.setUserId(userId2);
        u2.setAge(23);
        u2.setGender("female");
        u2.setCity("Mumbai");


        UserInfo u3 = new UserInfo();
        UserId userId3 = new UserId();
        userId3.setUserid(103);
        userId3.setName("Amit");
        u3.setUserId(userId3);
        u3.setAge(28);
        u3.setGender("male");
        u3.setCity("Nashik");


        UserInfo u4 = new UserInfo();
        UserId userId4 = new UserId();
        userId4.setUserid(104);
        userId4.setName("Priya");
        u4.setUserId(userId4);
        u4.setAge(24);
        u4.setGender("female");
        u4.setCity("Nagpur");


        UserInfo u5 = new UserInfo();
        UserId userId5 = new UserId();
        userId5.setUserid(105);
        userId5.setName("Karan");
        u5.setUserId(userId5);
        u5.setAge(30);
        u5.setGender("male");
        u5.setCity("Delhi");


        UserInfo u6 = new UserInfo();
        UserId userId6 = new UserId();
        userId6.setUserid(106);
        userId6.setName("Neha");
        u6.setUserId(userId6);
        u6.setAge(27);
        u6.setGender("female");
        u6.setCity("Hyderabad");


        UserInfo u7 = new UserInfo();
        UserId userId7 = new UserId();
        userId7.setUserid(107);
        userId7.setName("Vikram");
        u7.setUserId(userId7);
        u7.setAge(29);
        u7.setGender("male");
        u7.setCity("Bangalore");


        UserInfo u8 = new UserInfo();
        UserId userId8 = new UserId();
        userId8.setUserid(108);
        userId8.setName("Anjali");
        u8.setUserId(userId8);
        u8.setAge(22);
        u8.setGender("female");
        u8.setCity("Chennai");


        UserInfo u9 = new UserInfo();
        UserId userId9 = new UserId();
        userId9.setUserid(109);
        userId9.setName("Rohit");
        u9.setUserId(userId9);
        u9.setAge(31);
        u9.setGender("male");
        u9.setCity("Kolkata");


        UserInfo u10 = new UserInfo();
        UserId userId10 = new UserId();
        userId10.setUserid(110);
        userId10.setName("Pooja");
        u10.setUserId(userId10);
        u10.setAge(26);
        u10.setGender("female");
        u10.setCity("Ahmedabad");

        List<UserInfo> listofusers=List.of(u1,u2,u3,u4,u5,u6,u7,u8,u9,u10);
        userRepo.saveAll(listofusers);
    }

    public void updateData(){
        UserInfo u1 = userRepo.findById(101).orElseThrow(() -> new RuntimeException("user not found"));
//
        u1.setAge(28);
        u1.setGender("male");
        u1.setCity("Chakur");
        userRepo.save(u1);

    }

}
