create table application
(
    application_id bigserial primary key
        constraint application_client_id_clientid_fk
            references client (client_id),
    create_date date not null,
    code_word text,
    status_application text
);