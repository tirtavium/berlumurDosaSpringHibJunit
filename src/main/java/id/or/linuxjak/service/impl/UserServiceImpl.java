package id.or.linuxjak.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.or.linuxjak.domain.User;
import id.or.linuxjak.service.UserService;
import id.or.linuxjak.service.common.ServiceHelperImpl;

@Service("userService")
@Transactional
public class UserServiceImpl extends ServiceHelperImpl<User> implements UserService{

}
