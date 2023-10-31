 -- drop table if exists tb_emails;
 create table if not exists tb_emails (
        status_email tinyint check (status_email between 0 and 2),
        send_date_email timestamp(6),
        email_id uuid not null,
        user_id uuid,
        email_body TEXT,
        email_from varchar(255),
        email_to varchar(255),
        subject varchar(255),
        primary key (email_id)
    )