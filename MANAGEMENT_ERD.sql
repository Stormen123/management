/* Drop Tables */
drop table admin cascade constraints;
drop table amount cascade constraints;
drop table content cascade constraints;
drop table common cascade constraints;
drop table customer cascade constraints;
drop table locker_registration cascade constraints;
drop table locker cascade constraints;
drop table registration cascade constraints;
drop table member cascade constraints;
drop table schedule cascade constraints;


/* Create Tables */
create table admin
(
    admin_code     varchar2(2)         not null,
    admin_id       varchar2(20)        not null unique,
    admin_password varchar2(15)        not null,
    admin_name     varchar2(30),
    admin_grade    varchar2(15)        not null,
    admin_check    char(1) default 'Y' not null,
    primary key (admin_code)
);


create table amount
(
    amt_code   varchar2(2)  not null,
    amt_grade  varchar2(25) not null,
    amt_item   varchar2(15) not null,
    amt_day    varchar2(25) not null,
    amt_month  varchar2(10) not null,
    amt_amount varchar2(6)  not null,
    primary key (amt_code)
);


create table common
(
    com_code varchar2(2) not null,
    com_name varchar2(9) not null,
    primary key (com_code)
);


create table content
(
    com_code    varchar2(2)  not null,
    cont_detail varchar2(2)  not null,
    cont_name   varchar2(25) not null,
    cont_rank   varchar2(2),
    primary key (com_code, cont_detail)
);


create table customer
(
    cstmr_code     varchar2(5)         not null,
    cstmr_id       varchar2(20)        not null unique,
    cstmr_password varchar2(15)        not null,
    cstmr_name     varchar2(30)        not null,
    cstmr_adres    varchar2(80)        not null,
    cstmr_mail     varchar2(40)        not null unique,
    cstmr_phone    varchar2(13)        not null,
    cstmr_brthdy   varchar2(8)         not null,
    cstmr_sexdstn  varchar2(6)         not null,
    admin_check    char(1) default 'N' not null,
    primary key (cstmr_code)
);


create table locker
(
    loc_no  varchar2(3)         not null,
    loc_use char(1) default 'N' not null,
    primary key (loc_no)
);


create table locker_registration
(
    loc_no     varchar2(3) not null,
    lr_regdate varchar2(8) not null,
    mber_code  varchar2(7) not null,
    lr_str     varchar2(8) not null,
    lr_end     varchar2(8) not null,
    primary key (loc_no, lr_regdate)
);


create table member
(
    mber_code    varchar2(7)  not null,
    mber_nm      varchar2(30) not null,
    mber_grade   varchar2(25) not null,
    mber_phone   varchar2(13) not null,
    mber_brthdy  varchar2(6)  not null,
    mber_sexdstn varchar2(6)  not null,
    mber_note    varchar2(150),
    primary key (mber_code)
);


create table registration
(
    mber_code        varchar2(7)         not null,
    regist_regdate   varchar2(8)         not null,
    sch_code         varchar2(2)         not null,
    regist_state     varchar2(9)         not null,
    regist_str       varchar2(8)         not null,
    regist_end       varchar2(8)         not null,
    regist_month     varchar2(7)         not null,
    regist_amount    varchar2(7)         not null,
    regist_note      varchar2(150),
    regist_refnd     char(1) default 'N' not null,
    regist_refnddate varchar2(8),
    primary key (mber_code, regist_regdate)
);


create table schedule
(
    sch_code   varchar2(2)         not null,
    sch_item   varchar2(15)        not null,
    sch_class  varchar2(15)        not null,
    sch_time   varchar2(11)        not null,
    sch_day    varchar2(25)        not null,
    sch_psncpa varchar2(2)         not null,
    sch_open   char(1) default 'Y' not null,
    primary key (sch_code)
);


/* Create Foreign Keys */
alter table content
    add foreign key (com_code)
        references common (com_code)
;


alter table locker_registration
    add foreign key (loc_no)
        references locker (loc_no)
;


alter table locker_registration
    add foreign key (mber_code)
        references member (mber_code)
;


alter table registration
    add foreign key (mber_code)
        references member (mber_code)
;


alter table registration
    add foreign key (sch_code)
        references schedule (sch_code)
;
