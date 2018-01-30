package com.example.address.book.service.impl;

import com.example.address.book.entity.AddressBook;
import com.example.address.book.repository.AddressBookRepository;
import com.example.address.book.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author xxx
 * @version 1.0 2017/12/29.
 */
@Service
public class AddressBookServiceImpl implements AddressBookService {

    private AddressBookRepository addressBookRepository;

    @Autowired
    AddressBookServiceImpl(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    /**
     * 保存一个AddressBook
     */
    @Override
    public void saveAddressBook(AddressBook addressBook) {
        addressBookRepository.save(addressBook);
    }

    /**
     * 删除一个AddressBook
     */
    @Override
    public void removeAddressBook(Long addressBookId) {
        addressBookRepository.delete(addressBookId);
    }

    /**
     * 获取一个AddressBook
     *
     * @return Address
     */
    @Override
    public AddressBook getAddressBook(Long addressBookId) {
        return addressBookRepository.findOne(addressBookId);
    }


    /**
     * 获取多个AddressBook
     *
     * @param pageable 分页
     * @return 多个AddressBook
     */
    @Override
    public Page<AddressBook> listAddressBook(Pageable pageable) {
        Page<AddressBook> addressBookPage = addressBookRepository.findAll(pageable);
        return new PageImpl<AddressBook>(addressBookPage.getContent(), pageable, addressBookPage.getTotalElements());
    }

}
