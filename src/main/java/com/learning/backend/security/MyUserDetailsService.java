package com.learning.backend.security;


import com.learning.backend.model.Employee;
import com.learning.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    private final EmployeeRepository employeeRepository;



    public MyUserDetailsService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Employee employee = employeeRepository.findByEmail(username);

      if (employee == null)
      {
          throw new UsernameNotFoundException("This User Does not exit");
      }

      return new UserPrincipal(employee);
    }
}
