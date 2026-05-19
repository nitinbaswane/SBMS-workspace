package com.nb.service;

import com.nb.entity.UserInfo;
import com.nb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public void getAllUserSorted(){
        Sort sort = Sort.by("age","city").ascending();
        List<UserInfo> all = userRepo.findAll(sort);
        all.forEach(System.out::println);
    }

    public  void getUsersByPagination(){
        Integer pageNo=3;
        Integer pageRecords=4;
        PageRequest pageRequest = PageRequest.of(pageNo-1, pageRecords);

        Page<UserInfo> all = userRepo.findAll(pageRequest);
        all.forEach(System.out::println);
    }
}
