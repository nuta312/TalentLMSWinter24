package api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends BaseEntity {
    String id;
    String login;
    @JsonProperty(value = "first_name")
    String firstName;
    @JsonProperty(value = "last_name")
    String lastName;
    String email;
    String password;
}

/*
User user = User.builder()
                .id("123")
                .login("userLogin")
                .firstName(null)
                .lastName("Doe")
                .email("user@example.com")
                .password(null)
                .build();
 */
/*

{
  "id": "123",
  "login": "userLogin",
  "last_name": "Doe",
  "email": "user@example.com"
}

{
  "id": "123",
  "login": "userLogin",
  "first_name": null,
  "last_name": "Doe",
  "email": "user@example.com",
  "password": null
}

 */