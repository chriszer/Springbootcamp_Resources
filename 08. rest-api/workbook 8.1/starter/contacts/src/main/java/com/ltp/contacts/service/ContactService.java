package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.exception.NoContactExeception;
import com.ltp.contacts.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id) throws NoContactExeception;

    void saveContact(Contact contact);

    void updateContact(String id, Contact contact) throws NoContactExeception;

    void deleteContact(String id) throws NoContactExeception;

    List<Contact> getContacts();
}
