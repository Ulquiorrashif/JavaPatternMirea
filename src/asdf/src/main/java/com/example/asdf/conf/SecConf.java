package com.example.asdf.conf;//package com.example.asdf.conf;


import com.example.asdf.service.CustomeUserDetailsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



//@RequiredArgsConstructor


@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class SecConf  {
//    final  private CustomeUserDetailsService customeUserDetailsService;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customeUserDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().cors().disable()
//                .authorizeRequests()
//
//                .antMatchers("/login", "/reg")
//                .permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .passwordParameter("password")
//                .usernameParameter("username")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder()
//    {
//        return  new BCryptPasswordEncoder(8);
//    }
//    private final CustomeUserDetailsService cususerdetserv;
////
//    private final AuthenticationConfiguration configuration;
////    private final PasswordEncod
////    er pass;
//
//
//    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable().cors().disable().authorizeRequests(auth->{a})
//                .antMatchers("/login")
//                .permitAll().anyRequest().authenticated()
//                .and()
//                    .formLogin()
//                    .loginPage("/login")
//                .and()
//                    .logout()
//                    .permitAll();
//        return http.build();
//    }
//
//
//    @Bean
//    AuthenticationManager authenticationManager() throws Exception {
//        return configuration.getAuthenticationManager();
//    }
//    @Autowired
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(daoAuthenticationProvider());
//    }
//    @Bean
//    public PasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder(8);
//    }
//    public DaoAuthenticationProvider daoAuthenticationProvider(){
//       ;
//       DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//       daoAuthenticationProvider.setPasswordEncoder(pass);
//       daoAuthenticationProvider.setUserDetailsService(cususerdetserv);
//       return daoAuthenticationProvider;
//    }

//
////    Хоть что-то работало
    private final CustomeUserDetailsService userDetailService;
//    private final AuthenticationManagerBuilder auth;
    @Bean
    protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/login","/reg").permitAll()


                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .passwordParameter("password")
                        .usernameParameter("username")

                        .permitAll()
                )
                .logout((logout) -> logout.permitAll())
//                .authenticationProvider(authenticationProvider())
//                .userDetailsService(userDetailService)
        ;


        return http.build();
    }

//    public void configure() throws Exception {
//        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
//    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        final DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return  authenticationProvider;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(8);
    }





}

