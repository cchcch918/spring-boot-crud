package com.assignment.springbootcrud.service.company;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assignment.springbootcrud.dao.company.CompanyDao;
import com.assignment.springbootcrud.entity.company.CompanyBean;

import javax.inject.Inject;

@Service
@Transactional
class CompanyServiceImpl implements CompanyService {

    private final String SUCCESS_MESSAGE = "SUCCESS";

    @Inject
    CompanyDao companyDao;

    @Override
    public String createCompany(CompanyBean companyBean) {
        companyDao.add(companyBean);
        return SUCCESS_MESSAGE;
    }

    @Override
    public CompanyBean getCompany(String companyId) {
        return companyDao.get(companyId);
    }

    @Override
    public String deleteCompany(String companyId) {
        companyDao.delete(companyId);
        return SUCCESS_MESSAGE;
    }

    @Override
    public String updateCompany(CompanyBean companyBean) {
        companyDao.update(companyBean);
        return SUCCESS_MESSAGE;
    }

}
