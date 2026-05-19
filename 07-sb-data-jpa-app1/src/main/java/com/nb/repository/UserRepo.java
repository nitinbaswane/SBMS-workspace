package com.nb.repository;

import com.nb.entity.UserInfo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<UserInfo, Integer> {


///    findBy<XXX>
    public List<UserInfo> findUserInfoByGender(String s);
    public List<UserInfo> findUserInfoByGenderAndCity(String s,String v);
    public List<UserInfo> findUserInfoByAgeGreaterThanEqual(Integer age);


///    custom query
    @Query(value="select * from user_info",nativeQuery = true)
    public List<UserInfo> getData1();

    @Query(value = "from UserInfo")
    public List<UserInfo> getData2();

    @Transactional
    @Modifying
    @Query("delete from UserInfo where userid = :uid")
    public  void deleteUser(Integer uid);


}
