package com.allen.service.Impl;

import com.allen.dao.ContactDetailMapper;
import com.allen.pojo.ContactDetail;
import com.allen.service.ContactDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ifree
 */
@Service
public class ContactDetailServiceImpl implements ContactDetailService {
    private ContactDetailMapper contactDetailMapper;

    @Autowired
    @Qualifier("contactDetailMapper")
    public void setContactDetailMapper(ContactDetailMapper contactDetailMapper) {
        this.contactDetailMapper = contactDetailMapper;
    }

    @Override
    public int addContactDetail(ContactDetail contactDetail) {
        return contactDetailMapper.addContactDetail(contactDetail);
    }

    @Override
    public int deleteContactDetail(int id) {
        return contactDetailMapper.deleteContactDetail(id);
    }

    @Override
    public int updateContactDetail(ContactDetail contactDetail) {
        return contactDetailMapper.updateContactDetail(contactDetail);
    }

    @Override
    public ContactDetail queryContactDetailByID(int id) {
        return contactDetailMapper.queryContactDetailByID(id);
    }

    @Override
    public List<ContactDetail> queryAllContactDetail() {
        return contactDetailMapper.queryAllContactDetail();
    }
}
