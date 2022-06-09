package com.assignment.springbootcrud.controller.company;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springbootcrud.entity.company.CompanyBean;
import com.assignment.springbootcrud.service.company.CompanyService;

import javax.inject.Inject;

@RestController
@RequestMapping("rest/company")

public class CompanyRestController {

    @Inject
    private CompanyService companyService;

    @RequestMapping(value = "/create-company", method = RequestMethod.POST)
    public String createCompany(@RequestBody CompanyBean companybean) {
        return companyService.createCompany(companybean);
    }

    @RequestMapping(value = "/get-company-by-id", method = RequestMethod.GET)
    public CompanyBean getCompanyById(@RequestParam String companyId) {
        return companyService.getCompany(companyId);
    }

    @RequestMapping(value = "/update-company", method = RequestMethod.POST)
    public String updateCompany(@RequestBody CompanyBean companybean) {
        return companyService.updateCompany(companybean);
    }

    @RequestMapping(value = "/delete-company-by-id", method = RequestMethod.POST)
    public String deleteCompany(@RequestParam String companyId) {
        return companyService.deleteCompany(companyId);
    }

}
