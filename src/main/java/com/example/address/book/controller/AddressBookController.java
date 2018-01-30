package com.example.address.book.controller;

import com.example.address.book.entity.AddressBook;
import com.example.address.book.service.AddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xxx
 * @version 1.0 2017/12/29.
 */
@Controller
@Slf4j
public class AddressBookController {
    @Autowired
    private AddressBookService addressBookService;

    @GetMapping("/{addressBookId}")
    public AddressBook getAddressBook(@PathVariable Long addressBookId) {
        return addressBookService.getAddressBook(addressBookId);
    }


    @GetMapping("/list")
    public ModelAndView index(@RequestParam(value = "page", defaultValue = "1") Integer page,
                              @RequestParam(value = "size", defaultValue = "10") Integer size,
                              ModelMap modelMap) {

        PageRequest request = new PageRequest(page - 1, size);
        Page<AddressBook> addressBookPage = addressBookService.listAddressBook(request);
        modelMap.put("addressBookPage", addressBookPage);
        modelMap.put("currentPage", page);
        modelMap.put("size", size);
        return new ModelAndView("addressbook/list", modelMap);
    }

    @GetMapping("/delete/{addressBookId}")
    public ModelAndView removeAddressBook(@PathVariable Long addressBookId, ModelMap modelMap) {
        addressBookService.removeAddressBook(addressBookId);
        modelMap.addAttribute("url", "/addressbook/list");
        return new ModelAndView("common/success", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView saveAddressBook(AddressBook addressBook, ModelMap modelMap) {
        addressBookService.saveAddressBook(addressBook);
        modelMap.addAttribute("url", "/addressbook/list");
        return new ModelAndView("common/success", modelMap);
    }

    @GetMapping("/add")
    public String addAddressBook() {
        return "addressbook/addressbook";
    }

    @GetMapping("/detail/{addressBookId}")
    public ModelAndView addressBookDetail(@PathVariable("addressBookId") Long addressBookId, ModelMap modelMap) {
        AddressBook addressBook = addressBookService.getAddressBook(addressBookId);
        modelMap.addAttribute("addressBook", addressBook);
        return new ModelAndView("addressbook/addressbook", modelMap);
    }
}
