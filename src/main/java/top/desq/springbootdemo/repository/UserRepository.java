package top.desq.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.desq.springbootdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
