package com.example.address.book.repository;

import com.example.address.book.entity.AddressBook;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xxx
 * @version 1.0 2017/12/29.
 */
@Repository
public interface AddressBookRepository extends PagingAndSortingRepository<AddressBook, Long> {
}
