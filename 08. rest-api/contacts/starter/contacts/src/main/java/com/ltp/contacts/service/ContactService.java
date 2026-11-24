package com.ltp.contacts.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.ltp.contacts.pojo.Contact;
import com.ltp.contacts.repository.ContactRepository;

public interface ContactService {
    Contact getContactById(String id);

    void saveContact(Contact contact);

    void updateContact(String id, Contact contact);

    void deleteContact(String id);

    List<Contact> getContacts();
}
