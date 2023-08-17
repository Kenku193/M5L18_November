package com.example.m5l18_example.configuration;

public class SpringSecurityOld// extends WebSecurityConfigurerAdapter
{

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("boss")
//                .password("pass")
//                .roles("ADMIN")
//                .and()
//                .withUser("subBoss")
//                .password("subPass")
//                .roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeRequests()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/users").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/guest").permitAll()
//                .antMatchers("/").permitAll()
//                .and().formLogin();
//
//    }
//
//    @Bean
//    public PasswordEncoder encoder() {return NoOpPasswordEncoder.getInstance();}

}
