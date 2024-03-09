# spring3-security-jwt
## For spring Boot 3.1.x
```
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http.csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests(auth ->
                    auth.requestMatchers("/product/welcome", "/user/add").permitAll()
                            .requestMatchers("/product/**")
                            .authenticated()
            )
            .httpBasic(Customizer.withDefaults()).build();
}
```
