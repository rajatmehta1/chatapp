create database chat_db
use chat_db

create table users (
                          id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
                          user_name VARCHAR(50) NOT NULL,
                          PASSWORD VARCHAR(10) NOT NULL,
                          screen_name VARCHAR(255) NOT NULL,
                          primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table chatgroups (
                       id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
                       name VARCHAR(20) NOT NULL,
                       create_dt TIMESTAMP DEFAULT current_timestamp NOT NULL,
                       owner INTEGER NOT NULL,
                       primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table user_groups (
                            id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
                            group_id INTEGER NOT NULL,
                            user_id INTEGER NOT NULL,
                            role_id INTEGER NOT NULL,
                            primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table roles (
                       id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
                       name VARCHAR(20) NOT NULL,
                       description VARCHAR(255) NULL,
                       primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
