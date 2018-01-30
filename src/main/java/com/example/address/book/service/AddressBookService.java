package com.example.address.book.service;

import com.example.address.book.entity.AddressBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author xxx
 * @version 1.0 2017/12/29.
 */
public interface AddressBookService {


    /**
     * 保存一个AddressBook
     *
     * @param addressBook addressBook
     */
    void saveAddressBook(AddressBook addressBook);

    /**
     * 删除一个AddressBook
     *
     * @param addressBookId addressBookId
     */


    void removeAddressBook(Long addressBookId);

    /**
     * 获取一个AddressBook
     *
     * @param addressBookId addressBookId
     * @return Address
     */


    AddressBook getAddressBook(Long addressBookId);


    /**
     * 获取多个AddressBook
     *
     * @param pageable 分页
     * @return 多个AddressBook
     */

    Page<AddressBook> listAddressBook(Pageable pageable);
}
