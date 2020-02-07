package com.lwh.elasticsearch.xunwu.repository;

import com.lwh.elasticsearch.xunwu.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lwh
 * @date 2020-02-06
 * @desp
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
