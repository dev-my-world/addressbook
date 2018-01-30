package com.example.address.book.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author xxx
 * @version 1.0 2017/12/31.
 */
@Entity
@Data
@Table(name = "addressbook")
public class AddressBook {
    @Id()
    @GeneratedValue()
    @Column(name = "addressbookid")
    private Long addressBookId;
    private String surname;
    private String name;
    private String company;
    private String phoneNumber;
    private String email;
    private String address;
    private String remark;

}
