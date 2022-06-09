package com.assignment.springbootcrud.service.company;

import com.assignment.springbootcrud.entity.company.CompanyBean;

public interface CompanyService {

    String createCompany(CompanyBean companyBean);

    CompanyBean getCompany(String companyId);

    String deleteCompany(String companyId);

    String updateCompany(CompanyBean companyBean);
}
