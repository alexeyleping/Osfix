create table client
(
    client_id      bigserial primary key,
    client_name    text not null,
    web_site         text,
    client_comment text
);