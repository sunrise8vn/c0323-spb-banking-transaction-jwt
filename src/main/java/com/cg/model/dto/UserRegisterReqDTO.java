package com.cg.model.dto;


import com.cg.model.User;
import com.cg.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class UserRegisterReqDTO {
    private String username;
    private String password;
    private Long roleId;

    public User toUSer(UserRole userRole) {
        return new User()
                .setUsername(username)
                .setPassword(password)
                .setUserRole(userRole)
                ;
    }
}
