package com.rodrigolorandi.crudStudy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.io.Serializable;

//@Entity
//@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String password;

}
