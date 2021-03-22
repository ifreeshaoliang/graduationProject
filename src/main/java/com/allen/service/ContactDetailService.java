package com.allen.service;

import com.allen.pojo.ContactDetail;


import java.util.List;

public interface ContactDetailService {
    int addContactDetail(ContactDetail contactDetail);

    int deleteContactDetail(int id);

    int updateContactDetail(ContactDetail contactDetail);

    ContactDetail queryContactDetailByID(int id);

    List<ContactDetail> queryAllContactDetail();
}
