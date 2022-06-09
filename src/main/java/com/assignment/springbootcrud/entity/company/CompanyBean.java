package com.assignment.springbootcrud.entity.company;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")

public class CompanyBean implements Serializable {

    private static final long serialVersionUID = -1958388098560050124L;

    @Id
    @Column(name = "COMPANY_ID")
    private String companyId;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "CREATE_BY")
    private String createBy;
}