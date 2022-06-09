package com.assignment.springbootcrud.dao.company;

import org.springframework.stereotype.Repository;

import com.assignment.springbootcrud.dao.generic.GenericDaoImpl;
import com.assignment.springbootcrud.entity.company.CompanyBean;

@Repository
public class CompanyDaoImpl extends GenericDaoImpl<CompanyBean, String> implements CompanyDao {
}
