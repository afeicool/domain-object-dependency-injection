package com.example.dodi;

import org.springframework.stereotype.Repository;

/**
 * @author afei
 * @date 2018/11/27
 */
@Repository
public class LoveRepositoryImpl implements LoveRepository {

    @Override
    public Person getGirlFriend() {
        return new Person("林青霞", 18);
    }
}
