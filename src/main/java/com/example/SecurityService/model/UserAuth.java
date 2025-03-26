package com.example.SecurityService.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserAuth {
    private String userName;
    private String password;
}
