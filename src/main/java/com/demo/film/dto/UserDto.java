package com.demo.film.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto implements Serializable {
    private Integer id;
    @NotBlank(message = "username not blank")
    private String username;
    @NotBlank(message = "password not blank")
    private Integer roleId;
    private RoleDto role;
}
